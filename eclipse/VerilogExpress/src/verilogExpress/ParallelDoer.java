package verilogExpress;

public class ParallelDoer extends DoBlock {
	


	@Override
	String getDoneSignal() {
		//will be done when all sub doables are done.
		String result = "(";
		boolean isFirst = true;
		for( Doable doer : listToDo ){
			if( !isFirst ){
				result += " && ";
			}else{
				isFirst = false;
			}
			result += doer.getDoneSignal();
		}
		result += ")";
		
		
		return result;
	}

	@Override
	public String childActiveSignal(Doable doable) {
		//Child is active if we are active.
		return parrent.childActiveSignal(this);
	}

	@Override
	String getActiveSignal() {
		return parrent.childActiveSignal(this);
	}

	@Override
	String getDescribeName() {
		return "ParallelDoer";
	}


}
