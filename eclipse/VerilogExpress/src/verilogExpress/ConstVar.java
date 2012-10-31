package verilogExpress;

import java.util.LinkedList;

public class ConstVar  extends Variable {
	String value = "0";
	
	LinkedList< DataTarget > targets = new LinkedList< DataTarget >();
	
	public ConstVar( String name, String newValue, DoBlock doBlock ){
		super( name, doBlock );
		value = newValue;
	}
	@Override
	public String getSourceIsReadySignal() {
		return "1'b1"; //constant is always ready.
	}
	@Override
	public void connectDataTarget(DataTarget dataTarget) {
		if( !targets.contains(dataTarget) ){
			targets.add( dataTarget );
			dataTarget.connectDataSource(this);
		}
	}
	@Override
	public String getSourceDataSignal() {
		return "" + value;
	}
	@Override
	public void connectDataSource(DataSource newSource) {
		throw new NullPointerException( "Can't assign to const " + name );
	}
	@Override
	public String getTargetAchnolageSignal(DataSource sourceToAchnolage) {
		return "0"; //never achnolage recepit of data.
	}
	@Override
	public String genTopCode(String indent) {
		return "";
	}
	@Override
	public String genMiddleCode(String indent) throws Exception {
		return "";
	}
	@Override
	public String genBottomCode(String indent) {
		return "";
	}

}
