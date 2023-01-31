// Generated from java-escape by ANTLR 4.11.1
package antlr_stuff;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RezeptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, UNIT=5, WORD=6, NUMBER=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "UNIT", "WORD", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Rezept'", "'Zutaten:'", "'Zubereitungsschritte:'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "UNIT", "WORD", "NUMBER", "WS"
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


	public RezeptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rezept.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\bV\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001\u0005"+
		"\u0004\u0005G\b\u0005\u000b\u0005\f\u0005H\u0001\u0006\u0004\u0006L\b"+
		"\u0006\u000b\u0006\f\u0006M\u0001\u0007\u0004\u0007Q\b\u0007\u000b\u0007"+
		"\f\u0007R\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  ]\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000"+
		"\u0000\u0000\u0003\u0018\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000"+
		"\u0000\u00077\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000b"+
		"F\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fP\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0005R\u0000\u0000\u0012\u0013\u0005e\u0000\u0000"+
		"\u0013\u0014\u0005z\u0000\u0000\u0014\u0015\u0005e\u0000\u0000\u0015\u0016"+
		"\u0005p\u0000\u0000\u0016\u0017\u0005t\u0000\u0000\u0017\u0002\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005Z\u0000\u0000\u0019\u001a\u0005u\u0000\u0000"+
		"\u001a\u001b\u0005t\u0000\u0000\u001b\u001c\u0005a\u0000\u0000\u001c\u001d"+
		"\u0005t\u0000\u0000\u001d\u001e\u0005e\u0000\u0000\u001e\u001f\u0005n"+
		"\u0000\u0000\u001f \u0005:\u0000\u0000 \u0004\u0001\u0000\u0000\u0000"+
		"!\"\u0005Z\u0000\u0000\"#\u0005u\u0000\u0000#$\u0005b\u0000\u0000$%\u0005"+
		"e\u0000\u0000%&\u0005r\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005i\u0000"+
		"\u0000()\u0005t\u0000\u0000)*\u0005u\u0000\u0000*+\u0005n\u0000\u0000"+
		"+,\u0005g\u0000\u0000,-\u0005s\u0000\u0000-.\u0005s\u0000\u0000./\u0005"+
		"c\u0000\u0000/0\u0005h\u0000\u000001\u0005r\u0000\u000012\u0005i\u0000"+
		"\u000023\u0005t\u0000\u000034\u0005t\u0000\u000045\u0005e\u0000\u0000"+
		"56\u0005:\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005.\u0000\u0000"+
		"8\b\u0001\u0000\u0000\u00009:\u0005m\u0000\u0000:D\u0005g\u0000\u0000"+
		";D\u0005g\u0000\u0000<=\u0005k\u0000\u0000=D\u0005g\u0000\u0000>?\u0005"+
		"m\u0000\u0000?D\u0005l\u0000\u0000@D\u0005l\u0000\u0000AB\u0005d\u0000"+
		"\u0000BD\u0005l\u0000\u0000C9\u0001\u0000\u0000\u0000C;\u0001\u0000\u0000"+
		"\u0000C<\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000D\n\u0001\u0000\u0000\u0000EG\u0007"+
		"\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\f\u0001\u0000\u0000"+
		"\u0000JL\u0007\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000e"+
		"\u0001\u0000\u0000\u0000OQ\u0007\u0002\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0006\u0007\u0000\u0000U\u0010"+
		"\u0001\u0000\u0000\u0000\u0005\u0000CHMR\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}