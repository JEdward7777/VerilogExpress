package verilogExpress;

import java.util.HashMap;
import java.util.LinkedList;


abstract public class DoBlock extends Doable {
	LinkedList< Doable > listToDo = new LinkedList< Doable >();

	HashMap< String, Variable > variables = new HashMap< String, Variable >();

	
	public void addVarToBlock( Variable newVariable ){
		if( !variables.containsKey( newVariable.getBasename() ) ){
			variables.put( newVariable.getBasename(), newVariable );
			newVariable.setBlock( this );
		}
	}
	
	
	public void appendDo(Doable doAssign) {
		listToDo.addLast( doAssign );
		doAssign.setParrent( this );
	}


	abstract public String getChildActiveSignal(Doable doable);
	
	public String getChildNum( Doable child ){
		return "" + listToDo.indexOf( child );
	}

	public String getClockSignal() {
		return parrent.getClockSignal();
	}
	
	public String getResetSignal() {
		return parrent.getResetSignal();
	}

	@Override
	public String genTopCode(String indent) {
		String result = "";
		for( Variable v : variables.values() ){
			result += v.genTopCode(indent);
		}
		
		
		for( Doable doable : listToDo ){
			//if( doable.getUniqueName().equals( "ModuletestModule_top_SequentualDoer0" ) ){
			//	throw new NullPointerException( "here" );
			//}
			String doableTopCode = doable.genTopCode(indent);
			if( !doableTopCode.equals("") ){
				result += "//Doable " + doable.getUniqueName() + " top code vv \n";
				result += doableTopCode;
				result += "//End of " + doable.getUniqueName() + " top code ^^ \n";
			}
		}
		
		return result;
	}

	@Override
	public String genMiddleCode(String indent) throws Exception {
		String result = "";
		for( Variable v : variables.values() ){
			result += v.genMiddleCode(indent);
		}
		
		for( Doable doable : listToDo ){
			String doableMiddleCode = doable.genMiddleCode(indent);
			if( !doableMiddleCode.equals( "" ) ){
				result += "//Doable " + doable.getUniqueName() + " middle code vv \n";
				result += doableMiddleCode;
				result += "//End of " + doable.getUniqueName() + " middle code ^^ \n";
			}
		}
		
		return result;
	}

	@Override
	public String genBottomCode(String indent) {
		String result = "";
		for( Variable v : variables.values() ){
			result += v.genBottomCode(indent);
		}
		
		for( Doable doable : listToDo ){
			String doableBottomCode = doable.genBottomCode(indent);
			if( !doableBottomCode.equals("") ){
				result += "//Doable " + doable.getUniqueName() + " bottom code vv \n";
				result += doableBottomCode;
				result += "//End of " + doable.getUniqueName() + " bottom code ^^ \n";
			}
		}
		
		return result;
	}
	

	public Variable getVar(String name){
		Variable result = null;
		if( variables.containsKey( name ) ){
			result = variables.get( name );
		}else if( parrent != null ){
			result = parrent.getVar( name );
		}else{
			throw new NullPointerException( "Var \"" + name + "\" is not defined" );
		}
		
		return result;
	}


	
	
}
