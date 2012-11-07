package verilogExpress;

import java.util.LinkedList;

public class VerilogFileModule extends DoBlock{
	
	//LinkedList<Wire> wires = new LinkedList<Wire>();
	String moduleName = "";
	LinkedList< InputPort >  inputPorts  = new LinkedList< InputPort >();
	LinkedList< OutputPort > outputPorts = new LinkedList< OutputPort >();
	
	public void setModuleName( String newModuleName ){
		moduleName = newModuleName;
	}

	public void setMainBody(Doable mainBody) {
		appendDo( mainBody );
	}

	/*
	public Doable getMainBody() {
		return listToDo.getFirst();
	}*/
	
	//@Override
	String generateSource( String indent ) throws Exception {
		String result = "";
		result += indent + "`timescale 1ns / 1ps\n";
		result += indent + "module " + moduleName + "(\n" ;
		
		for( InputPort inputPort : inputPorts ){
			result += inputPort.generateParamList() + ",\n";
		}
		
		for( OutputPort outputPort : outputPorts ){
			result += outputPort.generateParamList() + ",\n";
		}
		
		result += getClockSignal() + ",\n" 
				+ getResetSignal() + ");\n";
		
		result += indent + "\n";
		
		result += indent + "   input " + getClockSignal() + ";\n";
		result += indent + "   input " + getResetSignal() + ";\n";
		
		result += "\n";
		
		result += genTopCode( indent  );
		result += genMiddleCode( indent );
		result += genBottomCode( indent );
		
		result += "endmodule";
		
		return result;
	}

	@Override
	public String getChildActiveSignal(Doable doable) {
		return "1'b1";
	}


	@Override
	String getDoneSignal() {
		return "1'b0";
	}
	
	@Override
	public String getClockSignal() {
		return "clockInput";
	}
	
	@Override
	public String getResetSignal() {
		return "resetInput";
	}

	@Override
	String getDescribeName() {
		return "Module" + moduleName;
	}
	
	@Override
	public String getUniqueName(){
		return getDescribeName();
	}

	public void addOutputPort(OutputPort outputPort) {
		outputPorts.add( outputPort );
	}
	
	public void addInputPort( InputPort inputPort ){
		inputPorts.add( inputPort );
	}

}
