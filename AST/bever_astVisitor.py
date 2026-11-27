# Generated from AST/bever_ast.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .bever_astParser import bever_astParser
else:
    from bever_astParser import bever_astParser

# This class defines a complete generic visitor for a parse tree produced by bever_astParser.

class bever_astVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by bever_astParser#prog.
    def visitProg(self, ctx:bever_astParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bever_astParser#command.
    def visitCommand(self, ctx:bever_astParser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bever_astParser#block.
    def visitBlock(self, ctx:bever_astParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bever_astParser#class_decl.
    def visitClass_decl(self, ctx:bever_astParser.Class_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bever_astParser#func_decl.
    def visitFunc_decl(self, ctx:bever_astParser.Func_declContext):
        return self.visitChildren(ctx)



del bever_astParser