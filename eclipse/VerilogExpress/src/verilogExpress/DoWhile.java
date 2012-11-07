package verilogExpress;

public class DoWhile extends DoBlock implements DataTarget{
	
	DataSource test = null;
	Doable whileDo = null;
	@Override
	public void connectDataSource(DataSource newSource) {
		if( test == null ){
			test = newSource;
			test.connectDataTarget(this);
		}
	}
	
	public void connectWhileDo( Doable newWhileDo ){
		if( whileDo == null ){
			whileDo = newWhileDo;
			appendDo( newWhileDo );
		}
	}
	
	String getDidTestRegName(){    return getUniqueName() + "_DidTestReg"; }
	String getPassedTestRegName(){ return getUniqueName() + "_TestPassedReg"; }
	
	@Override
	public String getChildNum(Doable child) {
		String result = "";
	
		if( child == whileDo ){
			result = "whileDo";
		}else{
			throw new NullPointerException( "Unknown child" );
		}
		
		return result;
	}
	
	@Override
	public String genTopCode(String indent) {
		String result = super.genTopCode(indent);
		
		result += indent + "reg " + getDidTestRegName() + ";\n";
		result += indent + "reg " + getPassedTestRegName() + ";\n";

		return result;
	}
	
	
	@Override
	public String genMiddleCode(String indent) throws Exception {
		String result = super.genMiddleCode(indent);
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " )begin\n";
		result += indent + "   " + getDidTestRegName() + " <= #1 0;\n";
		result += indent + "end else begin\n";
		result += indent + "   if( !" + getActiveSignal() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= #1 0;\n";
		result += indent + "   end else if( !" + getDidTestRegName() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= #1 " + test.getSourceIsReadySignal() + ";\n";
		result += indent + "   end else begin\n";
		result += indent + "       " + getDidTestRegName() + " <= #1 " + getPassedTestRegName() + " && " + getDidTestRegName() + " && !" + whileDo.getDoneSignal() + ";\n";
		result += indent + "   end\n";
		result += indent + "end\n";
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " )begin\n";
		result += indent + "   " + getPassedTestRegName() + " <= #1 0;\n";
		result += indent + "end else begin\n";
		result += indent + "   if( !" + getActiveSignal() + " ) begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= #1 0;\n";
		result += indent + "   end else if( !" + getDidTestRegName() + " ) begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= #1 " + test.getSourceIsReadySignal() + " && " + test.getSourceDataSignal() + ";\n";
		result += indent + "   end else if( " + whileDo.getDoneSignal() + " ) begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= #1 0;\n";
		result += indent + "   end\n";
		result += indent + "end\n";

		return result;
	}
	
	@Override
	public String getTargetAchnolageSignal(DataSource sourceToAchnolage) {
		return getActiveSignal() + " && !" + getDidTestRegName() + " && " + test.getSourceIsReadySignal();
	}
	@Override
	public String getChildActiveSignal(Doable doable) {
		return "(" + getDidTestRegName() + " && " + getPassedTestRegName() + ")";
	}

	@Override
	String getDoneSignal() {
		return "(" + getDidTestRegName() + " && !" + getPassedTestRegName() + ")";
	}
	
	@Override
	String getDescribeName() {
		return "while";
	}
	


}
