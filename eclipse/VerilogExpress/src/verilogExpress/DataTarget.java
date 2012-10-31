package verilogExpress;

public interface DataTarget {
	void connectDataSource( DataSource newSource );
	String getTargetAchnolageSignal( DataSource sourceToAchnolage );
}
