/* The following code was generated by JFlex 1.4.3 on 10/20/11 5:04 PM */

package com.aptana.editor.js.sdoc.parsing;

import java.io.Reader;
import java.io.StringReader;

import beaver.Scanner;
import beaver.Symbol;

import com.aptana.editor.js.parsing.Terminals;
import com.aptana.editor.js.sdoc.lexer.SDocTokenType;

/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a> 1.4.3 on 10/20/11 5:04 PM from the
 * specification file <tt>SDoc.flex</tt>
 */
@SuppressWarnings("nls")
class SDocFlexScanner extends Scanner
{

	/** This character denotes the end of file */
	public static final int YYEOF = -1;

	/** initial size of the lookahead buffer */
	private static final int ZZ_BUFFERSIZE = 16384;

	/** lexical states */
	public static final int TYPES = 2;
	public static final int YYINITIAL = 0;

	/**
	 * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l ZZ_LEXSTATE[l+1] is the state in the DFA for the
	 * lexical state l at the beginning of a line l is of the form l = 2*k, k a non negative integer
	 */
	private static final int ZZ_LEXSTATE[] = { 0, 1, 2, 2 };

	/**
	 * Translates characters to character classes
	 */
	private static final String ZZ_CMAP_PACKED = "\11\4\1\6\1\1\1\0\1\2\1\1\16\4\4\0\1\6\2\0"
			+ "\1\37\1\3\3\0\1\47\1\50\1\7\1\0\1\54\1\56\1\5" + "\1\10\12\4\1\53\1\0\1\51\1\0\1\52\1\0\1\11\1\44"
			+ "\1\36\1\46\1\30\1\36\1\45\24\36\1\40\1\0\1\41\1\0" + "\1\3\1\0\1\12\1\36\1\16\1\13\1\17\2\36\1\25\1\21"
			+ "\2\36\1\20\1\33\1\15\1\26\1\31\1\36\1\27\1\22\1\24"
			+ "\1\23\1\14\1\34\1\32\1\35\1\36\1\42\1\55\1\43\1\0" + "\41\4\2\0\4\3\4\0\1\36\2\0\1\4\7\0\1\36\4\0"
			+ "\1\36\5\0\27\36\1\0\37\36\1\0\u013f\36\31\0\162\36\4\0"
			+ "\14\36\16\0\5\36\11\0\1\36\21\0\130\4\5\0\23\4\12\0" + "\1\36\13\0\1\36\1\0\3\36\1\0\1\36\1\0\24\36\1\0"
			+ "\54\36\1\0\46\36\1\0\5\36\4\0\202\36\1\0\4\4\3\0"
			+ "\105\36\1\0\46\36\2\0\2\36\6\0\20\36\41\0\46\36\2\0" + "\1\36\7\0\47\36\11\0\21\4\1\0\27\4\1\0\3\4\1\0"
			+ "\1\4\1\0\2\4\1\0\1\4\13\0\33\36\5\0\3\36\15\0" + "\4\4\14\0\6\4\13\0\32\36\5\0\13\36\16\4\7\0\12\4"
			+ "\4\0\2\36\1\4\143\36\1\0\1\36\10\4\1\0\6\4\2\36" + "\2\4\1\0\4\4\2\36\12\4\3\36\2\0\1\36\17\0\1\4"
			+ "\1\36\1\4\36\36\33\4\2\0\3\36\60\0\46\36\13\4\1\36"
			+ "\u014f\0\3\4\66\36\2\0\1\4\1\36\20\4\2\0\1\36\4\4" + "\3\0\12\36\2\4\2\0\12\4\21\0\3\4\1\0\10\36\2\0"
			+ "\2\36\2\0\26\36\1\0\7\36\1\0\1\36\3\0\4\36\2\0" + "\1\4\1\36\7\4\2\0\2\4\2\0\3\4\11\0\1\4\4\0"
			+ "\2\36\1\0\3\36\2\4\2\0\12\4\2\36\2\3\15\0\3\4" + "\1\0\6\36\4\0\2\36\2\0\26\36\1\0\7\36\1\0\2\36"
			+ "\1\0\2\36\1\0\2\36\2\0\1\4\1\0\5\4\4\0\2\4" + "\2\0\3\4\13\0\4\36\1\0\1\36\7\0\14\4\3\36\14\0"
			+ "\3\4\1\0\11\36\1\0\3\36\1\0\26\36\1\0\7\36\1\0" + "\2\36\1\0\5\36\2\0\1\4\1\36\10\4\1\0\3\4\1\0"
			+ "\3\4\2\0\1\36\17\0\2\36\2\4\2\0\12\4\1\0\1\3" + "\17\0\3\4\1\0\10\36\2\0\2\36\2\0\26\36\1\0\7\36"
			+ "\1\0\2\36\1\0\5\36\2\0\1\4\1\36\6\4\3\0\2\4" + "\2\0\3\4\10\0\2\4\4\0\2\36\1\0\3\36\4\0\12\4"
			+ "\1\0\1\36\20\0\1\4\1\36\1\0\6\36\3\0\3\36\1\0" + "\4\36\3\0\2\36\1\0\1\36\1\0\2\36\3\0\2\36\3\0"
			+ "\3\36\3\0\10\36\1\0\3\36\4\0\5\4\3\0\3\4\1\0" + "\4\4\11\0\1\4\17\0\11\4\11\0\1\3\7\0\3\4\1\0"
			+ "\10\36\1\0\3\36\1\0\27\36\1\0\12\36\1\0\5\36\4\0" + "\7\4\1\0\3\4\1\0\4\4\7\0\2\4\11\0\2\36\4\0"
			+ "\12\4\22\0\2\4\1\0\10\36\1\0\3\36\1\0\27\36\1\0" + "\12\36\1\0\5\36\2\0\1\4\1\36\7\4\1\0\3\4\1\0"
			+ "\4\4\7\0\2\4\7\0\1\36\1\0\2\36\4\0\12\4\22\0" + "\2\4\1\0\10\36\1\0\3\36\1\0\27\36\1\0\20\36\4\0"
			+ "\6\4\2\0\3\4\1\0\4\4\11\0\1\4\10\0\2\36\4\0" + "\12\4\22\0\2\4\1\0\22\36\3\0\30\36\1\0\11\36\1\0"
			+ "\1\36\2\0\7\36\3\0\1\4\4\0\6\4\1\0\1\4\1\0" + "\10\4\22\0\2\4\15\0\60\36\1\4\2\36\7\4\4\0\1\3"
			+ "\7\36\10\4\1\0\12\4\47\0\2\36\1\0\1\36\2\0\2\36" + "\1\0\1\36\2\0\1\36\6\0\4\36\1\0\7\36\1\0\3\36"
			+ "\1\0\1\36\1\0\1\36\2\0\2\36\1\0\4\36\1\4\2\36" + "\6\4\1\0\2\4\1\36\2\0\5\36\1\0\1\36\1\0\6\4"
			+ "\2\0\12\4\2\0\2\36\42\0\1\36\27\0\2\4\6\0\12\4" + "\13\0\1\4\1\0\1\4\1\0\1\4\4\0\2\4\10\36\1\0"
			+ "\42\36\6\0\24\4\1\0\2\4\4\36\4\0\10\4\1\0\44\4" + "\11\0\1\4\71\0\42\36\1\0\5\36\1\0\2\36\1\0\7\4"
			+ "\3\0\4\4\6\0\12\4\6\0\6\36\4\4\106\0\46\36\12\0"
			+ "\51\36\7\0\132\36\5\0\104\36\5\0\122\36\6\0\7\36\1\0" + "\77\36\1\0\1\36\1\0\4\36\2\0\7\36\1\0\1\36\1\0"
			+ "\4\36\2\0\47\36\1\0\1\36\1\0\4\36\2\0\37\36\1\0" + "\1\36\1\0\4\36\2\0\7\36\1\0\1\36\1\0\4\36\2\0"
			+ "\7\36\1\0\7\36\1\0\27\36\1\0\37\36\1\0\1\36\1\0" + "\4\36\2\0\7\36\1\0\47\36\1\0\23\36\16\0\11\4\56\0"
			+ "\125\36\14\0\u026c\36\2\0\10\36\12\0\32\36\5\0\113\36\3\0"
			+ "\3\3\17\0\15\36\1\0\4\36\3\4\13\0\22\36\3\4\13\0" + "\22\36\2\4\14\0\15\36\1\0\3\36\1\0\2\4\14\0\64\36"
			+ "\40\4\3\0\1\36\3\0\1\3\1\36\1\4\2\0\12\4\41\0" + "\3\4\2\0\12\4\6\0\130\36\10\0\51\36\1\4\126\0\35\36"
			+ "\3\0\14\4\4\0\14\4\12\0\12\4\36\36\2\0\5\36\u038b\0"
			+ "\154\36\224\0\234\36\4\0\132\36\6\0\26\36\2\0\6\36\2\0"
			+ "\46\36\2\0\6\36\2\0\10\36\1\0\1\36\1\0\1\36\1\0" + "\1\36\1\0\37\36\2\0\65\36\1\0\7\36\1\0\1\36\3\0"
			+ "\3\36\1\0\7\36\3\0\4\36\2\0\6\36\4\0\15\36\5\0" + "\3\36\1\0\7\36\17\0\4\4\32\0\5\4\20\0\2\3\23\0"
			+ "\1\3\13\0\4\4\6\0\6\4\1\0\1\36\15\0\1\36\40\0" + "\22\3\36\0\15\4\4\0\1\4\3\0\6\4\27\0\1\36\4\0"
			+ "\1\36\2\0\12\36\1\0\1\36\3\0\5\36\6\0\1\36\1\0" + "\1\36\1\0\1\36\1\0\4\36\1\0\3\36\1\0\7\36\3\0"
			+ "\3\36\5\0\5\36\26\0\44\3\u0e81\0\2\36\1\3\31\0\11\3" + "\6\4\1\0\5\36\2\0\3\3\2\36\4\0\126\36\2\0\2\4"
			+ "\2\0\3\36\1\0\132\36\1\3\4\36\5\0\50\36\4\0\136\36"
			+ "\21\0\30\36\70\0\20\36\u0200\0\u19b6\36\112\0\u51a6\36\132\0\u048d\36"
			+ "\u0773\0\u2ba4\36\u215c\0\u012e\36\2\0\73\36\225\0\7\36\14\0\5\36"
			+ "\5\0\1\36\1\4\12\36\1\0\15\36\1\0\5\36\1\0\1\36"
			+ "\1\0\2\36\1\0\2\36\1\0\154\36\41\0\u016b\36\22\0\100\36"
			+ "\2\0\66\36\50\0\14\36\1\3\3\0\20\4\20\0\4\4\17\0" + "\2\3\30\0\3\3\31\0\1\3\6\0\5\36\1\0\207\36\2\0"
			+ "\1\4\4\0\1\3\13\0\12\4\7\0\32\36\4\0\1\3\1\0" + "\32\36\12\0\1\3\131\36\3\0\6\36\2\0\6\36\2\0\6\36"
			+ "\2\0\3\36\3\0\2\3\3\0\2\3\22\0\3\4\4\0";

