/* The following code was generated by JFlex 1.4.3 on 21.10.13 02:59 */

/*
 * AssemblerFrTokenMaker.java - An object that can take a chunk of text and
 * return a linked list of tokens representing Fujitsu Fr assembler.
 * Based on AssemblerX86TokenMaker.java by Robert Futrell
 */
package com.nikonhacker.gui.component.sourceCode.syntaxHighlighter;

import javax.swing.text.Segment;
import java.io.IOException;

import org.fife.ui.rsyntaxtextarea.*;


/**
 * This class takes plain text and returns tokens representing Fr
 * assembler.<p>
 *
 * This implementation was created using
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1; however, the generated file
 * was modified for performance.  Memory allocation needs to be almost
 * completely removed to be competitive with the handwritten lexers (subclasses
 * of <code>AbstractTokenMaker</code>, so this class has been modified so that
 * Strings are never allocated (via yytext()), and the scanner never has to
 * worry about refilling its buffer (needlessly copying chars around).
 * We can achieve this because RText always scans exactly 1 line of tokens at a
 * time, and hands the scanner this line as an array of characters (a Segment
 * really).  Since tokens contain pointers to char arrays instead of Strings
 * holding their contents, there is no need for allocating new memory for
 * Strings.<p>
 *
 * The actual algorithm generated for scanning has, of course, not been
 * modified.<p>
 *
 * If you wish to regenerate this file yourself, keep in mind the following:
 * <ul>
 *   <li>The generated AssemblerFrTokenMaker.java</code> file will contain two
 *       definitions of both <code>zzRefill</code> and <code>yyreset</code>.
 *       You should hand-delete the second of each definition (the ones
 *       generated by the lexer), as these generated methods modify the input
 *       buffer, which we'll never have to do.</li>
 *   <li>You should also change the declaration/definition of zzBuffer to NOT
 *       be initialized.  This is a needless memory allocation for us since we
 *       will be pointing the array somewhere else anyway.</li>
 *   <li>You should NOT call <code>yylex()</code> on the generated scanner
 *       directly; rather, you should use <code>getTokenList</code> as you would
 *       with any other <code>TokenMaker</code> instance.</li>
 * </ul>
 *
 * @author Robert Futrell
 * @version 0.2
 *
 */

