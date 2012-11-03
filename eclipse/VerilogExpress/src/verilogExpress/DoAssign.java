package verilogExpress;

//This class is kind of like a pipe.
//but it only takes one source and one target
//and it blocks the transaction until it is active as apart of the Doable
public class DoAssign extends Doable implements DataTarget, DataSource {

	DataSource source = null;
	DataTarget target = null;
	
	

	public DoAssign( DataSource dataSource ) {
		connectDataSource( dataSource );
	}
	
	@Override
	public void connectDataSource(DataSource newSource) {
		if( source == null ){
			source = newSource;
			source.connectDataTarget(this);
		}
	}

	@Override
	public void connectDataTarget(DataTarget dataTarget) {
		if( target == null ){
			target = dataTarget;
			target.connectDataSource(this);
		}
	}


	@Override
	String getDoneSignal() {
		//This state is done as soon as the target acknowledges it got the data
		return target.getTargetAchnolageSignal(this);
	}


	@Override
	public String getSourceIsReadySignal() {
		//our data as a source is ready when we are active.
		//and our source is ready too
		return "(" + getActiveSignal() + " && " + source.getSourceIsReadySignal() + ")";
	}

	@Override
	public String getTargetAchnolageSignal(DataSource sourceToAchnolage) {
		return "(" + getActiveSignal() + " && " + target.getTargetAchnolageSignal( this ) + ")";
	}


	@Override
	String getDescribeName() {
		return "DoAssign";
	}


	@Override
	public String genTopCode(String indent) {
		return ""; //Just wires.
	}


	@Override
	public String genMiddleCode(String indent) throws Exception {
		return ""; //Just wires.
	}


	@Override
	public String genBottomCode(String indent) {
		return ""; //Just wires.
	}

	@Override
	public String getSourceDataSignal() {
		return source.getSourceDataSignal();
	}



}
