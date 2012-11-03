package verilogExpress;

public class CalcUnaryOpperation extends Calculation{
	
	String operation = null;
	
	public CalcUnaryOpperation( String newOpp, DataSource var1, DoBlock block ){
		operation = newOpp;
		connectDataSource( var1 );
		setBlock( block );
	}

	public CalcUnaryOpperation( String newOpp, DataSource var1 ) {
		operation = newOpp;
		connectDataSource( var1 );
	}

	@Override
	String getOperation() {
		return operation;
	}


}
