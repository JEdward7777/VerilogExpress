package verilogExpress;

public interface VerilogCodeSource {
	String genTopCode( String indent );
	String genMiddleCode( String indent ) throws Exception;
	String genBottomCode( String indent );
}
