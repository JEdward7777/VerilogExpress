package verilogExpress;


abstract public class Doable implements VerilogCodeSource {
	DoBlock parrent = null;
	
	public Doable(){
	}
	
	
	String getActiveSignal(){
		String result = "1";
		if( parrent != null ){
			result = parrent.getChildActiveSignal( this );
		}
		return result;
	}
	abstract String getDoneSignal();
	
	public String getUniqueName(){
		return parrent.getUniqueName() + "_" + getDescribeName() + parrent.getChildNum( this );
	}
	
	abstract String getDescribeName();


	public void setParrent(DoBlock doBlock) {
		parrent = doBlock;
	}
	
	public DoBlock getParrent() {
		return parrent;
	}
	
}
