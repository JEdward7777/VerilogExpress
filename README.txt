:DOWNLOADING
-Install the Java Develment Kit which is called the jdk.
http://docs.oracle.com/javase/7/docs/webnotes/install/
or
http://www.thegeekstuff.com/2009/09/how-to-install-java-on-ubunt-debiau/

-get a copy of VE by cloning from git hub.
git clone https://github.com/JEdward7777/VerilogExpress.git


:COMPILING
ANTLR is a parser lexer generator.  (http://www.antlr3.org/)
-Launch ANTLR IDE called ANTLRWorks with the grammar file (windows replace / with \ here and below)
java -jar VerilogExpress/lib/antlrworks-1.4.3.jar VerilogExpress/eclipse/VerilogExpress/ANTLR_src/VerilogExpress.g

-Then compile it with the menu command Generate->Generate Code
this generates two java files in VerilogExpress/eclipse/VerilogExpress/ANTLR_src/output 

-copy the generated ANTLR files over to the rest of the project (windows replace cp with copy)
cp VerilogExpress/eclipse/VerilogExpress/ANTLR_src/output/*.java VerilogExpress/eclipse/VerilogExpress/src/verilogExpress/

-ANTLRWorks can now be closed.

-Now compile in the rest of the project.
-create the output folder
mkdir VerilogExpress/eclipse/VerilogExpress/bin
-execute the java compiler javac
javac -d VerilogExpress/eclipse/VerilogExpress/bin VerilogExpress/eclipse/VerilogExpress/src/verilogExpress/*.java -classpath VerilogExpress/lib/antlrworks-1.4.3.jar


:RUNNING
View the code that is about to be compiled with VE (windows replace gedit with write)
gedit VerilogExpress/sim/gcd.ve

There are currently two variable types reg and pipe.  Inputs and outputs are of type pipe.  The vars can be read from and written to from any block in which they are in scope.  A pipe blocks reads and writes unless a corresponding write or read happens at the same time.

All code blocks which are surrounded by brackets [] execute their contents at the same time.  Thus on line 9 the inputs are read into aReg and bReg either simultaneously or in whatever order they become available.  Also line 13 and 14 swap the contents of aReg and bReg without loosing either value because the execution happens in one step.

Blocks surrounded by braces {} execute their contents sequentially.  Thus in the body of the outer while loop the inputs are read then the sub while loop executes and then the output is fed to the output pipe (which waits until it is received)

-Now compile gcd.ve like this (windows replace : with ;)
java -cp VerilogExpress/eclipse/VerilogExpress/bin:VerilogExpress/lib/antlrworks-1.4.3.jar verilogExpress.Main VerilogExpress/sim/gcd.ve > VerilogExpress/sim/gcd_top.v

-View the resulting Verilog code.  Sit down first and don't inhale anything unintentionally. It actually sythesizes down rather cleanly. (windows replace gedit with write)
gedit VerilogExpress/sim/gcd_top.v

:SIMULATE
These instructions tell how to use Icarus Verilog.
-View the gcd test bench
gedit VerilogExpress/sim/gcd_top_tb.v
Line 80 displays the gcd result each time it is read out.
Beginning at line 101, different test values are written in for the system to calculate on.

-Install Icarus Verilog
-Windows can download a binary here: http://bleyer.org/icarus/
-Linux instructions are here: 
http://iverilog.wikia.com/wiki/Installation_Guide
-Ubuntu seems to be able to install it like this
sudo apt-get install iverilog

-Compile the Verilog with Icarus
cd VerilogExpress/sim/
iverilog -o gcd_top.vvp gcd_top.v gcd_top_tb.v

-Run the compiled Verilog
You should see the results of the different gcd operations.
vvp gcd_top.vvp

-Install gtkwave to view the results
http://gtkwave.sourceforge.net/
-If you have Ubuntu or perhaps Debian gtkwave will install like this:
sudo apt-get install gtkwave

-Now view the dumped wave data from simulation
gtkwave gcd_top.vcd gcd_top_wsf

Hopefully this gives a neat demo of the current VE capabilities.
