package verilogExpress;

import java.util.LinkedList;

public class RegVar extends Variable {
	String resetValue = "0";
	
	public RegVar(String newName, String newResetValue, DoBlock doBlock ) {
		super(newName, doBlock);
		resetValue = newResetValue;
	}

	LinkedList< DataSource > sources = new LinkedList< DataSource >();
	LinkedList< DataTarget > targets = new LinkedList< DataTarget >();
	
	@Override
	public String genTopCode(String indent) {
		return indent + "reg [31:0] " + name + ";\n";
	}

	@Override
	public String genMiddleCode(String indent) throws Exception {
		if( sources.size() == 0 ) throw new Exception( "No sources for reg " + name );
		
		String result = "";
		result += indent + "always @( posedge " + block.getClockSignal() + " )\n";
		result += indent + "if( " + block.getResetSignal() + " ) begin\n";
		result += indent + "   " + name + " <= " + resetValue + ";\n";
		result += indent + "end else begin\n";
		boolean isFirstSource = true;
		for( DataSource s : sources ){
			if( !isFirstSource ){
				result += indent + "   end else ";
			}else{
				result += indent + "   ";
				isFirstSource = false;
			}
			result += "if( " + s.getSourceIsReadySignal() + " )begin\n";
			//System.err.println( s.getSourceIsReadySignal() );
			result += indent + "      " + name + " <= " + s.getSourceDataSignal() + ";\n";
		}
		result += indent + "   end\n";
		result += indent + "end\n";
		return result;
	}

	@Override
	public String genBottomCode(String indent) {
		return "";
	}

	@Override
	public String getSourceIsReadySignal() {
		//a register is always ready.  No flow control
		return "1'b1";
	}

	@Override
	public void connectDataSource( DataSource dataSource) {
		if( !sources.contains( dataSource ) ){
			sources.add( dataSource );
			dataSource.connectDataTarget(this);
		}
	}

	
	@Override
	public void connectDataTarget(DataTarget dataTarget) {
		if( !targets.contains(dataTarget) ){
			targets.add( dataTarget );
			dataTarget.connectDataSource(this);
		}
	}


	@Override
	public String getTargetAchnolageSignal(DataSource sourceToAchnolage) {
		// always acknowledge
		return "1'b1";
	}

	@Override
	public String getSourceDataSignal() {
		return name;
	}



}