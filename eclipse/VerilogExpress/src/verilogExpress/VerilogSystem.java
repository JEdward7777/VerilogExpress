package verilogExpress;

import java.util.LinkedList;

public class VerilogSystem {
	
	VerilogFileModule topLevel = null;
	
	DataTarget standardOut = null;
	
	String name = null;
	
	public VerilogSystem( String newName ){
		name = newName;
		topLevel = new VerilogFileModule( newName + "_top" );
	}
	
	public VerilogFileModule getTopLevel(){
		return topLevel;
	}

	public DataTarget getStdOut() {
		
		if( standardOut == null ){
			standardOut = new OutputPort(topLevel, "stdOut" );
		}
		return standardOut;
	}

	public void setTopLevel(VerilogFileModule verilogFileModule) {
		topLevel = verilogFileModule;
	}

}
