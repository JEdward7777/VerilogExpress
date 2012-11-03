package verilogExpress;

public class CalcBinaryOpperation extends Calculation{
	
	String operation = null;

	public CalcBinaryOpperation( String newOpp, DataSource var1, DataSource var2 ) {
		super( );
		operation = newOpp;
		connectDataSource( var1 );
		connectDataSource( var2 );
	}

	public CalcBinaryOpperation(String newOpp, DataSource var1, DataSource arg2,
			DoBlock currentBlock) {
		super();
		operation = newOpp;
		connectDataSource( var1 );
		connectDataSource( arg2 );
		setBlock( currentBlock );
	}

	@Override
	String getOperation() {
		return operation;
	}


}
