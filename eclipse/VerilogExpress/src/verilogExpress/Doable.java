package verilogExpress;


abstract public class Doable implements VerilogCodeSource {
	DoBlock parrent = null;
	
	public Doable(){
	}
	
	
	abstract String getActiveSignal();
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
