package verilogExpress;

import java.util.HashMap;

public abstract class Variable  implements DataSource, DataTarget, VerilogCodeSource {
	String basename;
	DoBlock block = null;
	
	static HashMap< Variable, String > uniqueNames = new HashMap< Variable, String >();
	
	public Variable( String newName ){
		basename = newName;
	}
	
	public void setBlock( DoBlock newBlock ){
		if( block == null ){
			block = newBlock;
			block.addVarToBlock( this );
		}
	}

	public String getBasename() {
		return basename;
	}
	abstract public String getCodename();
	
	public String getUniqueBasename(){
		String result = null;
		if( !uniqueNames.containsKey(this) ){
			if( !uniqueNames.containsValue(basename) ){
				result = basename;
			}else{
				int appendixNum = 2;
				while( uniqueNames.containsValue( basename + appendixNum ) ){
					appendixNum++;
				}
				result = basename + appendixNum;
			}
			uniqueNames.put(this, result);
		}else{
			result = uniqueNames.get(this);
		}
		return result;
	}
}
