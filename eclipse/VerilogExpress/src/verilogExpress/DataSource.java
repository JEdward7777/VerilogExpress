package verilogExpress;

public interface DataSource {
	String getSourceIsReadySignal();
	void connectDataTarget( DataTarget dataTarget );
	String getSourceDataSignal();
}
