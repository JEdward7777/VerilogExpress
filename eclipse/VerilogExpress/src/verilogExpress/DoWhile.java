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
			whileDo.setParrent(this);
		}
	}
	
	String getDidTestRegName(){    return getUniqueName() + "_DidTestReg"; }
	String getPassedTestRegName(){ return getUniqueName() + "_TestPassedReg"; }
	
	@Override
	public String genTopCode(String indent) {
		String result = "";
		result += indent + "reg " + getDidTestRegName() + ";\n";
		result += indent + "reg " + getPassedTestRegName() + ";\n";
		return result;
	}
	
	
	@Override
	public String genMiddleCode(String indent) throws Exception {
		String result = "";
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " )begin\n";
		result += indent + "   " + getDidTestRegName() + " <= 0;\n";
		result += indent + "end else begin\n";
		result += indent + "   if( " + getActiveSignal() + " && " + test.getSourceIsReadySignal() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= 1;\n";
		result += indent + "   end else if( " + whileDo.getDoneSignal() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= 0;\n";
		result += indent + "   end\n";
		result += indent + "end\n";
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " )begin\n";
		result += indent + "   " + getPassedTestRegName() + " <= 0;\n";
		result += indent + "end else begin\n";
		result += indent + "   if( " + getActiveSignal() + " && !" + getDidTestRegName() + " && " + test.getSourceIsReadySignal() + " ) begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= " + test.getSourceDataSignal() + "[0];\n";
		result += indent + "   end else if( " + whileDo.getDoneSignal() + " ) begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= 0;\n";
		result += indent + "   end\n";
		result += indent + "end\n";
		
		return result;
	}
	
	@Override
	public String genBottomCode(String indent) {
		String result = "";
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
