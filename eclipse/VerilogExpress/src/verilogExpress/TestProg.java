package verilogExpress;

public class TestProg {
	public static void main(String[] args) throws Exception {

		VerilogSystem system = new VerilogSystem();
		system.setProgName( "testProg" );

		VerilogFileModule module = system.getTopLevel();
		SequentualDoer mainBody = new SequentualDoer();
		module.setMainBody(mainBody);

		ConstVar var1 = new ConstVar( "var1", "1" );
		ConstVar var2 = new ConstVar( "var2", "2" );
		ConstVar var3 = new ConstVar( "var3", "3" );
		var1.setBlock( mainBody );
		var2.setBlock( mainBody );
		var3.setBlock( mainBody );

		RegVar regVar1 = new RegVar("regVar1", "0" );
		regVar1.setBlock( mainBody );

		// System.err.println( "regVar1 = " + regVar1 );

		Variable calc = new CalcBinaryOpperation( "+", var1,
				var2 );
		calc.setBlock( mainBody );
		DoAssign assign1 = new DoAssign( calc );
		regVar1.connectDataSource(assign1);
		mainBody.appendDo(assign1);

		CalcBinaryOpperation calcOpp = new CalcBinaryOpperation("-",
				regVar1, var3 );
		calcOpp.setBlock( mainBody );
		DoAssign assign2 = new DoAssign( calcOpp );
		regVar1.connectDataSource(assign2);
		mainBody.appendDo(assign2);

		DataTarget stdOut = system.getStdOut();

		DoAssign assign3 = new DoAssign( regVar1);
		stdOut.connectDataSource(assign3);
		mainBody.appendDo(assign3);

		System.out.println(module.generateSource(""));
		// system.simulate();

	}
}
