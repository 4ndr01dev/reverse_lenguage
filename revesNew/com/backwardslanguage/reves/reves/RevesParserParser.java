// Generated from RevesParser.g4 by ANTLR 4.4
package com.backwardslanguage.reves.reves;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RevesParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, MINUS=4, MULT=5, DIV=6, PLUS=7, EXP=8, AND=9, 
		NOT=10, OR=11, GT=12, LT=13, GEQ=14, LEQ=15, EQ=16, NEQ=17, BRACKET_OPEN=18, 
		BRACKET_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ASSIGN=23, 
		OPERATION=24, INT_TYPE=25, REAL_TYPE=26, BOOL_TYPE=27, STRING_TYPE=28, 
		BEGIN_RW=29, END_RW=30, IF_RW=31, ELSE_RW=32, WHILE_RW=33, FOR_RW=34, 
		WRITE_RW=35, READ_RW=36, TRUE_LITERAL=37, FALSE_LITERAL=38, UNARY=39, 
		ID=40, NUMBER=41, WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "PROGRAM", "'rav'", "'nltnirp'", "'-'", "'*'", "'/'", "'+'", 
		"'^'", "'&&'", "'!'", "'||'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
		"'}'", "'{'", "')'", "'('", "';'", "'='", "'operation'", "'int'", "'real'", 
		"'bool'", "'string'", "'nigeb'", "'dne'", "'fi'", "'esle'", "'elihw'", 
		"'rof'", "'etirw'", "'daer'", "'true'", "'false'", "UNARY", "ID", "NUMBER", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assingn = 3, 
		RULE_println = 4, RULE_rof = 5, RULE_fi = 6, RULE_condicion = 7;
	public static final String[] ruleNames = {
		"program", "sentence", "var_decl", "var_assingn", "println", "rof", "fi", 
		"condicion"
	};

	@Override
	public String getGrammarFileName() { return "RevesParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RevesParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(RevesParserParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(RevesParserParser.BRACKET_OPEN, 0); }
		public TerminalNode PROGRAM() { return getToken(RevesParserParser.PROGRAM, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(PROGRAM);
			setState(17); match(ID);
			setState(18); match(BRACKET_OPEN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(19); sentence();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Var_assingnContext var_assingn() {
			return getRuleContext(Var_assingnContext.class,0);
		}
		public FiContext fi() {
			return getRuleContext(FiContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public RofContext rof() {
			return getRuleContext(RofContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); var_assingn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); println();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30); fi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31); rof();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(RevesParserParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(VAR);
			setState(35); match(ID);
			setState(36); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assingnContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RevesParserParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public Var_assingnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assingn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterVar_assingn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitVar_assingn(this);
		}
	}

	public final Var_assingnContext var_assingn() throws RecognitionException {
		Var_assingnContext _localctx = new Var_assingnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assingn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(NUMBER);
			setState(39); match(ASSIGN);
			setState(40); match(ID);
			setState(41); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public TerminalNode PRINTLN() { return getToken(RevesParserParser.PRINTLN, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(44); match(PRINTLN);
			setState(45); match(SEMICOLON);
			System.out.println('hola');
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RofContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(RevesParserParser.NUMBER, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Var_assingnContext var_assingn() {
			return getRuleContext(Var_assingnContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(RevesParserParser.ID, i);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(RevesParserParser.BRACKET_OPEN, 0); }
		public List<TerminalNode> ID() { return getTokens(RevesParserParser.ID); }
		public TerminalNode ASSIGN() { return getToken(RevesParserParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(RevesParserParser.VAR, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(RevesParserParser.BRACKET_CLOSE, 0); }
		public TerminalNode FOR_RW() { return getToken(RevesParserParser.FOR_RW, 0); }
		public TerminalNode PLUS() { return getToken(RevesParserParser.PLUS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(RevesParserParser.NUMBER); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public RofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterRof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitRof(this);
		}
	}

	public final RofContext rof() throws RecognitionException {
		RofContext _localctx = new RofContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(FOR_RW);
			setState(49); var_assingn();
			setState(50); condicion();
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(52); match(SEMICOLON);
			setState(53); match(ID);
			setState(54); match(ASSIGN);
			setState(55); match(ID);
			setState(56); match(PLUS);
			setState(57); match(NUMBER);
			setState(58); match(BRACKET_OPEN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(59); sentence();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FiContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(RevesParserParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(RevesParserParser.BRACKET_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(RevesParserParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(RevesParserParser.BRACKET_OPEN, 0); }
		public TerminalNode IF_RW() { return getToken(RevesParserParser.IF_RW, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public FiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterFi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitFi(this);
		}
	}

	public final FiContext fi() throws RecognitionException {
		FiContext _localctx = new FiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(IF_RW);
			setState(68); match(PAR_OPEN);
			setState(69); condicion();
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(71); match(PAR_CLOSE);
			setState(72); match(BRACKET_OPEN);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(73); sentence();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public TerminalNode GEQ() { return getToken(RevesParserParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(RevesParserParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(RevesParserParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(RevesParserParser.LT, 0); }
		public TerminalNode GT() { return getToken(RevesParserParser.GT, 0); }
		public TerminalNode EQ() { return getToken(RevesParserParser.EQ, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(ID);
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,W\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\7\2\27"+
		"\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4"+
		"\6\b\n\f\16\20\2\5\3\2*+\4\2\4\4++\3\2\16\23U\2\22\3\2\2\2\4\"\3\2\2\2"+
		"\6$\3\2\2\2\b(\3\2\2\2\n-\3\2\2\2\f\62\3\2\2\2\16E\3\2\2\2\20S\3\2\2\2"+
		"\22\23\7\3\2\2\23\24\7*\2\2\24\30\7\24\2\2\25\27\5\4\3\2\26\25\3\2\2\2"+
		"\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2"+
		"\33\34\7\25\2\2\34\3\3\2\2\2\35#\5\6\4\2\36#\5\b\5\2\37#\5\n\6\2 #\5\16"+
		"\b\2!#\5\f\7\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2\"!\3"+
		"\2\2\2#\5\3\2\2\2$%\7\4\2\2%&\7*\2\2&\'\7\30\2\2\'\7\3\2\2\2()\7+\2\2"+
		")*\7\31\2\2*+\7*\2\2+,\7\30\2\2,\t\3\2\2\2-.\t\2\2\2./\7\5\2\2/\60\7\30"+
		"\2\2\60\61\b\6\1\2\61\13\3\2\2\2\62\63\7$\2\2\63\64\5\b\5\2\64\65\5\20"+
		"\t\2\65\66\t\3\2\2\66\67\7\30\2\2\678\7*\2\289\7\31\2\29:\7*\2\2:;\7\t"+
		"\2\2;<\7+\2\2<@\7\24\2\2=?\5\4\3\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AC\3\2\2\2B@\3\2\2\2CD\7\25\2\2D\r\3\2\2\2EF\7!\2\2FG\7\26\2\2GH\5"+
		"\20\t\2HI\t\2\2\2IJ\7\27\2\2JN\7\24\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\25\2\2R\17\3\2\2\2ST\7*\2"+
		"\2TU\t\4\2\2U\21\3\2\2\2\6\30\"@N";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}