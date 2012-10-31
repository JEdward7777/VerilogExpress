package verilogExpress;

public class CalcUnaryOpperation extends Calculation{
	
	String operation = null;

	public CalcUnaryOpperation( String newOpp, DataSource var1, DoBlock doBlock ) {
		super( doBlock );
		operation = newOpp;
		connectDataSource( var1 );
	}

	@Override
	String getOperation() {
		return operation;
	}


}