public class AssemblerFrTokenMaker extends AbstractJFlexTokenMaker implements TokenMaker {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\7\1\0\1\10\23\0\1\10\1\12\1\4\2\0"+
    "\1\12\1\12\1\5\2\0\1\12\1\12\1\0\1\12\1\0\1\12"+
    "\1\34\1\36\1\15\1\37\1\40\1\50\1\2\1\2\1\42\1\2"+
    "\1\11\1\6\1\12\1\12\1\12\2\0\1\13\1\22\1\16\1\14"+
    "\1\26\1\3\1\44\1\24\1\32\1\45\1\1\1\25\1\31\1\17"+
    "\1\27\1\21\1\43\1\23\1\20\1\30\1\35\1\33\1\46\1\41"+
    "\1\47\1\1\3\0\1\12\1\1\1\0\1\13\1\22\1\16\1\14"+
    "\1\26\1\3\1\44\1\24\1\32\1\45\1\1\1\25\1\31\1\17"+
    "\1\27\1\21\1\43\1\23\1\20\1\30\1\35\1\33\1\46\1\41"+
    "\1\47\1\1\1\0\1\12\1\0\1\12\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\4\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\23\1\1\10\2\0\1\1\1\11\1\12\1\13\1\1"+
    "\1\11\2\1\1\14\1\1\1\14\2\1\1\14\10\1"+
    "\1\15\3\1\3\16\11\1\1\11\1\15\5\1\1\15"+
    "\1\1\1\11\7\1\1\0\1\1\2\15\4\1\1\15"+
    "\4\1\1\15\1\1\1\10\4\1\1\16\3\1\1\15"+
    "\2\1\2\15\2\1\2\17\2\15\4\1\1\16\1\20"+
    "\1\1\1\16\1\10\2\1\1\15\1\0\2\1\2\0"+
    "\1\15\1\0\1\1\1\0\1\1\2\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\51\0\u0148\0\51\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d"+
    "\0\u0386\0\u03af\0\u03d8\0\u0401\0\u042a\0\u0453\0\51\0\u047c"+
    "\0\u04a5\0\u04ce\0\122\0\51\0\51\0\u04f7\0\u04ce\0\u0520"+
    "\0\u0549\0\u04ce\0\u0572\0\122\0\u059b\0\u05c4\0\u0453\0\u05ed"+
    "\0\u0616\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735"+
    "\0\u075e\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d"+
    "\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5"+
    "\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d"+
    "\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c\0\u0c55"+
    "\0\u0c7e\0\u0ca7\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b\0\u0d74\0\u0d9d"+
    "\0\122\0\u0dc6\0\u0def\0\u0e18\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc"+
    "\0\u0ee5\0\u0f0e\0\u0f37\0\u0f60\0\u0f89\0\u0fb2\0\u0fdb\0\u1004"+
    "\0\u0e41\0\u102d\0\u1056\0\u107f\0\u10a8\0\u10d1\0\u10fa\0\u1123"+
    "\0\u114c\0\u114c\0\u10d1\0\u1175\0\u119e\0\u11c7\0\u11f0\0\51"+
    "\0\122\0\u1219\0\122\0\u1242\0\u10a8\0\u126b\0\u0d22\0\u1294"+
    "\0\u12bd\0\u12e6\0\u130f\0\u1338\0\51\0\u1361\0\u138a\0\u13b3"+
    "\0\u13dc\0\u047c\0\122";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\2\1\13\1\14\1\15\1\4\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\3\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\3\1\4\1\32\3\4\1\33"+
    "\1\4\1\34\1\3\1\35\1\36\1\3\1\4\52\0"+
    "\3\3\5\0\1\37\1\0\36\3\1\0\1\40\2\41"+
    "\5\0\1\37\1\0\4\41\3\40\1\41\3\40\1\41"+
    "\5\40\1\41\1\40\3\41\1\40\1\41\5\40\1\41"+
    "\1\0\1\3\2\42\5\0\1\37\1\0\4\42\2\3"+
    "\1\43\1\42\3\3\1\42\5\3\1\42\1\3\3\42"+
    "\1\3\1\42\3\3\1\36\1\3\1\42\4\6\1\44"+
    "\44\6\5\7\1\45\43\7\7\10\1\0\41\10\10\0"+
    "\1\12\41\0\1\3\2\42\5\0\1\37\1\0\1\42"+
    "\1\46\1\42\1\47\1\50\1\51\1\3\1\42\3\3"+
    "\1\42\5\3\1\42\1\3\3\42\1\3\1\42\5\3"+
    "\1\42\1\0\1\3\1\42\1\52\5\0\1\37\1\0"+
    "\1\42\1\52\2\42\3\3\1\52\3\3\1\42\1\53"+
    "\1\54\1\55\1\56\1\3\1\42\1\3\3\42\1\3"+
    "\1\42\1\54\2\3\1\57\1\3\1\42\1\0\1\3"+
    "\2\42\5\0\1\37\1\0\1\60\2\42\1\61\3\3"+
    "\1\42\3\3\1\42\2\3\1\62\2\3\1\42\1\3"+
    "\3\42\1\3\1\42\5\3\1\42\1\0\3\3\5\0"+
    "\1\37\1\0\14\3\1\63\21\3\1\0\3\3\5\0"+
    "\1\37\1\0\1\3\1\34\1\3\1\64\1\3\1\65"+
    "\1\43\1\66\1\67\4\3\1\70\4\3\1\71\10\3"+
    "\1\36\2\3\1\0\3\3\5\0\1\37\1\0\3\3"+
    "\1\43\1\3\1\43\6\3\1\63\5\3\1\72\13\3"+
    "\1\0\1\3\2\42\5\0\1\37\1\0\1\73\2\42"+
    "\1\74\1\75\1\3\1\76\1\42\1\77\1\100\1\101"+
    "\1\102\1\103\1\104\2\3\1\76\1\42\1\3\3\42"+
    "\1\3\1\42\1\3\1\105\2\3\1\106\1\42\1\0"+
    "\1\3\1\43\1\3\5\0\1\37\1\0\2\3\1\43"+
    "\3\3\1\43\4\3\1\107\5\3\1\43\1\3\1\110"+
    "\2\43\1\3\1\43\5\3\1\43\1\0\3\3\5\0"+
    "\1\37\1\0\1\3\1\111\3\3\1\112\5\3\1\113"+
    "\22\3\1\0\1\3\2\42\5\0\1\37\1\0\4\42"+
    "\1\114\2\3\1\42\3\3\1\42\1\115\4\3\1\42"+
    "\1\3\3\42\1\116\1\42\5\3\1\42\1\0\3\3"+
    "\5\0\1\37\1\0\10\3\1\117\25\3\1\0\3\3"+
    "\5\0\1\37\1\0\7\3\1\120\23\3\1\36\2\3"+
    "\1\0\3\3\5\0\1\37\1\0\1\3\1\121\12\3"+
    "\1\122\5\3\1\123\13\3\1\0\3\3\5\0\1\37"+
    "\1\0\4\3\1\124\5\3\1\125\23\3\1\0\3\3"+
    "\5\0\1\37\1\0\5\3\1\65\30\3\1\0\3\3"+
    "\5\0\1\37\1\0\3\3\1\126\32\3\1\0\3\3"+
    "\5\0\1\37\1\0\33\3\1\36\2\3\1\0\3\3"+
    "\5\0\1\37\1\0\16\3\1\127\17\3\1\0\3\3"+
    "\5\0\1\37\1\0\14\3\1\130\21\3\1\0\3\40"+
    "\5\0\1\37\1\0\36\40\1\0\1\40\2\131\5\0"+
    "\1\37\1\0\4\131\3\40\1\131\3\40\1\131\5\40"+
    "\1\131\1\40\3\131\1\40\1\131\5\40\1\131\1\0"+
    "\1\3\2\132\5\0\1\37\1\0\4\132\3\3\1\132"+
    "\3\3\1\132\5\3\1\132\1\3\3\132\1\3\1\132"+
    "\5\3\1\132\1\0\1\3\2\132\5\0\1\37\1\0"+
    "\1\132\1\133\2\132\3\3\1\132\3\3\1\132\5\3"+
    "\1\132\1\3\3\132\1\3\1\132\5\3\1\132\1\0"+
    "\3\3\5\0\1\37\1\0\1\3\1\117\34\3\1\0"+
    "\3\3\5\0\1\37\1\0\10\3\1\134\25\3\1\0"+
    "\3\3\5\0\1\37\1\0\20\3\1\135\15\3\1\0"+
    "\3\3\5\0\1\37\1\0\14\3\1\136\21\3\1\0"+
    "\3\3\5\0\1\37\1\0\20\3\1\137\15\3\1\0"+
    "\1\3\2\132\5\0\1\37\1\0\4\132\3\3\1\132"+
    "\2\3\1\140\1\132\5\3\1\132\1\3\3\132\1\3"+
    "\1\132\5\3\1\132\1\0\1\3\2\132\5\0\1\37"+
    "\1\0\4\132\3\3\1\132\1\43\2\3\1\132\5\3"+
    "\1\132\1\3\3\132\1\3\1\132\5\3\1\132\1\0"+
    "\3\3\5\0\1\37\1\0\6\3\1\134\27\3\1\0"+
    "\3\3\5\0\1\37\1\0\6\3\1\141\27\3\1\0"+
    "\3\3\5\0\1\37\1\0\10\3\1\43\25\3\1\0"+
    "\3\3\5\0\1\37\1\0\6\3\1\43\27\3\1\0"+
    "\3\3\5\0\1\37\1\0\34\3\1\106\1\3\1\0"+
    "\3\3\5\0\1\37\1\0\3\3\1\142\32\3\1\0"+
    "\3\3\5\0\1\37\1\0\7\3\1\141\1\3\1\141"+
    "\4\3\1\143\1\144\2\3\1\145\13\3\1\0\3\3"+
    "\5\0\1\37\1\0\7\3\1\146\26\3\1\0\3\3"+
    "\5\0\1\37\1\0\5\3\1\135\30\3\1\0\1\3"+
    "\2\132\5\0\1\37\1\0\4\132\1\147\2\3\1\132"+
    "\3\3\1\132\5\3\1\132\1\3\3\132\1\3\1\132"+
    "\5\3\1\132\1\0\1\3\2\132\5\0\1\150\1\0"+
    "\4\132\3\3\1\132\3\3\1\132\5\3\1\132\1\3"+
    "\3\132\1\3\1\132\5\3\1\132\1\0\3\3\5\0"+
    "\1\150\1\0\3\3\1\76\7\3\2\76\3\3\1\76"+
    "\15\3\1\0\3\3\5\0\1\150\1\0\36\3\1\0"+
    "\3\3\5\0\1\37\1\0\1\76\35\3\1\0\3\3"+
    "\5\0\1\37\1\0\17\3\1\76\16\3\1\0\3\3"+
    "\5\0\1\37\1\0\5\3\1\76\5\3\1\76\1\3"+
    "\1\76\20\3\1\0\1\3\2\132\5\0\1\37\1\0"+
    "\4\132\3\3\1\132\3\3\1\132\1\103\4\3\1\132"+
    "\1\3\3\132\1\3\1\132\1\76\4\3\1\132\1\0"+
    "\3\3\5\0\1\37\1\0\10\3\1\151\25\3\1\0"+
    "\3\3\5\0\1\37\1\0\5\3\1\152\30\3\1\0"+
    "\3\3\5\0\1\37\1\0\13\3\1\76\1\3\1\76"+
    "\20\3\1\0\3\3\5\0\1\37\1\0\15\3\1\153"+
    "\20\3\1\0\3\3\5\0\1\37\1\0\1\154\14\3"+
    "\1\155\20\3\1\0\3\3\5\0\1\37\1\0\2\3"+
    "\1\43\16\3\1\43\1\3\3\43\7\3\1\43\1\0"+
    "\3\3\5\0\1\37\1\0\16\3\1\143\1\156\2\3"+
    "\1\145\13\3\1\0\3\3\5\0\1\37\1\0\10\3"+
    "\1\134\1\3\1\134\23\3\1\0\3\3\5\0\1\37"+
    "\1\0\1\157\35\3\1\0\3\3\5\0\1\37\1\0"+
    "\15\3\1\160\20\3\1\0\3\3\5\0\1\37\1\0"+
    "\10\3\1\161\25\3\1\0\3\3\5\0\1\37\1\0"+
    "\15\3\1\162\20\3\1\0\3\3\5\0\1\37\1\0"+
    "\3\3\1\163\3\3\1\141\1\3\1\141\24\3\1\0"+
    "\3\3\5\0\1\37\1\0\10\3\1\43\23\3\1\106"+
    "\1\3\1\0\3\3\5\0\1\37\1\0\11\3\2\43"+
    "\23\3\1\0\3\3\5\0\1\37\1\0\20\3\1\141"+
    "\15\3\1\0\3\3\5\0\1\37\1\0\12\3\1\164"+
    "\23\3\1\0\3\3\5\0\1\37\1\0\15\3\1\165"+
    "\20\3\1\0\3\3\5\0\1\37\1\0\16\3\1\43"+
    "\17\3\1\0\3\3\5\0\1\37\1\0\11\3\1\166"+
    "\24\3\1\0\3\3\5\0\1\37\1\0\6\3\1\76"+
    "\27\3\1\0\3\3\5\0\1\37\1\0\10\3\1\167"+
    "\25\3\1\0\1\40\2\170\5\0\1\37\1\0\4\170"+
    "\3\40\1\170\3\40\1\170\5\40\1\170\1\40\3\170"+
    "\1\40\1\170\5\40\1\170\1\0\1\3\2\171\5\0"+
    "\1\37\1\0\4\171\3\3\1\171\3\3\1\171\5\3"+
    "\1\171\1\3\3\171\1\3\1\171\5\3\1\171\1\0"+
    "\1\3\2\171\5\0\1\37\1\0\2\171\2\172\1\134"+
    "\1\63\1\3\1\171\3\3\1\171\5\3\1\171\1\3"+
    "\3\171\1\3\1\171\5\3\1\171\1\0\3\3\5\0"+
    "\1\37\1\0\2\3\1\141\33\3\1\0\3\3\5\0"+
    "\1\37\1\0\11\3\1\141\24\3\1\0\3\3\5\0"+
    "\1\37\1\0\20\3\1\173\15\3\1\0\3\3\5\0"+
    "\1\37\1\0\2\3\1\141\16\3\1\174\1\3\2\141"+
    "\1\175\10\3\1\0\3\3\5\0\1\37\1\0\12\3"+
    "\1\76\23\3\1\0\3\3\5\0\1\37\1\0\11\3"+
    "\1\176\24\3\1\0\3\3\5\0\1\37\1\0\21\3"+
    "\1\141\1\3\1\141\12\3\1\0\3\3\5\0\1\37"+
    "\1\0\12\3\1\177\23\3\1\0\3\3\5\0\1\37"+
    "\1\0\7\3\1\141\1\3\1\141\24\3\1\0\3\3"+
    "\5\0\1\37\1\0\3\3\2\141\31\3\1\0\3\3"+
    "\5\0\1\37\1\0\1\3\1\151\34\3\14\0\1\200"+
    "\35\0\3\3\5\0\1\37\1\0\11\3\2\141\23\3"+
    "\1\0\3\3\5\0\1\37\1\0\15\3\1\151\20\3"+
    "\1\0\3\3\5\0\1\37\1\0\13\3\1\201\22\3"+
    "\1\0\3\3\5\0\1\37\1\0\12\3\1\202\23\3"+
    "\1\0\3\3\5\0\1\150\1\0\17\3\1\203\16\3"+
    "\1\0\3\3\5\0\1\204\1\0\36\3\1\0\3\3"+
    "\5\0\1\37\1\0\20\3\1\205\15\3\1\0\3\3"+
    "\5\0\1\37\1\0\13\3\1\206\22\3\1\0\3\3"+
    "\5\0\1\37\1\0\5\3\1\145\14\3\1\145\13\3"+
    "\1\0\3\3\5\0\1\37\1\0\3\3\1\206\32\3"+
    "\1\0\3\3\5\0\1\37\1\0\11\3\1\141\10\3"+
    "\1\207\13\3\1\0\3\3\5\0\1\37\1\0\13\3"+
    "\1\141\22\3\1\0\3\3\5\0\1\37\1\0\7\3"+
    "\1\141\26\3\1\0\3\3\5\0\1\37\1\0\1\3"+
    "\1\201\34\3\1\0\1\40\2\210\5\0\1\37\1\0"+
    "\4\210\3\40\1\210\3\40\1\210\5\40\1\210\1\40"+
    "\3\210\1\40\1\210\5\40\1\210\1\0\1\3\2\211"+
    "\5\0\1\37\1\0\4\211\3\3\1\211\3\3\1\211"+
    "\5\3\1\211\1\3\3\211\1\3\1\211\5\3\1\211"+
    "\1\0\3\3\5\0\1\37\1\0\5\3\1\141\14\3"+
    "\1\141\13\3\1\0\3\3\5\0\1\37\1\0\5\3"+
    "\1\141\30\3\1\0\3\3\5\0\1\37\1\0\3\3"+
    "\1\141\15\3\1\141\1\3\1\141\12\3\1\0\3\3"+
    "\5\0\1\37\1\0\16\3\1\141\17\3\1\0\3\3"+
    "\5\0\1\37\1\0\23\3\1\212\1\3\1\201\1\3"+
    "\1\201\6\3\15\0\1\213\21\0\1\214\2\0\1\215"+
    "\7\0\3\3\5\0\1\37\1\0\10\3\1\141\25\3"+
    "\1\0\1\40\2\216\5\0\1\37\1\0\4\216\3\40"+
    "\1\216\3\40\1\216\5\40\1\216\1\40\3\216\1\40"+
    "\1\216\5\40\1\216\1\0\1\3\2\217\5\0\1\37"+
    "\1\0\4\217\3\3\1\217\3\3\1\217\5\3\1\217"+
    "\1\3\3\217\1\3\1\217\5\3\1\217\1\0\3\3"+
    "\5\0\1\37\1\0\21\3\1\201\14\3\34\0\1\215"+
    "\31\0\1\215\34\0\1\40\2\220\5\0\1\37\1\0"+
    "\4\220\3\40\1\220\3\40\1\220\5\40\1\220\1\40"+
    "\3\220\1\40\1\220\5\40\1\220\1\0\1\3\2\221"+
    "\5\0\1\37\1\0\4\221\3\3\1\221\3\3\1\221"+
    "\5\3\1\221\1\3\3\221\1\3\1\221\5\3\1\221"+
    "\1\0\1\40\2\222\5\0\1\37\1\0\4\222\3\40"+
    "\1\222\3\40\1\222\5\40\1\222\1\40\3\222\1\40"+
    "\1\222\5\40\1\222\1\0\1\3\2\223\5\0\1\37"+
    "\1\0\4\223\3\3\1\223\3\3\1\223\5\3\1\223"+
    "\1\3\3\223\1\3\1\223\5\3\1\223";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5125];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\1\1\1\11\23\1\1\11"+
    "\2\0\2\1\2\11\63\1\1\0\46\1\1\11\7\1"+
    "\1\0\2\1\2\0\1\11\1\0\1\1\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
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


	/**
	 * Constructor.  We must have this here as JFLex does not generate a
	 * no parameter constructor.
	 */
	public AssemblerFrTokenMaker() {
		super();
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 */
	private void addToken(int tokenType) {
		addToken(zzStartRead, zzMarkedPos-1, tokenType);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 */
	private void addToken(int start, int end, int tokenType) {
		int so = start + offsetShift;
		addToken(zzBuffer, start,end, tokenType, so);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param array The character array.
	 * @param start The starting offset in the array.
	 * @param end The ending offset in the array.
	 * @param tokenType The token's type.
	 * @param startOffset The offset in the document at which this token
	 *                    occurs.
	 */
	public void addToken(char[] array, int start, int end, int tokenType, int startOffset) {
		super.addToken(array, start,end, tokenType, startOffset);
		zzStartRead = zzMarkedPos;
	}


	/**
	 * Returns the text to place at the beginning and end of a
	 * line to "comment" it in a this programming language.
	 *
	 * @return The start and end strings to add to a line to "comment"
	 *         it out.
	 */
	public String[] getLineCommentStartAndEnd() {
		return new String[] { ";", null };
	}


	/**
	 * Returns the first token in the linked list of tokens generated
	 * from <code>text</code>.  This method must be implemented by
	 * subclasses so they can correctly implement syntax highlighting.
	 *
	 * @param text The text from which to get tokens.
	 * @param initialTokenType The token type we should start with.
	 * @param startOffset The offset into the document at which
	 *                    <code>text</code> starts.
	 * @return The first <code>Token</code> in a linked list representing
	 *         the syntax highlighted text.
	 */
	public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

		resetTokenList();
		this.offsetShift = -text.offset + startOffset;

		// Start off in the proper state.
		int state = Token.NULL;
		switch (initialTokenType) {
			default:
				state = Token.NULL;
		}

		s = text;
		try {
			yyreset(zzReader);
			yybegin(state);
			return yylex();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new DefaultToken();
		}

	}

	/**
	 * Returns whether tokens of the specified type should have "mark
	 * occurrences" enabled for the current programming language.
	 * Basically, we return true for everything except blanks
	 *
	 * @param type The token type.
	 * @return Whether tokens of this type should have "mark occurrences"
	 *         enabled.
	 */
	public boolean getMarkOccurrencesOfTokenType(int type) {
        return     type == Token.IDENTIFIER
                || type == Token.FUNCTION
                || type == Token.RESERVED_WORD
                || type == Token.RESERVED_WORD_2
                || type == Token.DATA_TYPE
                || type == Token.LITERAL_CHAR
                || type == Token.LITERAL_NUMBER_HEXADECIMAL
                || type == Token.ANNOTATION
                || type == Token.OPERATOR
                || type == Token.VARIABLE;
	}


	/**
	 * Refills the input buffer.
	 *
	 * @return      <code>true</code> if EOF was reached, otherwise
	 *              <code>false</code>.
	 * @exception   IOException  if any I/O-Error occurs.
	 */
	private boolean zzRefill() throws java.io.IOException {
		return zzCurrentPos>=s.offset+s.count;
	}


	/**
	 * Resets the scanner to read from a new input stream.
	 * Does not close the old reader.
	 *
	 * All internal variables are reset, the old input stream 
	 * <b>cannot</b> be reused (internal buffer is discarded and lost).
	 * Lexical state is set to <tt>YY_INITIAL</tt>.
	 *
	 * @param reader   the new input stream 
	 */
	public final void yyreset(java.io.Reader reader) throws java.io.IOException {
		// 's' has been updated.
		zzBuffer = s.array;
		/*
		 * We replaced the line below with the two below it because zzRefill
		 * no longer "refills" the buffer (since the way we do it, it's always
		 * "full" the first time through, since it points to the segment's
		 * array).  So, we assign zzEndRead here.
		 */
		//zzStartRead = zzEndRead = s.offset;
		zzStartRead = s.offset;
		zzEndRead = zzStartRead + s.count - 1;
		zzCurrentPos = zzMarkedPos = s.offset;
		zzLexicalState = YYINITIAL;
		zzReader = reader;
		zzAtBOL  = true;
		zzAtEOF  = false;
	}




  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AssemblerFrTokenMaker(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AssemblerFrTokenMaker(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public org.fife.ui.rsyntaxtextarea.Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { addToken(Token.RESERVED_WORD);
          }
        case 18: break;
        case 1: 
          { addToken(Token.IDENTIFIER);
          }
        case 19: break;
        case 12: 
          { addToken(Token.FUNCTION);
          }
        case 20: break;
        case 10: 
          { addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
          }
        case 21: break;
        case 4: 
          { addToken(Token.COMMENT_EOL); addNullToken(); return firstToken;
          }
        case 22: break;
        case 15: 
          { addToken(Token.ANNOTATION);
          }
        case 23: break;
        case 14: 
          { addToken(Token.RESERVED_WORD_2);
          }
        case 24: break;
        case 9: 
          { addToken(Token.VARIABLE);
          }
        case 25: break;
        case 6: 
          { addToken(Token.WHITESPACE);
          }
        case 26: break;
        case 8: 
          { addToken(Token.PREPROCESSOR);
          }
        case 27: break;
        case 16: 
          { addToken(Token.DATA_TYPE);
          }
        case 28: break;
        case 3: 
          { addToken(Token.ERROR_CHAR); /*addNullToken(); return firstToken;*/
          }
        case 29: break;
        case 17: 
          { addToken(Token.LITERAL_NUMBER_HEXADECIMAL);
          }
        case 30: break;
        case 7: 
          { addToken(Token.OPERATOR);
          }
        case 31: break;
        case 11: 
          { addToken(Token.LITERAL_CHAR);
          }
        case 32: break;
        case 2: 
          { addToken(Token.ERROR_STRING_DOUBLE); addNullToken(); return firstToken;
          }
        case 33: break;
        case 5: 
          { addNullToken(); return firstToken;
          }
        case 34: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              addNullToken(); return firstToken;
            }
            case 148: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
