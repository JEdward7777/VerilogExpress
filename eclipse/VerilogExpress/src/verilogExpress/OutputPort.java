package verilogExpress;

import java.util.LinkedList;

public class OutputPort extends Variable implements DataTarget, VerilogCodeSource {

	
	LinkedList< DataSource > sources = new LinkedList< DataSource >();
	
	
	public OutputPort( String newPortName ){
		super( newPortName );
	}
	
	
	public OutputPort(String newPortName, DoBlock currentBlock) {
		super( newPortName );
		setBlock( currentBlock );
	}


	public String generateParamList(){
		return getTargetAchnolageTerm() + ",\n"
		    +  getReadyTerm() + ",\n"
		    + getOutDataTerm();
	}
	

	@Override
	public void connectDataSource( DataSource dataSource) {
		if( !sources.contains( dataSource ) ){
			sources.add( dataSource );
			dataSource.connectDataTarget(this);
		}
	}


	private String getTargetAchnolageTerm(){ return getUniqueBasename() + "AckInput"; }
	private String getReadyTerm(){ return getUniqueBasename() + "ReadyOutput"; }
	private String getOutDataTerm(){ return getUniqueBasename() + "DataOutput"; }
	
	private String getSourcesReadies(){
		String result = "";
		boolean isFirst = true;
		for( DataSource source : sources ){
			if( !isFirst ){
				result += " || ";
			}else{
				isFirst = false;
			}
			result += source.getSourceIsReadySignal();
		}
		result = "( " + result + " )";
		return result;
	}
	
	private String getActivatedSources(){
		//makes a trynary operator chain to 
		//select the source which will generate
		//the data.
		String result = "";
		
		boolean isFirstSource = true;
		
		for( DataSource dataSource : sources ){
			if( isFirstSource ){
				result += dataSource.getSourceDataSignal();
				isFirstSource = false;
			}else{
				result = "(" + dataSource.getSourceIsReadySignal() + ")?(" + dataSource.getSourceDataSignal() + "):" + result;
			}
		}
		result = "(" + result + ")";
		
		return result;
	}


	@Override
	public String getTargetAchnolageSignal( DataSource sourceToAchnolage ) {
		return getTargetAchnolageTerm();
	}


	@Override
	public String genTopCode(String indent) {
		String result = "";
		result += indent + "input " + getTargetAchnolageTerm() + ";\n";
		result += indent + "output " + getReadyTerm() + ";\n";
		result += indent + "output [31:0] " + getOutDataTerm() + ";\n";
		return result;
	}


	@Override
	public String genMiddleCode(String indent) throws Exception {
		//no state machine code for an output port
		return "";
	}


	@Override
	public String genBottomCode(String indent) {
		String result = "";
		result += indent + "assign " + getReadyTerm() + " = " + getSourcesReadies() + ";\n";
		result += indent + "assign " + getOutDataTerm() + " = " + getActivatedSources() + ";\n";
		return result;
	}


	@Override
	public String getSourceIsReadySignal() {
		throw new NullPointerException( "Can not connect output as datasource" );
	}


	@Override
	public void connectDataTarget(DataTarget dataTarget) {
		throw new NullPointerException( "Can not connect output as datasource" );
	}


	@Override
	public String getSourceDataSignal() {
		throw new NullPointerException( "Can not connect output as datasource" );
	}


	@Override
	public String getCodename() {
		return basename;
	}
	

}
