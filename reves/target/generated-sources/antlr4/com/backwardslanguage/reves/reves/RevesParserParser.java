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
		RULE_nltnirp = 4, RULE_rof = 5, RULE_fi = 6, RULE_esle = 7, RULE_elihw = 8, 
		RULE_condicion = 9, RULE_operation = 10;
	public static final String[] ruleNames = {
		"program", "sentence", "var_decl", "var_assingn", "nltnirp", "rof", "fi", 
		"esle", "elihw", "condicion", "operation"
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
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
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
			setState(22); match(PROGRAM);
			setState(23); match(ID);
			setState(24); match(BRACKET_OPEN);
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << ELSE_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(25); sentence();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUMBER) {
					{
					{
					setState(31); operation();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(39); match(BRACKET_CLOSE);
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
		public NltnirpContext nltnirp() {
			return getRuleContext(NltnirpContext.class,0);
		}
		public ElihwContext elihw() {
			return getRuleContext(ElihwContext.class,0);
		}
		public Var_assingnContext var_assingn() {
			return getRuleContext(Var_assingnContext.class,0);
		}
		public FiContext fi() {
			return getRuleContext(FiContext.class,0);
		}
		public EsleContext esle() {
			return getRuleContext(EsleContext.class,0);
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
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); var_assingn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); nltnirp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); fi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45); rof();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46); elihw();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47); esle();
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
			setState(50); match(VAR);
			setState(51); match(ID);
			setState(52); match(SEMICOLON);
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
		public List<TerminalNode> ID() { return getTokens(RevesParserParser.ID); }
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode ID(int i) {
			return getToken(RevesParserParser.ID, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(55); match(ASSIGN);
			setState(56); match(ID);
			setState(57); match(SEMICOLON);
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

	public static class NltnirpContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public TerminalNode PRINTLN() { return getToken(RevesParserParser.PRINTLN, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public NltnirpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nltnirp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterNltnirp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitNltnirp(this);
		}
	}

	public final NltnirpContext nltnirp() throws RecognitionException {
		NltnirpContext _localctx = new NltnirpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nltnirp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(60); match(PRINTLN);
			setState(61); match(SEMICOLON);
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
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(RevesParserParser.ID, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
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
			setState(63); match(FOR_RW);
			setState(64); var_assingn();
			setState(65); condicion();
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(67); match(SEMICOLON);
			setState(68); match(ID);
			setState(69); match(ASSIGN);
			setState(70); match(ID);
			setState(71); match(PLUS);
			setState(72); match(NUMBER);
			setState(73); match(BRACKET_OPEN);
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << ELSE_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(74); sentence();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUMBER) {
					{
					{
					setState(80); operation();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(88); match(BRACKET_CLOSE);
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
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PAR_OPEN() { return getToken(RevesParserParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
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
			setState(90); match(IF_RW);
			setState(91); match(PAR_OPEN);
			setState(92); condicion();
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(94); match(PAR_CLOSE);
			setState(95); match(BRACKET_OPEN);
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << ELSE_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(96); sentence();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUMBER) {
					{
					{
					setState(102); operation();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(110); match(BRACKET_CLOSE);
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

	public static class EsleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(RevesParserParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(RevesParserParser.BRACKET_CLOSE, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PAR_OPEN() { return getToken(RevesParserParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(RevesParserParser.BRACKET_OPEN, 0); }
		public TerminalNode ELSE_RW() { return getToken(RevesParserParser.ELSE_RW, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public EsleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterEsle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitEsle(this);
		}
	}

	public final EsleContext esle() throws RecognitionException {
		EsleContext _localctx = new EsleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_esle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(ELSE_RW);
			setState(113); match(PAR_OPEN);
			setState(114); condicion();
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(116); match(PAR_CLOSE);
			setState(117); match(BRACKET_OPEN);
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << ELSE_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(118); sentence();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUMBER) {
					{
					{
					setState(124); operation();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(132); match(BRACKET_CLOSE);
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

	public static class ElihwContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RevesParserParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(RevesParserParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(RevesParserParser.BRACKET_CLOSE, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PAR_OPEN() { return getToken(RevesParserParser.PAR_OPEN, 0); }
		public TerminalNode WHILE_RW() { return getToken(RevesParserParser.WHILE_RW, 0); }
		public TerminalNode NUMBER() { return getToken(RevesParserParser.NUMBER, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(RevesParserParser.BRACKET_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ElihwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elihw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterElihw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitElihw(this);
		}
	}

	public final ElihwContext elihw() throws RecognitionException {
		ElihwContext _localctx = new ElihwContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elihw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(WHILE_RW);
			setState(135); match(PAR_OPEN);
			setState(136); condicion();
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(138); match(PAR_CLOSE);
			setState(139); match(BRACKET_OPEN);
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF_RW) | (1L << ELSE_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(140); sentence();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUMBER) {
					{
					{
					setState(146); operation();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(154); match(BRACKET_CLOSE);
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
		enterRule(_localctx, 18, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(ID);
			setState(157);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RevesParserParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(RevesParserParser.ID); }
		public TerminalNode SEMICOLON() { return getToken(RevesParserParser.SEMICOLON, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(RevesParserParser.NUMBER, i);
		}
		public TerminalNode MULT() { return getToken(RevesParserParser.MULT, 0); }
		public TerminalNode EXP() { return getToken(RevesParserParser.EXP, 0); }
		public TerminalNode ID(int i) {
			return getToken(RevesParserParser.ID, i);
		}
		public TerminalNode MINUS() { return getToken(RevesParserParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(RevesParserParser.PLUS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(RevesParserParser.NUMBER); }
		public TerminalNode DIV() { return getToken(RevesParserParser.DIV, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RevesParserListener ) ((RevesParserListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << PLUS) | (1L << EXP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(162); match(ASSIGN);
			setState(163); match(ID);
			setState(164); match(SEMICOLON);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\5\2(\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\7\7\7T\n\7\f\7"+
		"\16\7W\13\7\5\7Y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bd\n\b\f\b"+
		"\16\bg\13\b\3\b\7\bj\n\b\f\b\16\bm\13\b\5\bo\n\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083"+
		"\13\t\5\t\u0085\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0090\n\n"+
		"\f\n\16\n\u0093\13\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\5\n\u009b\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6"+
		"\b\n\f\16\20\22\24\26\2\6\3\2*+\4\2\4\4++\3\2\16\23\3\2\6\n\u00b2\2\30"+
		"\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\fA\3\2\2\2\16"+
		"\\\3\2\2\2\20r\3\2\2\2\22\u0088\3\2\2\2\24\u009e\3\2\2\2\26\u00a1\3\2"+
		"\2\2\30\31\7\3\2\2\31\32\7*\2\2\32\'\7\24\2\2\33\35\5\4\3\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37(\3\2\2\2 \36\3\2\2\2!"+
		"#\5\26\f\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2"+
		"\2\'\36\3\2\2\2\'$\3\2\2\2()\3\2\2\2)*\7\25\2\2*\3\3\2\2\2+\63\5\6\4\2"+
		",\63\5\b\5\2-\63\5\n\6\2.\63\5\16\b\2/\63\5\f\7\2\60\63\5\22\n\2\61\63"+
		"\5\20\t\2\62+\3\2\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2"+
		"\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\7\4\2\2\65\66\7*\2\2\66"+
		"\67\7\30\2\2\67\7\3\2\2\289\t\2\2\29:\7\31\2\2:;\7*\2\2;<\7\30\2\2<\t"+
		"\3\2\2\2=>\t\2\2\2>?\7\5\2\2?@\7\30\2\2@\13\3\2\2\2AB\7$\2\2BC\5\b\5\2"+
		"CD\5\24\13\2DE\t\3\2\2EF\7\30\2\2FG\7*\2\2GH\7\31\2\2HI\7*\2\2IJ\7\t\2"+
		"\2JK\7+\2\2KX\7\24\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PY\3\2\2\2QO\3\2\2\2RT\5\26\f\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2VY\3\2\2\2WU\3\2\2\2XO\3\2\2\2XU\3\2\2\2YZ\3\2\2\2Z[\7\25\2\2[\r\3"+
		"\2\2\2\\]\7!\2\2]^\7\26\2\2^_\5\24\13\2_`\t\2\2\2`a\7\27\2\2an\7\24\2"+
		"\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fo\3\2\2\2ge\3\2\2"+
		"\2hj\5\26\f\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2ne\3\2\2\2nk\3\2\2\2op\3\2\2\2pq\7\25\2\2q\17\3\2\2\2rs\7\"\2\2st"+
		"\7\26\2\2tu\5\24\13\2uv\t\2\2\2vw\7\27\2\2w\u0084\7\24\2\2xz\5\4\3\2y"+
		"x\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0085\3\2\2\2}{\3\2\2\2~\u0080"+
		"\5\26\f\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084{\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\25\2\2\u0087\21\3\2\2"+
		"\2\u0088\u0089\7#\2\2\u0089\u008a\7\26\2\2\u008a\u008b\5\24\13\2\u008b"+
		"\u008c\t\2\2\2\u008c\u008d\7\27\2\2\u008d\u009a\7\24\2\2\u008e\u0090\5"+
		"\4\3\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u009b\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\5\26"+
		"\f\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u0091\3\2"+
		"\2\2\u009a\u0097\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\25\2\2\u009d"+
		"\23\3\2\2\2\u009e\u009f\7*\2\2\u009f\u00a0\t\4\2\2\u00a0\25\3\2\2\2\u00a1"+
		"\u00a2\t\2\2\2\u00a2\u00a3\t\5\2\2\u00a3\u00a4\t\2\2\2\u00a4\u00a5\7\31"+
		"\2\2\u00a5\u00a6\7*\2\2\u00a6\u00a7\7\30\2\2\u00a7\27\3\2\2\2\22\36$\'"+
		"\62OUXekn{\u0081\u0084\u0091\u0097\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}