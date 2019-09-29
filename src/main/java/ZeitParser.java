// Generated from G:/InfProjekte/Lexikalische Filter/src/main/ANTLR\Zeit.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZeitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEPERATOR=1, DIGIT=2;
	public static final int
		RULE_zeit = 0, RULE_einheit = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"zeit", "einheit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEPERATOR", "DIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Zeit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZeitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ZeitContext extends ParserRuleContext {
		public List<EinheitContext> einheit() {
			return getRuleContexts(EinheitContext.class);
		}
		public EinheitContext einheit(int i) {
			return getRuleContext(EinheitContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(ZeitParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(ZeitParser.SEPERATOR, i);
		}
		public ZeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZeitListener ) ((ZeitListener)listener).enterZeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZeitListener ) ((ZeitListener)listener).exitZeit(this);
		}
	}

	public final ZeitContext zeit() throws RecognitionException {
		ZeitContext _localctx = new ZeitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_zeit);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(4);
				einheit();
				setState(5);
				match(SEPERATOR);
				setState(6);
				einheit();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(8);
				einheit();
				setState(9);
				match(SEPERATOR);
				setState(10);
				einheit();
				setState(11);
				match(SEPERATOR);
				setState(12);
				einheit();
				}
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

	public static class EinheitContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ZeitParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ZeitParser.DIGIT, i);
		}
		public EinheitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einheit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZeitListener ) ((ZeitListener)listener).enterEinheit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZeitListener ) ((ZeitListener)listener).exitEinheit(this);
		}
	}

	public final EinheitContext einheit() throws RecognitionException {
		EinheitContext _localctx = new EinheitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_einheit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(DIGIT);
			setState(17);
			match(DIGIT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\26\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3"+
		"\3\2\2\4\2\4\2\2\2\24\2\20\3\2\2\2\4\22\3\2\2\2\6\7\5\4\3\2\7\b\7\3\2"+
		"\2\b\t\5\4\3\2\t\21\3\2\2\2\n\13\5\4\3\2\13\f\7\3\2\2\f\r\5\4\3\2\r\16"+
		"\7\3\2\2\16\17\5\4\3\2\17\21\3\2\2\2\20\6\3\2\2\2\20\n\3\2\2\2\21\3\3"+
		"\2\2\2\22\23\7\4\2\2\23\24\7\4\2\2\24\5\3\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}