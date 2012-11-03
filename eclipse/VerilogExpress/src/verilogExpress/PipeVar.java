package verilogExpress;

import java.util.LinkedList;

public class PipeVar extends Variable {
	LinkedList< DataSource > sources = new LinkedList< DataSource >();
	LinkedList< DataTarget > targets = new LinkedList< DataTarget >();

	public PipeVar(String newName, DoBlock doBlock ) {
		super(newName, doBlock );
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
	public String getSourceIsReadySignal() {
		String result = "(";
		boolean isFirst = true;
		for( DataSource source : sources ){
			if( !isFirst ){
				result += " || ";
			}else{
				isFirst = false;
			}
			
			result += source.getSourceIsReadySignal();
		}
		result += ")";
		return result;
	}

	@Override
	public String getTargetAchnolageSignal( DataSource sourceToAchnolage) {
		//theoretically we could take into account if another source is writing at the same time and
		//then block the achnolage singal comeing back to the ignored source.  But
		//by not doing that we simply make it so that we have to make sure not to write
		//into a pipe by to sources at the same time which seems fine.  If it turns out
		//that we want it to block one until the other one gets in then we could do it here.
		
		String result = "(";
		boolean isFirst = true;
		for( DataTarget target : targets ){
			if( !isFirst ){
				result += " || ";
			}else{
				isFirst = false;
			}
			
			result += target.getTargetAchnolageSignal( this );
		}
		result += ")";
		return result;
	}

	@Override
	public String getSourceDataSignal() {
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

	@Override
	public String getCodename() {
		return getUniqueBasename() + "Pipe";
	}





}
