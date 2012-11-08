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
			appendDo( newIfDo );
		}
	}
	
	public void connectElseDo( Doable newElseDo ){
		if( elseDo == null ){
			elseDo = newElseDo;
			appendDo( newElseDo );
		}
	}
	String getDidTestRegName(){    return getUniqueName() + "_DidTestReg"; }
	String getPassedTestRegName(){ return getUniqueName() + "_TestPassedReg"; }
	
	@Override
	public String getChildNum(Doable child) {
		String result = "";
	
		if( child == ifDo ){
			result = "ifDo";
		}else if( child == elseDo ){
			result = "elseDo";
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
		
		//TODO: want to update this with the k-maps I have created.
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " )begin\n";
		result += indent + "   " + getDidTestRegName() + " <= #1 0;\n";
		result += indent + "end else begin\n";
		result += indent + "   if( !" + getActiveSignal() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= #1 0;\n";
		result += indent + "   end else if( !" + getDidTestRegName() + " ) begin\n";
		result += indent + "       " + getDidTestRegName() + " <= #1 " + test.getSourceIsReadySignal() + ";\n";
		result += indent + "   end else begin\n";
		result += indent + "       " + getDidTestRegName() + " <= #1 !" + getTaskDone() + ";\n";
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
		result += indent + "   end else begin\n";
		result += indent + "       " + getPassedTestRegName() + " <= #1 " + getPassedTestRegName() + " && !" + getTaskDone() + ";\n";
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
		String result = "";
		if( doable == ifDo ){
			result = "(" + getDidTestRegName() + " && " + getPassedTestRegName() + ")";
		}else{
			result = "(" + getDidTestRegName() + " && !" + getPassedTestRegName() + ")";
		}
		return result;
	}
	
	String getTaskDone(){
		String result = "";
		if( elseDo == null ){
			result = "( " + ifDo.getDoneSignal() + " || !" + getPassedTestRegName() + " )";
		}else{
			result = "( " + getPassedTestRegName() + "?" + ifDo.getDoneSignal() + ":" + elseDo.getDoneSignal() + " )";
		}
		return result;
	}
	
	@Override
	String getDoneSignal() { 
		return "(" + getTaskDone() + " && " + getDidTestRegName() + " )";
	}
	@Override
	String getDescribeName() {
		return "if";
	}
	


}
