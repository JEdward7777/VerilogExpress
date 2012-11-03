package verilogExpress;

abstract public class Calculation extends PipeVar {
	
	static int nextCalcNumber = 0;
	
	public Calculation( ) {
		super( "calc" + (nextCalcNumber++) );
	}

	
	@Override
	public String getSourceDataSignal() {
		String result = "(";
		boolean firstArg = true;
		for( DataSource source : sources ){
			if( !firstArg ){
				result += " " + getOperation() + " ";
			}else{
				firstArg = false;
			}
			result += source.getSourceDataSignal();
		}
		result += ")";
		return result;
	}


	abstract String getOperation();


	@Override
	//We have to override this because with a calculation
	//we are only ready when all our sources are ready
	//instead of a pipeVar which needs one of the sources
	//to be ready.
	public String getSourceIsReadySignal() {
		String result = "(";
		boolean isFirst = true;
		for( DataSource source : sources ){
			if( !isFirst ){
				result += " && ";
			}else{
				isFirst = false;
			}
			result += source.getSourceIsReadySignal(); 
		}
		result += ")";
		return result;
	}


}
