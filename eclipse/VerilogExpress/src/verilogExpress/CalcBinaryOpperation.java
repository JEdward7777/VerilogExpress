package verilogExpress;

public class CalcBinaryOpperation extends Calculation{
	
	String operation = null;

	public CalcBinaryOpperation( String newOpp, DataSource var1, DataSource var2, DoBlock doBlock ) {
		super( doBlock );
		operation = newOpp;
		connectDataSource( var1 );
		connectDataSource( var2 );
	}

	@Override
	String getOperation() {
		return operation;
	}


}
