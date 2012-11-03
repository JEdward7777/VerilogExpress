package verilogExpress;

public class DoIf extends DoBlock implements DataTarget{
	
	DataSource test = null;
	Doable ifDo = null;
	Doable elseDo = null;
	@Override
	public void connectDataSource(DataSource newSource) {
		if( test == null ){
			test = newSource;
			test.connectDataTarget(this);
		}
	}
	
	public void connectIfDo( Doable newIfDo ){
		if( ifDo == null ){
			ifDo = newIfDo;
			ifDo.setParrent(this);
		}
	}
	
	public void connectElseDo( Doable newElseDo ){
		if( elseDo == null ){
			elseDo = newElseDo;
			elseDo.setParrent(this);
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
		result += indent + "   end else if( " + getDoneSignal() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= 0;\n";
		result += indent + "   end\n";
		result += indent + "end\n";
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " )begin\n";
		result += indent + "   " + getPassedTestRegName() + " <= 0;\n";
		result += indent + "end else begin\n";
		result += indent + "   if( " + getActiveSignal() + " && !" + getDidTestRegName() + " && " + test.getSourceIsReadySignal() + " ) begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= " + test.getSourceDataSignal() + "[0];\n";
		result += indent + "   end else if( " + getDoneSignal() + " ) begin\n";
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
		return getActiveSignal() + " && !" + getDidTestRegName();
	}
	@Override
	public String getChildActiveSignal(Doable doable) {
		String result = "";
		if( doable == ifDo ){
			result = "(" + getDidTestRegName() + " && " + getPassedTestRegName() + ")";
		}else{
			result = "(" + getDidTestRegName() + " && !" + getPassedTestRegName() + ")";
		}
		return result;
	}

	@Override
	String getDoneSignal() {
		String result = "";
		if( elseDo == null ){
			result = "(" + getDidTestRegName() + " && " + ifDo.getDoneSignal() + ")";
		}else{
			result = "(" + getDidTestRegName() + " && ( " + getPassedTestRegName() + "?" + ifDo.getDoneSignal() + ":" + elseDo.getDoneSignal() + " ) )";
		}
		return result;
	}
	@Override
	String getDescribeName() {
		return "if";
	}
	


}
