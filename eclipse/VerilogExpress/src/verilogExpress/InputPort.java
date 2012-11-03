package verilogExpress;

import java.util.LinkedList;

public class InputPort implements DataSource, VerilogCodeSource {
	
	String portName;
	LinkedList< DataTarget > targets = new LinkedList< DataTarget >();
	
	public InputPort( String newPortName ){
		portName = newPortName;
	}

	@Override
	public String getSourceIsReadySignal() { return portName + "IsReadyInput"; }

	@Override
	public String getSourceDataSignal() {    return portName + "DataInput"; }
	
	public String getInputAckSignal(){       return portName + "AckOutput"; }

	public String generateParamList(){
		return getSourceIsReadySignal() + ",\n"
		    +  getSourceDataSignal() + ",\n"
		    + getInputAckSignal();
	}
	
	@Override
	public void connectDataTarget(DataTarget dataTarget) {
		if( !targets.contains(dataTarget ) ){
			targets.add( dataTarget );
			dataTarget.connectDataSource(this);
		}
	}

	@Override
	public String genTopCode(String indent) {
		String result = "";
		result += indent + "input " + getSourceIsReadySignal() + ";\n";
		result += indent + "input [31:0] " + getSourceDataSignal() + ";\n";
		result += indent + "output " + getInputAckSignal() + ";\n";
		return result;
	}

	@Override
	public String genMiddleCode(String indent) throws Exception {
		return "";
	}

	@Override
	public String genBottomCode(String indent) {
		return indent + "assign " + getInputAckSignal() + " = " + getOredTargetsReady() + ";\n";
	}
	
	public String getOredTargetsReady(){

		String result = "";
		
		boolean isFirstSource = true;
		
		for( DataTarget dataTarget : targets ){
			if( !isFirstSource ) result += " || ";
			result += dataTarget.getTargetAchnolageSignal(this);
			isFirstSource = false;
		}
		result = "(" + result + ")";
		
		return result;
	}


}
