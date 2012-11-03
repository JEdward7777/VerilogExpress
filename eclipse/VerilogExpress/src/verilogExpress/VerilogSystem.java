package verilogExpress;

public class VerilogSystem {
	
	VerilogFileModule topLevel = null;
	
	OutputPort standardOut = null;
	InputPort standardIn = null;
	
	String progName = null;
	
	public VerilogSystem(){
	}
	
	public void setProgName( String newProgName ){
		progName = newProgName;
		if( topLevel != null ){
			topLevel.setModuleName( progName + "_top" );
		}
	}
	
	public void setTopModule( VerilogFileModule newTopModule ){
		topLevel = newTopModule;
		if( progName != null ){
			topLevel.setModuleName( progName + "_top" );
		}
		if( standardOut != null ){
			topLevel.addOutputPort( standardOut );
		}
		if( standardIn != null ){
			topLevel.addInputPort( standardIn );
		}
	}
	
	public VerilogFileModule getTopLevel(){
		if( topLevel == null ) throw new NullPointerException( "Top Level never set in VerilogSystem" );
		return topLevel;
	}

	public DataTarget getStdOut() {
		
		if( standardOut == null ){
			standardOut = new OutputPort( "stdOut" );
			if( topLevel != null ){
				topLevel.addOutputPort( standardOut );
			}
		}
		return standardOut;
	}
	public DataSource getStdIn(){
		if( standardIn == null ){
			standardIn = new InputPort( "stdIn" );
			if( topLevel != null ){
				topLevel.addInputPort( standardIn );
			}
		}
		return standardIn;
	}
}
