rem download http://bleyer.org/icarus/
rem tutorial http://www.swarthmore.edu/NatSci/mzucker1/e15/iverilog-instructions.html
iverilog -o gcd_top.vvp gcd_top.v gcd_top_tb.v || pause
vvp gcd_top.vvp || pause
gtkwave gcd_top.vcd gcd_top_wsf || pause