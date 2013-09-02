package verilogExpress;

public class ParallelDoer extends DoBlock {
	


	@Override
	String getDoneSignal() {
		//will be done when all sub doables are done.
		String result = "";
		boolean isFirst = true;
		for( Doable doer : listToDo ){
			if( !isFirst ){
				result += " && ";
			}else{
				isFirst = false;
			}
			result += "( " + genChildDoneReg( doer ) + " || " + doer.getDoneSignal() + ")";
		}
		result = "(" + result + ")";
		
		
		return result;
	}
	
	
	public String genChildDoneReg( Doable child ){
		return child.getUniqueName() + "_DoneReg";
	}
	
	@Override
	public String genTopCode(String indent) {
		String result = super.genTopCode(indent);
		
		for( Doable child : listToDo ){
			result += indent + "reg " + genChildDoneReg( child ) + ";\n";
		}
		
		return result;
	}
	
	@Override
	public String genMiddleCode(String indent) throws Exception {
		String result = super.genMiddleCode(indent);
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " ) begin\n";
		for( Doable child : listToDo ){
			result+=indent+"   " + genChildDoneReg( child ) + " <= #1 0;\n";
		}
		result += indent + "end else begin\n";
		result += indent + "   if( !" + getActiveSignal() + " || " + getDoneSignal() + " ) begin\n";
		for( Doable child : listToDo ){
			result+=indent+"       " + genChildDoneReg( child ) + " <= #1 0;\n";
		}
		result += indent + "    end else begin\n";
		for( Doable child : listToDo ){
			result+=indent+"       " + genChildDoneReg( child ) + " <= #1 " + genChildDoneReg( child ) + " || " + child.getDoneSignal() + ";\n";
		}
		result += indent + "    end\n";
		result += indent + "end\n";
		

		return result;
	}
	

	@Override
	public String getChildActiveSignal(Doable doable) {
		return "( " + getActiveSignal() +  " && !" + genChildDoneReg( doable ) + " )";
	}


	@Override
	String getDescribeName() {
		return "ParallelDoer";
	}


}
