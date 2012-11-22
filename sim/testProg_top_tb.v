`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   14:40:01 10/20/2012
// Design Name:   testProg_top
// Module Name:   C:/Shared_Docs/lunch/ve/ise/veTestProj/testProg_topVTF.v
// Project Name:  veTestProj
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: testProg_top
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module testProg_top_tb;

	// Inputs
	reg stdOutAckInput;
	reg clockInput;
	reg resetInput;

	// Outputs
	wire stdOutReadyOutput;
	wire [31:0] stdOutDataOutput;
	
	// Clock generator
	always begin
		#5  clockInput = ~clockInput; // Toggle clock every 5 ticks
	end

	// Instantiate the Unit Under Test (UUT)
	testProg_top uut (
		.stdOutAckInput(stdOutAckInput), 
		.stdOutReadyOutput(stdOutReadyOutput), 
		.stdOutDataOutput(stdOutDataOutput), 
		.clockInput(clockInput), 
		.resetInput(resetInput)
	);

	initial begin
		$dumpfile("testProg_top.vcd");
		$dumpvars(0,uut);
	
		// Initialize Inputs
		stdOutAckInput = 0;
		clockInput = 0;
		resetInput = 0;

		// Wait 100 ns for global reset to finish
		#100;
        
		// Add stimulus here
		@(posedge clockInput);
		resetInput = 1;
		@(posedge clockInput);
		resetInput = 0;

		#1000;
		$finish();

	end
      
endmodule

