`timescale 1ns / 1ps
module gcd_top(
aInIsReadyInput,
aInDataInput,
aInAckOutput,
bInIsReadyInput,
bInDataInput,
bInAckOutput,
oOutAckInput,
oOutReadyOutput,
oOutDataOutput,
clockInput,
resetInput);

   input clockInput;
   input resetInput;

//Doable Modulegcd_top_ParallelDoer0 top code vv 
input bInIsReadyInput;
input [31:0] bInDataInput;
output bInAckOutput;
input aInIsReadyInput;
input [31:0] aInDataInput;
output aInAckOutput;
input oOutAckInput;
output oOutReadyOutput;
output [31:0] oOutDataOutput;
//Doable Modulegcd_top_ParallelDoer0_while0 top code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo top code vv 
reg [31:0] bRegReg;
reg [31:0] aRegReg;
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0 top code vv 
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg;
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg;
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0 top code ^^ 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1 top code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo top code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0 top code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo top code vv 
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg;
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg;
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo top code ^^ 
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg;
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg;
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0 top code ^^ 
reg [31:0] Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg;

parameter Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_ResetStateParam = 0;
parameter Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_StateParam = 1;

wire Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_IsActiveWire;
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo top code ^^ 
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg;
reg Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg;
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1 top code ^^ 
reg [31:0] Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg;

parameter Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam = 0;
parameter Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_StateParam = 1;
parameter Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_StateParam = 2;
parameter Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_StateParam = 3;

wire Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire;
wire Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_IsActiveWire;
wire Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_IsActiveWire;
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo top code ^^ 
reg Modulegcd_top_ParallelDoer0_while0_DidTestReg;
reg Modulegcd_top_ParallelDoer0_while0_TestPassedReg;
//End of Modulegcd_top_ParallelDoer0_while0 top code ^^ 
reg Modulegcd_top_ParallelDoer0_while0_DoneReg;
//End of Modulegcd_top_ParallelDoer0 top code ^^ 
//Doable Modulegcd_top_ParallelDoer0 middle code vv 
//Doable Modulegcd_top_ParallelDoer0_while0 middle code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo middle code vv 
always @( posedge clockInput )
if( resetInput ) begin
   bRegReg <= 0;
end else begin
   if( (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg ) && (bInIsReadyInput)) )begin
      bRegReg <= (bInDataInput);
   end else if( (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)) )begin
      bRegReg <= (aRegReg);
   end
end
always @( posedge clockInput )
if( resetInput ) begin
   aRegReg <= 0;
end else begin
   if( (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg ) && (aInIsReadyInput)) )begin
      aRegReg <= (aInDataInput);
   end else if( (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1)) )begin
      aRegReg <= (bRegReg);
   end else if( ((Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && ((1'b1) && (1'b1))) )begin
      aRegReg <= ((aRegReg) - (bRegReg));
   end
end
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0 middle code vv 
always @( posedge clockInput )
if( resetInput ) begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg <= #1 0;
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg <= #1 0;
end else begin
   if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg ) && (aInIsReadyInput))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg ) && (bInIsReadyInput)))) ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg <= #1 0;
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg <= #1 0;
    end else begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg <= #1 Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg ) && (aInIsReadyInput));
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg <= #1 Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg ) && (bInIsReadyInput));
    end
end
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0 middle code ^^ 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1 middle code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo middle code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0 middle code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo middle code vv 
always @( posedge clockInput )
if( resetInput ) begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg <= #1 0;
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg <= #1 0;
end else begin
   if( !(Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)))) ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg <= #1 0;
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg <= #1 0;
    end else begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg <= #1 Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1));
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg <= #1 Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1));
    end
end
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo middle code ^^ 
always @( posedge clockInput )
if( resetInput )begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg <= #1 0;
end else begin
   if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_IsActiveWire ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg <= #1 0;
   end else if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg <= #1 ((1'b1) && (1'b1));
   end else begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg <= #1 !( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg?(( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)))):((Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && ((1'b1) && (1'b1))) );
   end
end
always @( posedge clockInput )
if( resetInput )begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg <= #1 0;
end else begin
   if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_IsActiveWire ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg <= #1 0;
   end else if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg <= #1 ((1'b1) && (1'b1)) && ((aRegReg) < (bRegReg));
   end else begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg <= #1 Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg && !( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg?(( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)))):((Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && ((1'b1) && (1'b1))) );
   end
end
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0 middle code ^^ 
always @( posedge clockInput )
if( resetInput || !( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg)) )begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_ResetStateParam;
end else case( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg)
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_ResetStateParam: begin
       if( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg) )begin
          Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_StateParam;
       end
   end
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_StateParam: begin
      if( (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg?(( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)))):((Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && ((1'b1) && (1'b1))) ) && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg ) ) begin
         Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_ResetStateParam;
      end
   end
   default: begin
             Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_ResetStateParam;
   end
endcase
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo middle code ^^ 
always @( posedge clockInput )
if( resetInput )begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg <= #1 0;
end else begin
   if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_IsActiveWire ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg <= #1 0;
   end else if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg <= #1 ((1'b1) && (1'b1));
   end else begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg <= #1 Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg && !(( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg?(( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)))):((Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && ((1'b1) && (1'b1))) ) && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg );
   end
end
always @( posedge clockInput )
if( resetInput )begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg <= #1 0;
end else begin
   if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_IsActiveWire ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg <= #1 0;
   end else if( !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg <= #1 ((1'b1) && (1'b1)) && ((bRegReg) != (0));
   end else if( (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg?(( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign0_DoneReg ) && (1'b1))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg || (( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_ParallelDoerifDo_DoAssign1_DoneReg ) && (1'b1)))):((Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_TestPassedReg) && ((1'b1) && (1'b1))) ) && Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_DidTestReg ) ) begin
       Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg <= #1 0;
   end
end
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1 middle code ^^ 
always @( posedge clockInput )
if( resetInput || !( (Modulegcd_top_ParallelDoer0_while0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_TestPassedReg)) )begin
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam;
end else case( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg)
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam: begin
       if( (Modulegcd_top_ParallelDoer0_while0_DidTestReg && Modulegcd_top_ParallelDoer0_while0_TestPassedReg) )begin
          Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_StateParam;
       end
   end
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_StateParam: begin
      if( (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg ) && (aInIsReadyInput))) && ( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg || (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg ) && (bInIsReadyInput)))) ) begin
         Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_StateParam;
      end
   end
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_StateParam: begin
      if( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_TestPassedReg) ) begin
         Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_StateParam;
      end
   end
   Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_StateParam: begin
      if( oOutAckInput ) begin
         Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam;
      end
   end
   default: begin
             Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam;
   end
endcase
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo middle code ^^ 
always @( posedge clockInput )
if( resetInput )begin
   Modulegcd_top_ParallelDoer0_while0_DidTestReg <= #1 0;
end else begin
   if( !( 1'b1 && !Modulegcd_top_ParallelDoer0_while0_DoneReg ) ) begin
       Modulegcd_top_ParallelDoer0_while0_DidTestReg <= #1 0;
   end else if( !Modulegcd_top_ParallelDoer0_while0_DidTestReg ) begin
       Modulegcd_top_ParallelDoer0_while0_DidTestReg <= #1 (1'b1);
   end else begin
       Modulegcd_top_ParallelDoer0_while0_DidTestReg <= #1 Modulegcd_top_ParallelDoer0_while0_TestPassedReg && Modulegcd_top_ParallelDoer0_while0_DidTestReg && !oOutAckInput;
   end
end
always @( posedge clockInput )
if( resetInput )begin
   Modulegcd_top_ParallelDoer0_while0_TestPassedReg <= #1 0;
end else begin
   if( !( 1'b1 && !Modulegcd_top_ParallelDoer0_while0_DoneReg ) ) begin
       Modulegcd_top_ParallelDoer0_while0_TestPassedReg <= #1 0;
   end else if( !Modulegcd_top_ParallelDoer0_while0_DidTestReg ) begin
       Modulegcd_top_ParallelDoer0_while0_TestPassedReg <= #1 (1'b1) && (1);
   end else if( oOutAckInput ) begin
       Modulegcd_top_ParallelDoer0_while0_TestPassedReg <= #1 0;
   end
end
//End of Modulegcd_top_ParallelDoer0_while0 middle code ^^ 
always @( posedge clockInput )
if( resetInput ) begin
   Modulegcd_top_ParallelDoer0_while0_DoneReg <= #1 0;
end else begin
   if( !1'b1 || (( Modulegcd_top_ParallelDoer0_while0_DoneReg || (Modulegcd_top_ParallelDoer0_while0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_TestPassedReg))) ) begin
       Modulegcd_top_ParallelDoer0_while0_DoneReg <= #1 0;
    end else begin
       Modulegcd_top_ParallelDoer0_while0_DoneReg <= #1 Modulegcd_top_ParallelDoer0_while0_DoneReg || (Modulegcd_top_ParallelDoer0_while0_DidTestReg && !Modulegcd_top_ParallelDoer0_while0_TestPassedReg);
    end
end
//End of Modulegcd_top_ParallelDoer0 middle code ^^ 
//Doable Modulegcd_top_ParallelDoer0 bottom code vv 
assign bInAckOutput = (((( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg ) && (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign1_DoneReg ) && (bInIsReadyInput)))));
assign aInAckOutput = (((( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg ) && (( Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire && !Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_DoAssign0_DoneReg ) && (aInIsReadyInput)))));
assign oOutReadyOutput = ( (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_IsActiveWire && (1'b1)) );
assign oOutDataOutput = ((aRegReg));
//Doable Modulegcd_top_ParallelDoer0_while0 bottom code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo bottom code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1 bottom code vv 
//Doable Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo bottom code vv 
assign Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_IsActiveWire = (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_Reg == Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo_if0_StateParam );
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_SequentualDoerwhileDo bottom code ^^ 
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1 bottom code ^^ 
assign Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_IsActiveWire = (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_ParallelDoer0_StateParam );
assign Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_IsActiveWire = (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_while1_StateParam );
assign Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_IsActiveWire = (Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign2_StateParam );
//End of Modulegcd_top_ParallelDoer0_while0_SequentualDoerwhileDo bottom code ^^ 
//End of Modulegcd_top_ParallelDoer0_while0 bottom code ^^ 
//End of Modulegcd_top_ParallelDoer0 bottom code ^^ 
endmodule
