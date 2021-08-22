// Generated from br\u005Cufscar\dc\compiladores\la\lexical\analyzer\LALexer.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.la.lexical.analyzer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PalvraChave=1, OP_LOGICO=2, NUM_INT=3, NUM_REAL=4, IDENT=5, CADEIA=6, 
		COMENTARIO=7, ESPACO=8, LINHA=9, DELIMITADOR=10, ABRE_PAR=11, FECHA_PAR=12, 
		ABRE_COL=13, FECHA_COL=14, OP_ARIT=15, OP_REL=16, ATE=17, VIRGULA=18, 
		PONTO=19, ERRO=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PalvraChave", "OP_LOGICO", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", 
			"COMENTARIO", "ESPACO", "LINHA", "DELIMITADOR", "ABRE_PAR", "FECHA_PAR", 
			"ABRE_COL", "FECHA_COL", "OP_ARIT", "OP_REL", "ATE", "VIRGULA", "PONTO", 
			"ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'\n'", "':'", 
			"'('", "')'", "'['", "']'", null, null, "'..'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PalvraChave", "OP_LOGICO", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", 
			"COMENTARIO", "ESPACO", "LINHA", "DELIMITADOR", "ABRE_PAR", "FECHA_PAR", 
			"ABRE_COL", "FECHA_COL", "OP_ARIT", "OP_REL", "ATE", "VIRGULA", "PONTO", 
			"ERRO"
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


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LALexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u017b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0120\n\2\3\3\3\3\3\3\5\3\u0125\n"+
		"\3\3\4\6\4\u0128\n\4\r\4\16\4\u0129\3\5\6\5\u012d\n\5\r\5\16\5\u012e\3"+
		"\5\3\5\6\5\u0133\n\5\r\5\16\5\u0134\3\6\5\6\u0138\n\6\3\6\7\6\u013b\n"+
		"\6\f\6\16\6\u013e\13\6\3\7\3\7\7\7\u0142\n\7\f\7\16\7\u0145\13\7\3\7\3"+
		"\7\3\b\3\b\7\b\u014b\n\b\f\b\16\b\u014e\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0171\n\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\4\u0143\u014c\2\26\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\13"+
		"\17\17\"\"\7\2\'(,-//\61\61``\2\u01a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3\u011f\3\2\2\2\5\u0124\3\2\2\2\7\u0127\3\2\2\2\t\u012c\3\2\2\2"+
		"\13\u0137\3\2\2\2\r\u013f\3\2\2\2\17\u0148\3\2\2\2\21\u0153\3\2\2\2\23"+
		"\u0157\3\2\2\2\25\u015b\3\2\2\2\27\u015d\3\2\2\2\31\u015f\3\2\2\2\33\u0161"+
		"\3\2\2\2\35\u0163\3\2\2\2\37\u0165\3\2\2\2!\u0170\3\2\2\2#\u0172\3\2\2"+
		"\2%\u0175\3\2\2\2\'\u0177\3\2\2\2)\u0179\3\2\2\2+,\7c\2\2,-\7n\2\2-.\7"+
		"i\2\2./\7q\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7v\2\2\62\63\7o\2\2\63\u0120"+
		"\7q\2\2\64\65\7h\2\2\65\66\7k\2\2\66\67\7o\2\2\678\7a\2\289\7c\2\29:\7"+
		"n\2\2:;\7i\2\2;<\7q\2\2<=\7t\2\2=>\7k\2\2>?\7v\2\2?@\7o\2\2@\u0120\7q"+
		"\2\2AB\7f\2\2BC\7g\2\2CD\7e\2\2DE\7n\2\2EF\7c\2\2FG\7t\2\2G\u0120\7g\2"+
		"\2HI\7e\2\2IJ\7q\2\2JK\7p\2\2KL\7u\2\2LM\7v\2\2MN\7c\2\2NO\7p\2\2OP\7"+
		"v\2\2P\u0120\7g\2\2QR\7v\2\2RS\7k\2\2ST\7r\2\2T\u0120\7q\2\2UV\7n\2\2"+
		"VW\7k\2\2WX\7v\2\2XY\7g\2\2YZ\7t\2\2Z[\7c\2\2[\u0120\7n\2\2\\]\7k\2\2"+
		"]^\7p\2\2^_\7v\2\2_`\7g\2\2`a\7k\2\2ab\7t\2\2b\u0120\7q\2\2cd\7t\2\2d"+
		"e\7g\2\2ef\7c\2\2f\u0120\7n\2\2gh\7n\2\2hi\7q\2\2ij\7i\2\2jk\7k\2\2kl"+
		"\7e\2\2l\u0120\7q\2\2mn\7x\2\2no\7g\2\2op\7t\2\2pq\7f\2\2qr\7c\2\2rs\7"+
		"f\2\2st\7g\2\2tu\7k\2\2uv\7t\2\2v\u0120\7q\2\2wx\7h\2\2xy\7c\2\2yz\7n"+
		"\2\2z{\7u\2\2{\u0120\7q\2\2|}\7t\2\2}~\7g\2\2~\177\7i\2\2\177\u0080\7"+
		"k\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0120"+
		"\7q\2\2\u0084\u0085\7h\2\2\u0085\u0086\7k\2\2\u0086\u0087\7o\2\2\u0087"+
		"\u0088\7a\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7i\2\2"+
		"\u008b\u008c\7k\2\2\u008c\u008d\7u\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0120\7q\2\2\u0090\u0091\7h\2\2\u0091\u0092\7w\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7e\2\2\u0094\u0095\7c\2\2\u0095\u0120\7q\2\2"+
		"\u0096\u0097\7h\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099\u009a"+
		"\7a\2\2\u009a\u009b\7h\2\2\u009b\u009c\7w\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7e\2\2\u009e\u009f\7c\2\2\u009f\u0120\7q\2\2\u00a0\u00a1\7x\2\2"+
		"\u00a1\u00a2\7c\2\2\u00a2\u0120\7t\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7k\2\2\u00a6\u0120\7c\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\u00ad\7x\2\2\u00ad\u0120\7c\2\2\u00ae\u00af\7u\2\2\u00af\u0120"+
		"\7g\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u0120\7q\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7\u00b8\7p\2\2\u00b8\u00b9\7c\2\2\u00b9\u0120\7q\2\2\u00ba\u00bb"+
		"\7h\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7a\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u0120\7g\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7u\2\2\u00c3\u0120\7q\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7l\2\2\u00c7\u0120\7c\2\2\u00c8\u00c9\7h\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7a\2\2\u00cc\u00cd\7e\2\2"+
		"\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u0120\7q\2\2\u00d0\u00d1"+
		"\7r\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u0120\7c\2\2\u00d4"+
		"\u00d5\7>\2\2\u00d5\u0120\7/\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u0120\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7e\2\2\u00dc\u0120\7c\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7k\2\2\u00df"+
		"\u00e0\7o\2\2\u00e0\u00e1\7a\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7t\2\2\u00e4\u0120\7c\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\u00e8\7s\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u0120\7q\2\2\u00ed\u00ee\7h\2\2"+
		"\u00ee\u00ef\7k\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2"+
		"\7g\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7s\2\2\u00f4\u00f5\7w\2\2\u00f5"+
		"\u00f6\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8\u0120\7q\2\2"+
		"\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd"+
		"\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7p\2\2\u00ff\u0120\7g\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7c\2\2\u0102\u0120\7q\2\2\u0103\u0104\7r\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0106\7q\2\2\u0106\u0107\7e\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7f\2\2\u0109\u010a\7k\2\2\u010a\u010b\7o\2\2\u010b"+
		"\u010c\7g\2\2\u010c\u010d\7p\2\2\u010d\u010e\7v\2\2\u010e\u0120\7q\2\2"+
		"\u010f\u0110\7h\2\2\u0110\u0111\7k\2\2\u0111\u0112\7o\2\2\u0112\u0113"+
		"\7a\2\2\u0113\u0114\7r\2\2\u0114\u0115\7t\2\2\u0115\u0116\7q\2\2\u0116"+
		"\u0117\7e\2\2\u0117\u0118\7g\2\2\u0118\u0119\7f\2\2\u0119\u011a\7k\2\2"+
		"\u011a\u011b\7o\2\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d\u011e"+
		"\7v\2\2\u011e\u0120\7q\2\2\u011f+\3\2\2\2\u011f\64\3\2\2\2\u011fA\3\2"+
		"\2\2\u011fH\3\2\2\2\u011fQ\3\2\2\2\u011fU\3\2\2\2\u011f\\\3\2\2\2\u011f"+
		"c\3\2\2\2\u011fg\3\2\2\2\u011fm\3\2\2\2\u011fw\3\2\2\2\u011f|\3\2\2\2"+
		"\u011f\u0084\3\2\2\2\u011f\u0090\3\2\2\2\u011f\u0096\3\2\2\2\u011f\u00a0"+
		"\3\2\2\2\u011f\u00a3\3\2\2\2\u011f\u00a7\3\2\2\2\u011f\u00ae\3\2\2\2\u011f"+
		"\u00b0\3\2\2\2\u011f\u00b5\3\2\2\2\u011f\u00ba\3\2\2\2\u011f\u00c0\3\2"+
		"\2\2\u011f\u00c4\3\2\2\2\u011f\u00c8\3\2\2\2\u011f\u00d0\3\2\2\2\u011f"+
		"\u00d4\3\2\2\2\u011f\u00d6\3\2\2\2\u011f\u00d9\3\2\2\2\u011f\u00dd\3\2"+
		"\2\2\u011f\u00e5\3\2\2\2\u011f\u00ed\3\2\2\2\u011f\u00f9\3\2\2\2\u011f"+
		"\u0100\3\2\2\2\u011f\u0103\3\2\2\2\u011f\u010f\3\2\2\2\u0120\4\3\2\2\2"+
		"\u0121\u0125\7g\2\2\u0122\u0123\7q\2\2\u0123\u0125\7w\2\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\6\3\2\2\2\u0126\u0128\4\62;\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\b\3\2\2\2\u012b\u012d\4\62;\2\u012c\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\7\60\2\2\u0131\u0133\4\62;\2\u0132\u0131\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\n\3\2\2\2\u0136\u0138"+
		"\t\2\2\2\u0137\u0136\3\2\2\2\u0138\u013c\3\2\2\2\u0139\u013b\t\3\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\7$\2\2\u0140\u0142"+
		"\n\4\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7$"+
		"\2\2\u0147\16\3\2\2\2\u0148\u014c\7}\2\2\u0149\u014b\n\4\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\177\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0152\b\b\2\2\u0152\20\3\2\2\2\u0153\u0154\t\5\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\b\t\2\2\u0156\22\3\2\2\2\u0157\u0158\7\f\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\b\n\2\2\u015a\24\3\2\2\2\u015b\u015c"+
		"\7<\2\2\u015c\26\3\2\2\2\u015d\u015e\7*\2\2\u015e\30\3\2\2\2\u015f\u0160"+
		"\7+\2\2\u0160\32\3\2\2\2\u0161\u0162\7]\2\2\u0162\34\3\2\2\2\u0163\u0164"+
		"\7_\2\2\u0164\36\3\2\2\2\u0165\u0166\t\6\2\2\u0166 \3\2\2\2\u0167\u0171"+
		"\7@\2\2\u0168\u0169\7@\2\2\u0169\u0171\7?\2\2\u016a\u0171\7>\2\2\u016b"+
		"\u016c\7>\2\2\u016c\u0171\7?\2\2\u016d\u016e\7>\2\2\u016e\u0171\7@\2\2"+
		"\u016f\u0171\7?\2\2\u0170\u0167\3\2\2\2\u0170\u0168\3\2\2\2\u0170\u016a"+
		"\3\2\2\2\u0170\u016b\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\"\3\2\2\2\u0172\u0173\7\60\2\2\u0173\u0174\7\60\2\2\u0174$\3\2\2\2\u0175"+
		"\u0176\7.\2\2\u0176&\3\2\2\2\u0177\u0178\7\60\2\2\u0178(\3\2\2\2\u0179"+
		"\u017a\13\2\2\2\u017a*\3\2\2\2\16\2\u011f\u0124\u0129\u012e\u0134\u0137"+
		"\u013a\u013c\u0143\u014c\u0170\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}