`timescale 1ns / 1ps
module testProg_top(
stdOutAckInput,
stdOutReadyOutput,
stdOutDataOutput,
clockInput,
resetInput);

   input clockInput;
   input resetInput;

input stdOutAckInput;
output stdOutReadyOutput;
output [31:0] stdOutDataOutput;
//Doable ModuletestProg_top_ParallelDoer0 top code vv 
reg [31:0] dReg;
reg [31:0] eReg;
reg [31:0] aReg;
//Doable ModuletestProg_top_ParallelDoer0_while0 top code vv 
//Doable ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo top code vv 
//Doable ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2 top code vv 
reg ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg;
reg ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg;
//End of ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2 top code ^^ 
reg [31:0] ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg;

parameter ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam = 0;
parameter ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_StateParam = 1;
parameter ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_StateParam = 2;
parameter ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_StateParam = 3;
parameter ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_StateParam = 4;

wire ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_IsActiveWire;
wire ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_IsActiveWire;
wire ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_IsActiveWire;
wire ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire;
//End of ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo top code ^^ 
reg ModuletestProg_top_ParallelDoer0_while0_DidTestReg;
reg ModuletestProg_top_ParallelDoer0_while0_TestPassedReg;
//End of ModuletestProg_top_ParallelDoer0_while0 top code ^^ 
//Doable ModuletestProg_top_ParallelDoer0_while1 top code vv 
//Doable ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo top code vv 
reg [31:0] ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg;

parameter ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_ResetStateParam = 0;
parameter ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_StateParam = 1;

wire ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire;
//End of ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo top code ^^ 
reg ModuletestProg_top_ParallelDoer0_while1_DidTestReg;
reg ModuletestProg_top_ParallelDoer0_while1_TestPassedReg;
//End of ModuletestProg_top_ParallelDoer0_while1 top code ^^ 
reg ModuletestProg_top_ParallelDoer0_while0_DoneReg;
reg ModuletestProg_top_ParallelDoer0_while1_DoneReg;
reg ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg;
//End of ModuletestProg_top_ParallelDoer0 top code ^^ 
//Doable ModuletestProg_top_ParallelDoer0 middle code vv 
always @( posedge clockInput )
if( resetInput ) begin
   dReg <= 0;
end else begin
   if( (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1))))) )begin
      dReg <= (((eReg)));
   end
end
always @( posedge clockInput )
if( resetInput ) begin
   eReg <= 0;
end else begin
   if( (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_IsActiveWire && (1'b1)) )begin
      eReg <= (0);
   end else if( ((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg && ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg) && ((1'b1) && (1'b1))) )begin
      eReg <= ((eReg) + (1));
   end
end
always @( posedge clockInput )
if( resetInput ) begin
   aReg <= 0;
end else begin
   if( (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_IsActiveWire && ((1'b1) && (1'b1))) )begin
      aReg <= ((aReg) + (1));
   end
end
//Doable ModuletestProg_top_ParallelDoer0_while0 middle code vv 
//Doable ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo middle code vv 
//Doable ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2 middle code vv 
always @( posedge clockInput )
if( resetInput )begin
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg <= #1 0;
end else begin
   if( !ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_IsActiveWire ) begin
       ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg <= #1 0;
   end else if( !ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg ) begin
       ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg <= #1 ((1'b1) && (1'b1));
   end else begin
       ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg <= #1 ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg && ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg && !((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg && ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg) && ((1'b1) && (1'b1)));
   end
end
always @( posedge clockInput )
if( resetInput )begin
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg <= #1 0;
end else begin
   if( !ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_IsActiveWire ) begin
       ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg <= #1 0;
   end else if( !ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg ) begin
       ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg <= #1 ((1'b1) && (1'b1)) && ((eReg) < (aReg));
   end else if( ((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg && ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg) && ((1'b1) && (1'b1))) ) begin
       ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg <= #1 0;
   end
end
//End of ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2 middle code ^^ 
always @( posedge clockInput )
if( resetInput || !( (ModuletestProg_top_ParallelDoer0_while0_DidTestReg && ModuletestProg_top_ParallelDoer0_while0_TestPassedReg)) )begin
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam;
end else case( ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg)
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam: begin
       if( (ModuletestProg_top_ParallelDoer0_while0_DidTestReg && ModuletestProg_top_ParallelDoer0_while0_TestPassedReg) )begin
          ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_StateParam;
       end
   end
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_StateParam: begin
      if( (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_IsActiveWire && ((1'b1) && (1'b1))) ) begin
         ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_StateParam;
      end
   end
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_StateParam: begin
      if( (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_IsActiveWire && (1'b1)) ) begin
         ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_StateParam;
      end
   end
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_StateParam: begin
      if( (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_DidTestReg && !ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_TestPassedReg) ) begin
         ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_StateParam;
      end
   end
   ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_StateParam: begin
      if( (((ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1)))))))) ) begin
         ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam;
      end
   end
   default: begin
             ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_ResetStateParam;
   end
endcase
//End of ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo middle code ^^ 
always @( posedge clockInput )
if( resetInput )begin
   ModuletestProg_top_ParallelDoer0_while0_DidTestReg <= #1 0;
end else begin
   if( !( 1'b1 && !ModuletestProg_top_ParallelDoer0_while0_DoneReg ) ) begin
       ModuletestProg_top_ParallelDoer0_while0_DidTestReg <= #1 0;
   end else if( !ModuletestProg_top_ParallelDoer0_while0_DidTestReg ) begin
       ModuletestProg_top_ParallelDoer0_while0_DidTestReg <= #1 (1'b1);
   end else begin
       ModuletestProg_top_ParallelDoer0_while0_DidTestReg <= #1 ModuletestProg_top_ParallelDoer0_while0_TestPassedReg && ModuletestProg_top_ParallelDoer0_while0_DidTestReg && !(((ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1))))))));
   end
end
always @( posedge clockInput )
if( resetInput )begin
   ModuletestProg_top_ParallelDoer0_while0_TestPassedReg <= #1 0;
end else begin
   if( !( 1'b1 && !ModuletestProg_top_ParallelDoer0_while0_DoneReg ) ) begin
       ModuletestProg_top_ParallelDoer0_while0_TestPassedReg <= #1 0;
   end else if( !ModuletestProg_top_ParallelDoer0_while0_DidTestReg ) begin
       ModuletestProg_top_ParallelDoer0_while0_TestPassedReg <= #1 (1'b1) && (1);
   end else if( (((ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1)))))))) ) begin
       ModuletestProg_top_ParallelDoer0_while0_TestPassedReg <= #1 0;
   end
end
//End of ModuletestProg_top_ParallelDoer0_while0 middle code ^^ 
//Doable ModuletestProg_top_ParallelDoer0_while1 middle code vv 
//Doable ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo middle code vv 
always @( posedge clockInput )
if( resetInput || !( (ModuletestProg_top_ParallelDoer0_while1_DidTestReg && ModuletestProg_top_ParallelDoer0_while1_TestPassedReg)) )begin
   ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_ResetStateParam;
end else case( ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg)
   ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_ResetStateParam: begin
       if( (ModuletestProg_top_ParallelDoer0_while1_DidTestReg && ModuletestProg_top_ParallelDoer0_while1_TestPassedReg) )begin
          ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_StateParam;
       end
   end
   ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_StateParam: begin
      if( (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1))))) ) begin
         ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_ResetStateParam;
      end
   end
   default: begin
             ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg <= ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_ResetStateParam;
   end
endcase
//End of ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo middle code ^^ 
always @( posedge clockInput )
if( resetInput )begin
   ModuletestProg_top_ParallelDoer0_while1_DidTestReg <= #1 0;
end else begin
   if( !( 1'b1 && !ModuletestProg_top_ParallelDoer0_while1_DoneReg ) ) begin
       ModuletestProg_top_ParallelDoer0_while1_DidTestReg <= #1 0;
   end else if( !ModuletestProg_top_ParallelDoer0_while1_DidTestReg ) begin
       ModuletestProg_top_ParallelDoer0_while1_DidTestReg <= #1 (1'b1);
   end else begin
       ModuletestProg_top_ParallelDoer0_while1_DidTestReg <= #1 ModuletestProg_top_ParallelDoer0_while1_TestPassedReg && ModuletestProg_top_ParallelDoer0_while1_DidTestReg && !(ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1)))));
   end
end
always @( posedge clockInput )
if( resetInput )begin
   ModuletestProg_top_ParallelDoer0_while1_TestPassedReg <= #1 0;
end else begin
   if( !( 1'b1 && !ModuletestProg_top_ParallelDoer0_while1_DoneReg ) ) begin
       ModuletestProg_top_ParallelDoer0_while1_TestPassedReg <= #1 0;
   end else if( !ModuletestProg_top_ParallelDoer0_while1_DidTestReg ) begin
       ModuletestProg_top_ParallelDoer0_while1_TestPassedReg <= #1 (1'b1) && (1);
   end else if( (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire && (((ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire && (1'b1))))) ) begin
       ModuletestProg_top_ParallelDoer0_while1_TestPassedReg <= #1 0;
   end
end
//End of ModuletestProg_top_ParallelDoer0_while1 middle code ^^ 
always @( posedge clockInput )
if( resetInput ) begin
   ModuletestProg_top_ParallelDoer0_while0_DoneReg <= #1 0;
   ModuletestProg_top_ParallelDoer0_while1_DoneReg <= #1 0;
   ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg <= #1 0;
end else begin
   if( !1'b1 || (( ModuletestProg_top_ParallelDoer0_while0_DoneReg || (ModuletestProg_top_ParallelDoer0_while0_DidTestReg && !ModuletestProg_top_ParallelDoer0_while0_TestPassedReg)) && ( ModuletestProg_top_ParallelDoer0_while1_DoneReg || (ModuletestProg_top_ParallelDoer0_while1_DidTestReg && !ModuletestProg_top_ParallelDoer0_while1_TestPassedReg)) && ( ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg || stdOutAckInput)) ) begin
       ModuletestProg_top_ParallelDoer0_while0_DoneReg <= #1 0;
       ModuletestProg_top_ParallelDoer0_while1_DoneReg <= #1 0;
       ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg <= #1 0;
    end else begin
       ModuletestProg_top_ParallelDoer0_while0_DoneReg <= #1 ModuletestProg_top_ParallelDoer0_while0_DoneReg || (ModuletestProg_top_ParallelDoer0_while0_DidTestReg && !ModuletestProg_top_ParallelDoer0_while0_TestPassedReg);
       ModuletestProg_top_ParallelDoer0_while1_DoneReg <= #1 ModuletestProg_top_ParallelDoer0_while1_DoneReg || (ModuletestProg_top_ParallelDoer0_while1_DidTestReg && !ModuletestProg_top_ParallelDoer0_while1_TestPassedReg);
       ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg <= #1 ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg || stdOutAckInput;
    end
end
//End of ModuletestProg_top_ParallelDoer0 middle code ^^ 
assign stdOutReadyOutput = ( (( 1'b1 && !ModuletestProg_top_ParallelDoer0_DoAssign2_DoneReg ) && (1'b1)) );
assign stdOutDataOutput = ((1));
//Doable ModuletestProg_top_ParallelDoer0 bottom code vv 
//Doable ModuletestProg_top_ParallelDoer0_while0 bottom code vv 
//Doable ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo bottom code vv 
assign ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_IsActiveWire = (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign0_StateParam );
assign ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_IsActiveWire = (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign1_StateParam );
assign ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_IsActiveWire = (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_while2_StateParam );
assign ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_IsActiveWire = (ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_Reg == ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo_DoAssign3_StateParam );
//End of ModuletestProg_top_ParallelDoer0_while0_SequentualDoerwhileDo bottom code ^^ 
//End of ModuletestProg_top_ParallelDoer0_while0 bottom code ^^ 
//Doable ModuletestProg_top_ParallelDoer0_while1 bottom code vv 
//Doable ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo bottom code vv 
assign ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_IsActiveWire = (ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_Reg == ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo_DoAssign0_StateParam );
//End of ModuletestProg_top_ParallelDoer0_while1_SequentualDoerwhileDo bottom code ^^ 
//End of ModuletestProg_top_ParallelDoer0_while1 bottom code ^^ 
//End of ModuletestProg_top_ParallelDoer0 bottom code ^^ 
endmodule
