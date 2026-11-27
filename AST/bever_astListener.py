# Generated from AST/bever_ast.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .bever_astParser import bever_astParser
else:
    from bever_astParser import bever_astParser

# This class defines a complete listener for a parse tree produced by bever_astParser.
class bever_astListener(ParseTreeListener):

    # Enter a parse tree produced by bever_astParser#prog.
    def enterProg(self, ctx:bever_astParser.ProgContext):
        pass

    # Exit a parse tree produced by bever_astParser#prog.
    def exitProg(self, ctx:bever_astParser.ProgContext):
        pass


    # Enter a parse tree produced by bever_astParser#command.
    def enterCommand(self, ctx:bever_astParser.CommandContext):
        pass

    # Exit a parse tree produced by bever_astParser#command.
    def exitCommand(self, ctx:bever_astParser.CommandContext):
        pass


    # Enter a parse tree produced by bever_astParser#block.
    def enterBlock(self, ctx:bever_astParser.BlockContext):
        pass

    # Exit a parse tree produced by bever_astParser#block.
    def exitBlock(self, ctx:bever_astParser.BlockContext):
        pass


    # Enter a parse tree produced by bever_astParser#class_decl.
    def enterClass_decl(self, ctx:bever_astParser.Class_declContext):
        pass

    # Exit a parse tree produced by bever_astParser#class_decl.
    def exitClass_decl(self, ctx:bever_astParser.Class_declContext):
        pass


    # Enter a parse tree produced by bever_astParser#func_decl.
    def enterFunc_decl(self, ctx:bever_astParser.Func_declContext):
        pass

    # Exit a parse tree produced by bever_astParser#func_decl.
    def exitFunc_decl(self, ctx:bever_astParser.Func_declContext):
        pass



del bever_astParser