rem download http://bleyer.org/icarus/
rem tutorial http://www.swarthmore.edu/NatSci/mzucker1/e15/iverilog-instructions.html
iverilog -o testProg_top.vvp testProg_top.v testProg_top_tb.v || pause
vvp testProg_top.vvp || pause
gtkwave testProg_top.vcd testProg_top_wsf || pause