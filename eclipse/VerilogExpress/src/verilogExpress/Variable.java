package verilogExpress;

public abstract class Variable  implements DataSource, DataTarget, VerilogCodeSource {
	String name;
	DoBlock block = null;
	
	public Variable( String newName, DoBlock newBlock ){
		name = newName;
		block = newBlock;
		block.addVarToBlock(this);
	}

	public String getName() {
		return name;
	}
}
