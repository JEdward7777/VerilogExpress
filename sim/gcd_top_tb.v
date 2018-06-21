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

module gcd_top_tb;

	reg aInIsReadyInput;
	reg [31:0] aInDataInput;
	wire aInAckOutput;
	reg bInIsReadyInput;
	reg [31:0] bInDataInput;
	wire bInAckOutput;
	reg oOutAckInput;
	wire oOutReadyOutput;
	wire [31:0] oOutDataOutput;
	reg clockInput;
	reg resetInput;

	
	
	// Clock generator
	always begin
		#5  clockInput = ~clockInput; // Toggle clock every 5 ticks
	end

	// Instantiate the Unit Under Test (UUT)
	gcd_top uut (
		.aInIsReadyInput(aInIsReadyInput),
		.aInDataInput( aInDataInput ),
		.aInAckOutput( aInAckOutput ),
		.bInIsReadyInput( bInIsReadyInput ),
		.bInDataInput( bInDataInput ),
		.bInAckOutput( bInAckOutput ),
		.oOutReadyOutput( oOutReadyOutput ),
		.oOutDataOutput( oOutDataOutput ),
		.oOutAckInput( oOutAckInput ),
		.clockInput( clockInput ),
		.resetInput( resetInput )
	);

	reg [31:0] receivedData;

	initial begin
		receivedData = 0;
		oOutAckInput = 0;

		@(posedge clockInput);
		@(posedge clockInput);
		while( 1 ) begin

			while( oOutReadyOutput != 1 ) @(posedge clockInput);
			
			receivedData = oOutDataOutput;
			oOutAckInput = #1 1;

			@(posedge clockInput);
		
			oOutAckInput = #1 0;

			$display( "read gcd of", receivedData );
		end
	end


	initial begin
		$dumpfile("gcd_top.vcd");
		$dumpvars(0,uut);
	
		// Initialize Inputs
		aInIsReadyInput = #1 0;
		aInDataInput = #1 0;
		bInIsReadyInput = #1 0;
		bInDataInput = #1 0;
		clockInput = #1 0;
		resetInput = #1 0;

		// Wait 100 ns for global reset to finish
		#100;
        
		// Reset it
		@(posedge clockInput);
		resetInput = #1 1;
		@(posedge clockInput);
		resetInput = #1 0;


		@(posedge clockInput);
		@(posedge clockInput);

		aInDataInput = #1 12;
		bInDataInput = #1 6;
		aInIsReadyInput = #1 1;
		bInIsReadyInput = #1 1;
		@(posedge clockInput);
		while( !aInAckOutput ) @(posedge clockInput);
		aInIsReadyInput = #1 0;
		bInIsReadyInput = #1 0;

		@(posedge clockInput);
		@(posedge clockInput);

		aInDataInput = #1 8;
		bInDataInput = #1 12;
		aInIsReadyInput = #1 1;
		bInIsReadyInput = #1 1;
		@(posedge clockInput);
		while( !aInAckOutput ) @(posedge clockInput);
		aInIsReadyInput = #1 0;
		bInIsReadyInput = #1 0;
		@(posedge clockInput);
		@(posedge clockInput);

		aInDataInput = #1 14;
		bInDataInput = #1 28;
		aInIsReadyInput = #1 1;
		bInIsReadyInput = #1 1;
		@(posedge clockInput);
		while( !aInAckOutput ) @(posedge clockInput);
		aInIsReadyInput = #1 0;
		bInIsReadyInput = #1 0;
		@(posedge clockInput);
		@(posedge clockInput);

	
		#1000;
		$finish;
	end

	initial begin
		#10000;
		$finish;
	end
      
endmodule