	/**
	 * Translates characters to character classes
	 */
	private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 = "\3\0\1\1\3\2\2\1\1\3\1\4\1\5\1\6"
			+ "\1\7\1\10\1\2\1\1\1\11\1\12\1\11\1\13" + "\1\14\3\12\1\15\1\16\1\17\1\20\1\21\1\22"
			+ "\1\23\1\11\1\24\1\1\14\3\1\0\3\25\1\0" + "\3\12\1\26\1\27\17\3\1\30\3\12\12\3\1\31"
			+ "\7\3\3\12\12\3\1\32\6\3\1\33\1\12\1\34" + "\1\3\1\35\12\3\1\36\3\3\1\12\1\3\1\37"
			+ "\10\3\1\40\2\3\1\41\1\12\4\3\1\42\1\3" + "\1\43\2\3\1\44\1\3\1\45\1\46\4\3\1\47"
			+ "\1\50\1\51\1\52\2\3\1\53\3\3\1\54\4\3" + "\1\55";

	private static int[] zzUnpackAction()
	{
		int[] result = new int[182];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result)
	{
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l)
		{
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"
			+ "\0\u0178\0\u01a7\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\215\0\u0205"
			+ "\0\u0234\0\u01d6\0\u0263\0\u0292\0\u01d6\0\u01d6\0\u02c1\0\u02f0"
			+ "\0\u031f\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6"
			+ "\0\u034e\0\215\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468"
			+ "\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0"
			+ "\0\215\0\u01d6\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c\0\u01d6"
			+ "\0\215\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5"
			+ "\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d"
			+ "\0\u01d6\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6"
			+ "\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u03db\0\u0bef"
			+ "\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67"
			+ "\0\u0d96\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf"
			+ "\0\u0f0e\0\u0f3d\0\u0f6c\0\u03db\0\u0f9b\0\u0fca\0\u0ff9\0\u1028"
			+ "\0\u1057\0\u1086\0\u0263\0\u10b5\0\u0263\0\u10e4\0\u03db\0\u1113"
			+ "\0\u1142\0\u1171\0\u11a0\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b"
			+ "\0\u12ba\0\u03db\0\u12e9\0\u1318\0\u1347\0\u1376\0\u13a5\0\u03db"
			+ "\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\u14bf\0\u14ee\0\u151d"
			+ "\0\u03db\0\u154c\0\u157b\0\u03db\0\u15aa\0\u15d9\0\u1608\0\u1637"
			+ "\0\u1666\0\u03db\0\u1695\0\u03db\0\u16c4\0\u16f3\0\u03db\0\u1722"
			+ "\0\u0263\0\u03db\0\u1751\0\u1780\0\u17af\0\u17de\0\u03db\0\u03db"
			+ "\0\u03db\0\u03db\0\u180d\0\u183c\0\u03db\0\u186b\0\u189a\0\u18c9"
			+ "\0\u03db\0\u18f8\0\u1927\0\u1956\0\u1985\0\u03db";

	private static int[] zzUnpackRowMap()
	{
		int[] result = new int[182];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result)
	{
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l)
		{
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 = "\1\4\1\5\1\6\3\4\1\7\1\10\1\11\1\12"
			+ "\25\4\1\13\1\14\1\15\1\16\1\17\14\4\1\5" + "\1\6\3\4\1\20\1\21\1\11\1\12\25\4\1\13"
			+ "\1\14\1\15\1\16\1\17\13\4\1\22\1\5\1\7" + "\1\23\1\22\1\24\1\7\3\22\25\23\1\22\1\14"
			+ "\1\15\1\25\1\26\1\27\1\30\1\31\1\32\1\33" + "\1\34\1\35\1\36\1\37\1\40\1\41\1\4\1\0"
			+ "\4\4\1\0\30\4\4\0\14\4\1\0\1\5\55\0" + "\1\4\1\0\1\6\3\4\1\7\30\4\4\0\14\4"
			+ "\2\0\1\7\3\0\1\7\50\0\1\4\1\0\4\4" + "\1\0\1\4\1\42\26\4\4\0\15\4\1\0\4\4"
			+ "\1\0\1\43\27\4\4\0\15\4\1\0\4\4\1\0" + "\3\4\1\44\2\45\1\46\1\47\1\50\1\45\1\51"
			+ "\1\52\1\45\1\53\1\45\1\54\1\55\1\45\1\56" + "\1\45\1\57\3\45\4\0\1\4\3\45\10\4\61\0"
			+ "\1\7\3\0\1\20\1\60\47\0\1\61\1\62\4\61" + "\1\63\1\61\1\42\26\61\4\62\14\61\3\0\3\23"
			+ "\4\0\25\23\5\0\3\23\15\0\1\64\54\0\3\23" + "\4\0\15\23\1\65\7\23\5\0\3\23\13\0\3\23"
			+ "\4\0\11\23\1\66\13\23\5\0\3\23\13\0\3\23" + "\4\0\6\23\1\67\16\23\5\0\3\23\62\0\1\70"
			+ "\4\0\1\4\1\0\4\4\1\0\1\71\27\4\4\0" + "\15\4\1\0\4\4\1\0\3\4\1\45\1\72\4\45"
			+ "\1\73\2\45\1\74\13\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\25\45\4\0\1\4\3\45"
			+ "\11\4\1\0\4\4\1\0\3\4\1\75\24\45\4\0" + "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\6\45"
			+ "\1\76\5\45\1\77\10\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\20\45\1\100\4\45\4\0"
			+ "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\3\45" + "\1\101\21\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\5\45\1\102\17\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\23\45\1\103\1\45"
			+ "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4" + "\2\45\1\104\22\45\4\0\1\4\3\45\11\4\1\0"
			+ "\4\4\1\0\3\4\5\45\1\105\17\45\4\0\1\4" + "\3\45\11\4\1\0\4\4\1\0\3\4\1\106\14\45"
			+ "\1\107\7\45\4\0\1\4\3\45\11\4\1\0\4\4" + "\1\0\3\4\5\45\1\110\17\45\4\0\1\4\3\45"
			+ "\10\4\6\62\1\63\1\62\1\0\46\62\5\0\1\111" + "\54\0\3\23\4\0\15\23\1\112\7\23\5\0\3\23"
			+ "\13\0\3\23\4\0\3\23\1\113\21\23\5\0\3\23" + "\13\0\3\23\4\0\1\114\24\23\5\0\3\23\10\0"
			+ "\1\4\1\0\4\4\1\0\3\4\2\45\1\115\22\45" + "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4"
			+ "\7\45\1\116\15\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\12\45\1\117\12\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\21\45\1\120" + "\3\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\1\121\24\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\3\45\1\122\21\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\1\123\3\45" + "\1\124\5\45\1\125\12\45\4\0\1\4\3\45\11\4"
			+ "\1\0\4\4\1\0\3\4\12\45\1\126\12\45\4\0" + "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\5\45"
			+ "\1\127\17\45\4\0\1\4\3\45\11\4\1\0\4\4" + "\1\0\3\4\17\45\1\130\5\45\4\0\1\4\3\45"
			+ "\11\4\1\0\4\4\1\0\3\4\5\45\1\131\17\45" + "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4"
			+ "\12\45\1\132\12\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\15\45\1\133\7\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\7\45\1\134" + "\4\45\1\135\10\45\4\0\1\4\3\45\11\4\1\0"
			+ "\4\4\1\0\3\4\12\45\1\136\12\45\4\0\1\4" + "\3\45\10\4\3\0\3\23\4\0\1\137\24\23\5\0"
			+ "\3\23\13\0\3\23\4\0\4\23\1\140\20\23\5\0" + "\3\23\13\0\3\23\4\0\10\23\1\141\14\23\5\0"
			+ "\3\23\10\0\1\4\1\0\4\4\1\0\3\4\1\142" + "\24\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\1\143\24\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\13\45\1\144\11\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\5\45\1\145" + "\17\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\10\45\1\146\14\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\10\45\1\147\14\45\4\0"
			+ "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\21\45" + "\1\150\3\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\5\45\1\151\17\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\5\45\1\152\17\45"
			+ "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4" + "\5\45\1\153\17\45\4\0\1\4\3\45\11\4\1\0"
			+ "\4\4\1\0\3\4\5\45\1\154\17\45\4\0\1\4" + "\3\45\11\4\1\0\4\4\1\0\3\4\15\45\1\155"
			+ "\7\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0" + "\3\4\11\45\1\156\13\45\4\0\1\4\3\45\11\4"
			+ "\1\0\4\4\1\0\3\4\1\157\24\45\4\0\1\4" + "\3\45\11\4\1\0\4\4\1\0\3\4\2\45\1\160"
			+ "\22\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0" + "\3\4\17\45\1\161\5\45\4\0\1\4\3\45\11\4"
			+ "\1\0\4\4\1\0\3\4\13\45\1\162\11\45\4\0" + "\1\4\3\45\10\4\3\0\3\23\4\0\23\23\1\163"
			+ "\1\23\5\0\3\23\13\0\3\23\4\0\12\23\1\164" + "\12\23\5\0\3\23\13\0\3\23\4\0\10\23\1\165"
			+ "\14\23\5\0\3\23\10\0\1\4\1\0\4\4\1\0" + "\3\4\3\45\1\166\21\45\4\0\1\4\3\45\11\4"
			+ "\1\0\4\4\1\0\3\4\10\45\1\167\14\45\4\0" + "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\14\45"
			+ "\1\170\10\45\4\0\1\4\3\45\11\4\1\0\4\4" + "\1\0\3\4\10\45\1\171\14\45\4\0\1\4\3\45"
			+ "\11\4\1\0\4\4\1\0\3\4\10\45\1\172\14\45" + "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4"
			+ "\12\45\1\173\12\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\17\45\1\174\5\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\17\45\1\175" + "\5\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\3\45\1\176\21\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\15\45\1\177\7\45\4\0"
			+ "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\2\45" + "\1\200\22\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\15\45\1\201\7\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\21\45\1\202\3\45"
			+ "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4" + "\1\203\24\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\5\45\1\204\17\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\14\45\1\205\10\45"
			+ "\4\0\1\4\3\45\10\4\3\0\3\23\4\0\7\23" + "\1\206\15\23\5\0\3\23\10\0\1\4\1\0\4\4"
			+ "\1\0\3\4\4\45\1\207\20\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\15\45\1\210\7\45"
			+ "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4" + "\17\45\1\211\5\45\4\0\1\4\3\45\11\4\1\0"
			+ "\4\4\1\0\3\4\16\45\1\212\6\45\4\0\1\4" + "\3\45\11\4\1\0\4\4\1\0\3\4\15\45\1\213"
			+ "\7\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0" + "\3\4\6\45\1\214\16\45\4\0\1\4\3\45\11\4"
			+ "\1\0\4\4\1\0\3\4\12\45\1\215\12\45\4\0" + "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\1\45"
			+ "\1\216\23\45\4\0\1\4\3\45\11\4\1\0\4\4" + "\1\0\3\4\3\45\1\217\21\45\4\0\1\4\3\45"
			+ "\11\4\1\0\4\4\1\0\3\4\7\45\1\220\15\45" + "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4"
			+ "\3\45\1\221\21\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\12\45\1\222\12\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\15\45\1\223" + "\7\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\1\45\1\224\23\45\4\0\1\4\3\45\10\4" + "\3\0\3\23\4\0\14\23\1\225\10\23\5\0\3\23"
			+ "\10\0\1\4\1\0\4\4\1\0\3\4\5\45\1\226" + "\17\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\1\227\24\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\5\45\1\230\17\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\11\45\1\231" + "\13\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\5\45\1\232\17\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\7\45\1\233\15\45\4\0"
			+ "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\10\45" + "\1\234\14\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\1\235\24\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\5\45\1\236\17\45\4\0"
			+ "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\5\45" + "\1\237\17\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\12\45\1\240\12\45\4\0\1\4\3\45" + "\10\4\3\0\3\23\4\0\3\23\1\241\21\23\5\0"
			+ "\3\23\10\0\1\4\1\0\4\4\1\0\3\4\1\45" + "\1\242\23\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\4\45\1\243\20\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\10\45\1\244\14\45"
			+ "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4" + "\4\45\1\245\20\45\4\0\1\4\3\45\11\4\1\0"
			+ "\4\4\1\0\3\4\14\45\1\246\10\45\4\0\1\4" + "\3\45\11\4\1\0\4\4\1\0\3\4\6\45\1\247"
			+ "\16\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0" + "\3\4\22\45\1\250\2\45\4\0\1\4\3\45\11\4"
			+ "\1\0\4\4\1\0\3\4\23\45\1\251\1\45\4\0" + "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\5\45"
			+ "\1\252\17\45\4\0\1\4\3\45\11\4\1\0\4\4" + "\1\0\3\4\4\45\1\253\20\45\4\0\1\4\3\45"
			+ "\11\4\1\0\4\4\1\0\3\4\12\45\1\254\12\45" + "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4"
			+ "\3\45\1\255\21\45\4\0\1\4\3\45\11\4\1\0" + "\4\4\1\0\3\4\15\45\1\256\7\45\4\0\1\4"
			+ "\3\45\11\4\1\0\4\4\1\0\3\4\14\45\1\257" + "\10\45\4\0\1\4\3\45\11\4\1\0\4\4\1\0"
			+ "\3\4\7\45\1\260\15\45\4\0\1\4\3\45\11\4" + "\1\0\4\4\1\0\3\4\15\45\1\261\7\45\4\0"
			+ "\1\4\3\45\11\4\1\0\4\4\1\0\3\4\17\45" + "\1\262\5\45\4\0\1\4\3\45\11\4\1\0\4\4"
			+ "\1\0\3\4\12\45\1\263\12\45\4\0\1\4\3\45" + "\11\4\1\0\4\4\1\0\3\4\7\45\1\264\15\45"
			+ "\4\0\1\4\3\45\11\4\1\0\4\4\1\0\3\4" + "\14\45\1\265\10\45\4\0\1\4\3\45\11\4\1\0"
			+ "\4\4\1\0\3\4\3\45\1\266\21\45\4\0\1\4" + "\3\45\10\4";

	private static int[] zzUnpackTrans()
	{
		int[] result = new int[6580];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result)
	{
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l)
		{
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/* error codes */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;

	/* error messages for the codes above */
	private static final String ZZ_ERROR_MSG[] = { "Unkown internal scanner error", "Error: could not match input",
			"Error: pushback value was too large" };

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\3\0\7\1\4\11\3\1\1\11\2\1\2\11\3\1"
			+ "\7\11\17\1\1\0\1\1\1\11\1\1\1\0\3\1" + "\1\11\20\1\1\11\155\1";

	private static int[] zzUnpackAttribute()
	{
		int[] result = new int[182];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result)
	{
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l)
		{
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** the input device */
	private java.io.Reader zzReader;

	/** the current state of the DFA */
	private int zzState;

	/** the current lexical state */
	private int zzLexicalState = YYINITIAL;

	/**
	 * this buffer contains the current text to be matched and is the source of the yytext() string
	 */
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	/** the textposition at the last accepting state */
	private int zzMarkedPos;

	/** the current text position in the buffer */
	private int zzCurrentPos;

	/** startRead marks the beginning of the yytext() string in the buffer */
	private int zzStartRead;

	/**
	 * endRead marks the last character in the buffer, that has been read from input
	 */
	private int zzEndRead;

	/** number of newlines encountered up to the start of the matched text */
	private int yyline;

	/** the number of characters up to the start of the matched text */
	private int yychar;

	/**
	 * the number of characters from the last newline up to the start of the matched text
	 */
	private int yycolumn;

	/**
	 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
	 */
	private boolean zzAtBOL = true;

	/** zzAtEOF == true <=> the scanner is at the EOF */
	private boolean zzAtEOF;

	/** denotes if the user-EOF-code has already been executed */
	private boolean zzEOFDone;

	/* user code: */
	private int _offset;

	public SDocFlexScanner()
	{
		this((Reader) null);
	}

	private Symbol newToken(SDocTokenType type, Object value)
	{
		// System.out.println(type + ":~" + yytext() + "~");
		return newToken(type.getIndex(), value);
	}

	private Symbol newToken(short id, Object value)
	{
		int start = yychar + _offset;
		int end = start + yylength() - 1;

		return new Symbol(id, start, end, value);
	}

	public Symbol nextToken() throws java.io.IOException, Scanner.Exception
	{
		Symbol result;

		try
		{
			// get next token
			result = yylex();
		}
		catch (Scanner.Exception e)
		{
			// create default token type
			String text = yytext();
			int end = yychar + text.length() - 1;

			result = new Symbol(SDocTokenType.EOF.getIndex(), yychar, end, text);
		}

		return result;
	}

	public void setOffset(int offset)
	{
		_offset = offset;
	}

	public void setSource(String source)
	{
		yyreset(new StringReader(source));
	}

	/**
	 * Creates a new scanner There is also a java.io.InputStream version of this constructor.
	 * 
	 * @param in
	 *            the java.io.Reader to read input from.
	 */
	SDocFlexScanner(java.io.Reader in)
	{
		this.zzReader = in;
	}

	/**
	 * Creates a new scanner. There is also java.io.Reader version of this constructor.
	 * 
	 * @param in
	 *            the java.io.Inputstream to read input from.
	 */
	SDocFlexScanner(java.io.InputStream in)
	{
		this(new java.io.InputStreamReader(in));
	}

	/**
	 * Unpacks the compressed character translation table.
	 * 
	 * @param packed
	 *            the packed character translation table
	 * @return the unpacked character translation table
	 */
	private static char[] zzUnpackCMap(String packed)
	{
		char[] map = new char[0x10000];
		int i = 0; /* index in packed string */
		int j = 0; /* index in unpacked array */
		while (i < 1778)
		{
			int count = packed.charAt(i++);
			char value = packed.charAt(i++);
			do
				map[j++] = value;
			while (--count > 0);
		}
		return map;
	}

	/**
	 * Refills the input buffer.
	 * 
	 * @return <code>false</code>, iff there was new input.
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException
	{

		/* first: make room (if you can) */
		if (zzStartRead > 0)
		{
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);

			/* translate stored positions */
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzStartRead = 0;
		}

		/* is the buffer big enough? */
		if (zzCurrentPos >= zzBuffer.length)
		{
			/* if not: blow it up */
			char newBuffer[] = new char[zzCurrentPos * 2];
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
		}

		/* finally: fill the buffer with new input */
		int numRead = zzReader.read(zzBuffer, zzEndRead, zzBuffer.length - zzEndRead);

		if (numRead > 0)
		{
			zzEndRead += numRead;
			return false;
		}
		// unlikely but not impossible: read 0 characters, but not at end of stream
		if (numRead == 0)
		{
			int c = zzReader.read();
			if (c == -1)
			{
				return true;
			}
			else
			{
				zzBuffer[zzEndRead++] = (char) c;
				return false;
			}
		}

		// numRead < 0
		return true;
	}

	/**
	 * Closes the input stream.
	 */
	public final void yyclose() throws java.io.IOException
	{
		zzAtEOF = true; /* indicate end of file */
		zzEndRead = zzStartRead; /* invalidate buffer */

		if (zzReader != null)
			zzReader.close();
	}

	/**
	 * Resets the scanner to read from a new input stream. Does not close the old reader. All internal variables are
	 * reset, the old input stream <b>cannot</b> be reused (internal buffer is discarded and lost). Lexical state is set
	 * to <tt>ZZ_INITIAL</tt>.
	 * 
	 * @param reader
	 *            the new input stream
	 */
	public final void yyreset(java.io.Reader reader)
	{
		zzReader = reader;
		zzAtBOL = true;
		zzAtEOF = false;
		zzEOFDone = false;
		zzEndRead = zzStartRead = 0;
		zzCurrentPos = zzMarkedPos = 0;
		yyline = yychar = yycolumn = 0;
		zzLexicalState = YYINITIAL;
	}

	/**
	 * Returns the current lexical state.
	 */
	public final int yystate()
	{
		return zzLexicalState;
	}

	/**
	 * Enters a new lexical state
	 * 
	 * @param newState
	 *            the new lexical state
	 */
	public final void yybegin(int newState)
	{
		zzLexicalState = newState;
	}

	/**
	 * Returns the text matched by the current regular expression.
	 */
	public final String yytext()
	{
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	/**
	 * Returns the character at position <tt>pos</tt> from the matched text. It is equivalent to yytext().charAt(pos),
	 * but faster
	 * 
	 * @param pos
	 *            the position of the character to fetch. A value from 0 to yylength()-1.
	 * @return the character at position pos
	 */
	public final char yycharat(int pos)
	{
		return zzBuffer[zzStartRead + pos];
	}

	/**
	 * Returns the length of the matched text region.
	 */
	public final int yylength()
	{
		return zzMarkedPos - zzStartRead;
	}

	/**
	 * Reports an error that occured while scanning. In a wellformed scanner (no or only correct usage of
	 * yypushback(int) and a match-all fallback rule) this method will only be called with things that
	 * "Can't Possibly Happen". If this method is called, something is seriously wrong (e.g. a JFlex bug producing a
	 * faulty scanner etc.). Usual syntax/scanner level error handling should be done in error fallback rules.
	 * 
	 * @param errorCode
	 *            the code of the errormessage to display
	 */
	private void zzScanError(int errorCode)
	{
		String message;
		try
		{
			message = ZZ_ERROR_MSG[errorCode];
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}

	/**
	 * Pushes the specified amount of characters back into the input stream. They will be read again by then next call
	 * of the scanning method
	 * 
	 * @param number
	 *            the number of characters to be read again. This number must not be greater than yylength()!
	 */
	public void yypushback(int number)
	{
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}

	/**
	 * Resumes scanning until the next regular expression is matched, the end of input is encountered or an I/O-Error
	 * occurs.
	 * 
	 * @return the next token
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	public Symbol yylex() throws java.io.IOException, Scanner.Exception
	{
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;
		char[] zzCMapL = ZZ_CMAP;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true)
		{
			zzMarkedPosL = zzMarkedPos;

			yychar += zzMarkedPosL - zzStartRead;

			if (zzMarkedPosL > zzStartRead)
			{
				switch (zzBufferL[zzMarkedPosL - 1])
				{
					case '\n':
					case '\u000B':
					case '\u000C':
					case '\u0085':
					case '\u2028':
					case '\u2029':
						zzAtBOL = true;
						break;
					case '\r':
						if (zzMarkedPosL < zzEndReadL)
							zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
						else if (zzAtEOF)
							zzAtBOL = false;
						else
						{
							boolean eof = zzRefill();
							zzMarkedPosL = zzMarkedPos;
							zzEndReadL = zzEndRead;
							zzBufferL = zzBuffer;
							if (eof)
								zzAtBOL = false;
							else
								zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
						}
						break;
					default:
						zzAtBOL = false;
				}
			}
			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			if (zzAtBOL)
				zzState = ZZ_LEXSTATE[zzLexicalState + 1];
			else
				zzState = ZZ_LEXSTATE[zzLexicalState];

			zzForAction:
			{
				while (true)
				{

					if (zzCurrentPosL < zzEndReadL)
						zzInput = zzBufferL[zzCurrentPosL++];
					else if (zzAtEOF)
					{
						zzInput = YYEOF;
						break zzForAction;
					}
					else
					{
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof)
						{
							zzInput = YYEOF;
							break zzForAction;
						}
						else
						{
							zzInput = zzBufferL[zzCurrentPosL++];
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					if (zzNext == -1)
						break zzForAction;
					zzState = zzNext;

					int zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1)
					{
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8)
							break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction])
			{
				case 2:
				{ /* ignore */
				}
				case 46:
					break;
				case 21:
					// lookahead expression with fixed lookahead length
					yypushback(1);
					{ /* ignore */
					}
				case 47:
					break;
				case 1:
				{
					return newToken(SDocTokenType.TEXT, yytext());
				}
				case 48:
					break;
				case 22:
				{
					return newToken(SDocTokenType.ARROW, yytext());
				}
				case 49:
					break;
				case 24:
				{
					return newToken(SDocTokenType.ELLIPSIS, yytext());
				}
				case 50:
					break;
				case 13:
				{
					return newToken(SDocTokenType.LPAREN, yytext());
				}
				case 51:
					break;
				case 34:
				{
					return newToken(SDocTokenType.EXAMPLE, yytext());
				}
				case 52:
					break;
				case 41:
				{
					return newToken(SDocTokenType.PROPERTY, yytext());
				}
				case 53:
					break;
				case 25:
				{
					return newToken(SDocTokenType.SEE, yytext());
				}
				case 54:
					break;
				case 12:
				{
					yybegin(YYINITIAL);
					return newToken(SDocTokenType.RCURLY, yytext());
				}
				case 55:
					break;
				case 35:
				{
					return newToken(SDocTokenType.EXTENDS, yytext());
				}
				case 56:
					break;
				case 5:
				{
					return newToken(SDocTokenType.LBRACKET, yytext());
				}
				case 57:
					break;
				case 39:
				{
					return newToken(SDocTokenType.INTERNAL, yytext());
				}
				case 58:
					break;
				case 27:
				{
					return newToken(SDocTokenType.ARRAY, yytext());
				}
				case 59:
					break;
				case 33:
				{
					return newToken(SDocTokenType.METHOD, yytext());
				}
				case 60:
					break;
				case 20:
				{
					return newToken(SDocTokenType.END_DOCUMENTATION, yytext());
				}
				case 61:
					break;
				case 40:
				{
					return newToken(SDocTokenType.OVERVIEW, yytext());
				}
				case 62:
					break;
				case 19:
				{
					return newToken(SDocTokenType.PIPE, yytext());
				}
				case 63:
					break;
				case 30:
				{
					return newToken(SDocTokenType.PARAM, yytext());
				}
				case 64:
					break;
				case 42:
				{
					return newToken(SDocTokenType.NAMESPACE, yytext());
				}
				case 65:
					break;
				case 31:
				{
					return newToken(SDocTokenType.AUTHOR, yytext());
				}
				case 66:
					break;
				case 36:
				{
					return newToken(SDocTokenType.PRIVATE, yytext());
				}
				case 67:
					break;
				case 8:
				{
					return newToken(SDocTokenType.RCURLY, yytext());
				}
				case 68:
					break;
				case 6:
				{
					return newToken(SDocTokenType.RBRACKET, yytext());
				}
				case 69:
					break;
				case 43:
				{
					return newToken(SDocTokenType.EXCEPTION, yytext());
				}
				case 70:
					break;
				case 3:
				{
					return newToken(SDocTokenType.UNKNOWN, yytext());
				}
				case 71:
					break;
				case 32:
				{
					return newToken(SDocTokenType.RETURN, yytext());
				}
				case 72:
					break;
				case 7:
				{
					yybegin(TYPES);
					return newToken(SDocTokenType.LCURLY, yytext());
				}
				case 73:
					break;
				case 28:
				{
					return newToken(SDocTokenType.CLASS, yytext());
				}
				case 74:
					break;
				case 44:
				{
					return newToken(SDocTokenType.CONSTRUCTOR, yytext());
				}
				case 75:
					break;
				case 9:
				{
					return newToken(SDocTokenType.ERROR, yytext());
				}
				case 76:
					break;
				case 14:
				{
					return newToken(SDocTokenType.RPAREN, yytext());
				}
				case 77:
					break;
				case 10:
				{
					return newToken(SDocTokenType.IDENTIFIER, yytext());
				}
				case 78:
					break;
				case 17:
				{
					return newToken(SDocTokenType.COLON, yytext());
				}
				case 79:
					break;
				case 29:
				{
					return newToken(SDocTokenType.ALIAS, yytext());
				}
				case 80:
					break;
				case 4:
				{
					return newToken(SDocTokenType.POUND, yytext());
				}
				case 81:
					break;
				case 38:
				{
					return newToken(SDocTokenType.ADVANCED, yytext());
				}
				case 82:
					break;
				case 18:
				{
					return newToken(SDocTokenType.COMMA, yytext());
				}
				case 83:
					break;
				case 45:
				{
					return newToken(SDocTokenType.CLASS_DESCRIPTION, yytext());
				}
				case 84:
					break;
				case 37:
				{
					return newToken(SDocTokenType.FUNCTION, yytext());
				}
				case 85:
					break;
				case 16:
				{
					return newToken(SDocTokenType.GREATER_THAN, yytext());
				}
				case 86:
					break;
				case 11:
				{
					return newToken(SDocTokenType.LCURLY, yytext());
				}
				case 87:
					break;
				case 15:
				{
					return newToken(SDocTokenType.LESS_THAN, yytext());
				}
				case 88:
					break;
				case 26:
				{
					return newToken(SDocTokenType.TYPE, yytext());
				}
				case 89:
					break;
				case 23:
				{
					return newToken(SDocTokenType.START_DOCUMENTATION, yytext());
				}
				case 90:
					break;
				default:
					if (zzInput == YYEOF && zzStartRead == zzCurrentPos)
					{
						zzAtEOF = true;
						{
							return newToken(Terminals.EOF, "end-of-file");
						}
					}
					else
					{
						zzScanError(ZZ_NO_MATCH);
					}
			}
		}
	}

}
