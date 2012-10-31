package verilogExpress;

import java.util.HashSet;

public class SequentualDoer extends DoBlock {
	
	static HashSet< String > usedStateVars = new HashSet< String >();
	
	

	@Override
	String getDoneSignal() {
		return listToDo.getLast().getDoneSignal();
	}
	


	@Override
	public String childActiveSignal(Doable doable) {
		return getActiveWireName( doable );
	}

	@Override
	String getActiveSignal() {
		return parrent.childActiveSignal( this );
	}

	private static String getActiveWireName( Doable doable ){ return doable.getUniqueName() + "_IsActiveWire"; }
	private static String getRegName( Doable doable ){ return doable.getUniqueName() + "_Reg"; }
	private static String getParamName( Doable doable ){ return doable.getUniqueName() + "_StateParam"; }
	private static String getResetParamName( Doable doable ){ return doable.getUniqueName() + "_ResetStateParam"; }

	@Override
	public
	String genTopCode(String indent) {
		String result = super.genTopCode(indent);
		

		result += indent + "reg [31:0] " + getRegName( this ) + ";\n";
		

		result += "\n";
		
		int doerCount = 0;
		result += indent + "parameter " + getResetParamName( this ) + " = " + (doerCount++) + ";\n";
		for( Doable doer : listToDo ){
			result += indent + "parameter " + getParamName( doer ) + " = " + (doerCount++) + ";\n";
		}
		
		result += "\n";
		
		for( Doable doable : listToDo ){
			result += indent + "wire " + getActiveWireName( doable ) + ";\n";
		}
		
		return result;
	}


	@Override
	public
	String genMiddleCode(String indent) throws Exception {
		
		if( listToDo.isEmpty() ) throw new Exception( "Nothing todo!" );
		
		String result = super.genMiddleCode( indent );
		
		result += indent + "always @( posedge " + parrent.getClockSignal() + " )\n";
		result += indent + "if( " + parrent.getResetSignal() + " || !( " + parrent.childActiveSignal(this) + ") )begin\n";
		result += indent + "   " + getRegName( this ) + " <= " + getResetParamName(this) + ";\n";
		result += indent + "end else case( " + getRegName( this ) + ")\n";
		result += indent + "   " + getResetParamName(this) + ": begin\n";
		result += indent + "       if( " + parrent.childActiveSignal(this) + " )begin\n";
		result += indent + "          " + getRegName( this ) + " <= " + getParamName( listToDo.getFirst() ) + ";\n";
		result += indent + "       end\n";
		result += indent + "   end\n";
		
		//for( int doableNum = 0; doableNum < listToDo.size(); ++doableNum ){
		//	result += indent + ""
		//}
		
		for( int doableNum = 0; doableNum < listToDo.size(); ++doableNum ){
			Doable doable = listToDo.get( doableNum );
			Doable nextDoable = doableNum < listToDo.size()-1?listToDo.get( doableNum+1 ) : null;


			result+=indent+"   " + getParamName( doable ) + ": begin\n";
			result+=indent+"      if( " + doable.getDoneSignal() + " ) begin\n";
			if( nextDoable != null ){
				result+=indent+"         " + getRegName( this ) + " <= " + getParamName(nextDoable) + ";\n";
			}else{
				//go to reset for a count before we start out again.
				//to give the parent a chance to drop the active signal
				result+=indent+"         " + getRegName( this ) + " <= " + getResetParamName(this) + ";\n";
			}
			result+=indent+"      end\n";
			result+=indent+"   end\n";
		}
		result += indent + "   default: begin\n";
		result += indent + "             " + getRegName( this ) + " <= " + getResetParamName(this) + ";\n";
		result += indent + "   end\n";
		result += indent + "endcase\n";
		
		
		
		return result;
	}


	@Override
	public String genBottomCode(String indent) {
		String result = super.genBottomCode( indent );

		for( Doable doable : listToDo ){
			result += indent + "assign " + getActiveWireName( doable ) + " = (" + getRegName( this ) + " == " + getParamName( doable ) + " );\n";
		}
		return result;
	}


	@Override
	String getDescribeName() {
		return "SequentualDoer";
	}

}
