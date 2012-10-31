package verilogExpress;

import java.util.HashMap;
import java.util.LinkedList;


abstract public class DoBlock extends Doable {
	LinkedList< Doable > listToDo = new LinkedList< Doable >();

	HashMap< String, Variable > variables = new HashMap< String, Variable >();
	
	//todo: Somehow the names of the variables needs to be declared.
	
	public DoBlock(  ){
	}
	
	public void addVarToBlock( Variable newVariable ){
		variables.put( newVariable.getName(), newVariable );
	}
	
	
	public void appendDo(Doable doAssign) {
		listToDo.addLast( doAssign );
		doAssign.setParrent( this );
	}


	abstract public String childActiveSignal(Doable doable);
	
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
		return result;
	}

	@Override
	public String genMiddleCode(String indent) throws Exception {
		String result = "";
		for( Variable v : variables.values() ){
			result += v.genMiddleCode(indent);
		}
		return result;
	}

	@Override
	public String genBottomCode(String indent) {
		String result = "";
		for( Variable v : variables.values() ){
			result += v.genBottomCode(indent);
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
