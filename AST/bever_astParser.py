# Generated from AST/bever_ast.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,21,49,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,4,0,12,8,0,
        11,0,12,0,13,1,0,1,0,1,1,1,1,1,1,3,1,21,8,1,1,2,1,2,5,2,25,8,2,10,
        2,12,2,28,9,2,1,2,1,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,5,4,39,8,4,10,
        4,12,4,42,9,4,1,4,1,4,1,4,1,4,1,4,1,4,0,0,5,0,2,4,6,8,0,0,48,0,11,
        1,0,0,0,2,20,1,0,0,0,4,22,1,0,0,0,6,31,1,0,0,0,8,35,1,0,0,0,10,12,
        3,2,1,0,11,10,1,0,0,0,12,13,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,
        14,15,1,0,0,0,15,16,5,0,0,1,16,1,1,0,0,0,17,21,5,15,0,0,18,21,3,
        6,3,0,19,21,3,8,4,0,20,17,1,0,0,0,20,18,1,0,0,0,20,19,1,0,0,0,21,
        3,1,0,0,0,22,26,5,1,0,0,23,25,3,2,1,0,24,23,1,0,0,0,25,28,1,0,0,
        0,26,24,1,0,0,0,26,27,1,0,0,0,27,29,1,0,0,0,28,26,1,0,0,0,29,30,
        5,2,0,0,30,5,1,0,0,0,31,32,5,3,0,0,32,33,5,16,0,0,33,34,3,4,2,0,
        34,7,1,0,0,0,35,36,5,6,0,0,36,40,5,16,0,0,37,39,5,9,0,0,38,37,1,
        0,0,0,39,42,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,43,1,0,0,0,42,
        40,1,0,0,0,43,44,5,4,0,0,44,45,5,8,0,0,45,46,5,5,0,0,46,47,3,4,2,
        0,47,9,1,0,0,0,4,13,20,26,40
    ]

class bever_astParser ( Parser ):

    grammarFileName = "bever_ast.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'{'", "'}'", "'class'", "':'", "'->'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'pub'", "'stat'", "'str'", "'int'", "'float'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "Access_decl", "Access_Modifires", 
                      "Types", "Param", "PUB", "STAT", "STRING_TYPE", "INT_TYPE", 
                      "FLOAT_TYPE", "TOKENS", "ID", "FLOAT", "NUM", "COMMENT", 
                      "STRING", "WS" ]

    RULE_prog = 0
    RULE_command = 1
    RULE_block = 2
    RULE_class_decl = 3
    RULE_func_decl = 4

    ruleNames =  [ "prog", "command", "block", "class_decl", "func_decl" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    Access_decl=6
    Access_Modifires=7
    Types=8
    Param=9
    PUB=10
    STAT=11
    STRING_TYPE=12
    INT_TYPE=13
    FLOAT_TYPE=14
    TOKENS=15
    ID=16
    FLOAT=17
    NUM=18
    COMMENT=19
    STRING=20
    WS=21

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(bever_astParser.EOF, 0)

        def command(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bever_astParser.CommandContext)
            else:
                return self.getTypedRuleContext(bever_astParser.CommandContext,i)


        def getRuleIndex(self):
            return bever_astParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = bever_astParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 10
                self.command()
                self.state = 13 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 32840) != 0)):
                    break

            self.state = 15
            self.match(bever_astParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TOKENS(self):
            return self.getToken(bever_astParser.TOKENS, 0)

        def class_decl(self):
            return self.getTypedRuleContext(bever_astParser.Class_declContext,0)


        def func_decl(self):
            return self.getTypedRuleContext(bever_astParser.Func_declContext,0)


        def getRuleIndex(self):
            return bever_astParser.RULE_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommand" ):
                listener.enterCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommand" ):
                listener.exitCommand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommand" ):
                return visitor.visitCommand(self)
            else:
                return visitor.visitChildren(self)




    def command(self):

        localctx = bever_astParser.CommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_command)
        try:
            self.state = 20
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15]:
                self.enterOuterAlt(localctx, 1)
                self.state = 17
                self.match(bever_astParser.TOKENS)
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 18
                self.class_decl()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 3)
                self.state = 19
                self.func_decl()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def command(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bever_astParser.CommandContext)
            else:
                return self.getTypedRuleContext(bever_astParser.CommandContext,i)


        def getRuleIndex(self):
            return bever_astParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)




    def block(self):

        localctx = bever_astParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self.match(bever_astParser.T__0)
            self.state = 26
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 32840) != 0):
                self.state = 23
                self.command()
                self.state = 28
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 29
            self.match(bever_astParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Class_declContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(bever_astParser.ID, 0)

        def block(self):
            return self.getTypedRuleContext(bever_astParser.BlockContext,0)


        def getRuleIndex(self):
            return bever_astParser.RULE_class_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClass_decl" ):
                listener.enterClass_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClass_decl" ):
                listener.exitClass_decl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClass_decl" ):
                return visitor.visitClass_decl(self)
            else:
                return visitor.visitChildren(self)




    def class_decl(self):

        localctx = bever_astParser.Class_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_class_decl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self.match(bever_astParser.T__2)
            self.state = 32
            self.match(bever_astParser.ID)
            self.state = 33
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Func_declContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Access_decl(self):
            return self.getToken(bever_astParser.Access_decl, 0)

        def ID(self):
            return self.getToken(bever_astParser.ID, 0)

        def Types(self):
            return self.getToken(bever_astParser.Types, 0)

        def block(self):
            return self.getTypedRuleContext(bever_astParser.BlockContext,0)


        def Param(self, i:int=None):
            if i is None:
                return self.getTokens(bever_astParser.Param)
            else:
                return self.getToken(bever_astParser.Param, i)

        def getRuleIndex(self):
            return bever_astParser.RULE_func_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunc_decl" ):
                listener.enterFunc_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunc_decl" ):
                listener.exitFunc_decl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunc_decl" ):
                return visitor.visitFunc_decl(self)
            else:
                return visitor.visitChildren(self)




    def func_decl(self):

        localctx = bever_astParser.Func_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_func_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(bever_astParser.Access_decl)
            self.state = 36
            self.match(bever_astParser.ID)

            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==9:
                self.state = 37
                self.match(bever_astParser.Param)
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 43
            self.match(bever_astParser.T__3)
            self.state = 44
            self.match(bever_astParser.Types)
            self.state = 45
            self.match(bever_astParser.T__4)
            self.state = 46
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





