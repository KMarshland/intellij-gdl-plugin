/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.gdlplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.gdlplugin.psi.GdlTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Gdl.flex</tt>
 */
class GdlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PARENOPEN = 2;
  public static final int WAITING_VALUE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15232 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\1\36\2\12\1\15\1\37\3\12\1\40\10\12\1\41\1\42\5\15\1\43"+
    "\1\44\11\12\1\45\2\12\1\46\4\12\1\47\1\50\1\51\1\12\1\52\1\12\1\53\1\54\1"+
    "\55\3\12\51\15\1\56\3\15\1\57\1\60\4\15\1\61\12\12\1\62\u02c1\12\1\63\277"+
    "\12");

  /* The ZZ_CMAP_Y table has 3328 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\1\1\7\13\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\22\12\13"+
    "\1\4\1\13\1\24\1\4\1\13\1\25\1\4\1\13\1\26\1\27\1\13\1\30\1\31\1\1\1\30\4"+
    "\13\1\32\6\13\1\33\1\34\1\35\1\1\3\13\1\36\6\13\1\16\3\13\1\37\2\13\1\40\1"+
    "\1\1\13\1\41\4\1\1\13\1\42\1\1\1\43\1\22\7\13\1\44\1\4\1\33\1\45\1\34\1\46"+
    "\1\47\1\50\1\44\1\16\1\51\1\45\1\34\1\52\1\53\1\54\1\55\1\56\1\57\1\22\1\34"+
    "\1\60\1\61\1\62\1\44\1\63\1\64\1\45\1\34\1\60\1\65\1\66\1\44\1\67\1\70\1\71"+
    "\1\72\1\32\1\73\1\74\1\55\1\1\1\75\1\76\1\34\1\77\1\100\1\101\1\44\1\1\1\75"+
    "\1\76\1\34\1\102\1\100\1\103\1\44\1\104\1\105\1\76\1\13\1\36\1\106\1\107\1"+
    "\44\1\110\1\111\1\112\1\13\1\113\1\114\1\115\1\55\1\116\1\4\2\13\1\30\1\117"+
    "\1\120\2\1\1\121\1\122\1\123\1\124\1\125\1\126\2\1\1\62\1\127\1\120\1\130"+
    "\1\131\1\13\1\132\1\4\1\133\1\131\1\13\1\132\1\134\3\1\4\13\1\120\4\13\1\40"+
    "\2\13\1\135\2\13\1\136\24\13\1\137\1\140\2\13\1\137\2\13\1\141\1\142\1\14"+
    "\3\13\1\142\3\13\1\36\2\1\1\13\1\1\5\13\1\143\1\4\45\13\1\35\1\13\1\4\1\30"+
    "\4\13\1\144\1\145\1\146\1\147\1\13\1\147\1\13\1\150\1\146\1\151\5\13\1\152"+
    "\1\120\1\1\1\153\1\120\5\13\1\25\2\13\1\30\4\13\1\56\1\13\1\117\2\41\1\55"+
    "\1\13\1\40\1\147\2\13\1\41\1\13\2\120\2\1\1\13\1\41\3\13\1\117\1\13\1\35\2"+
    "\120\1\154\1\117\4\1\4\13\1\41\1\120\1\155\1\150\7\13\1\150\3\13\1\25\1\77"+
    "\2\13\1\40\1\145\4\1\1\156\1\13\1\157\17\13\1\160\21\13\1\143\2\13\1\143\1"+
    "\161\1\13\1\40\3\13\1\162\1\163\1\164\1\132\1\163\2\1\1\165\1\166\1\62\1\167"+
    "\1\1\1\170\1\1\1\132\3\1\2\13\1\62\1\171\1\172\1\173\1\126\1\174\1\1\2\13"+
    "\1\145\62\1\1\55\2\13\1\120\161\1\2\13\1\117\2\13\1\117\10\13\1\175\1\150"+
    "\2\13\1\135\3\13\1\176\1\166\1\13\1\177\4\200\2\13\2\1\1\166\35\1\1\201\1"+
    "\1\1\4\1\202\1\4\4\13\1\203\1\4\4\13\1\136\1\204\1\13\1\40\1\4\4\13\1\117"+
    "\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\56\4\1\135\13\1\56\2\1\10\13\1\132\4"+
    "\1\2\13\1\40\20\13\1\132\1\13\1\41\1\1\3\13\1\205\7\13\1\16\1\1\1\206\1\207"+
    "\5\13\1\210\1\13\1\117\1\25\3\1\1\206\2\13\1\25\1\1\3\13\1\150\4\13\1\56\1"+
    "\120\1\13\1\211\2\13\1\40\2\13\1\150\1\13\1\132\4\13\1\212\1\120\1\13\1\117"+
    "\3\13\1\177\1\40\1\120\1\13\1\112\4\13\1\31\1\153\1\13\1\213\1\214\1\215\1"+
    "\200\2\13\1\136\1\56\7\13\1\216\1\120\72\13\1\150\1\13\1\217\2\13\1\41\20"+
    "\1\26\13\1\40\6\13\1\120\2\1\1\177\1\220\1\34\1\221\1\222\6\13\1\16\1\1\1"+
    "\223\25\13\1\40\1\1\4\13\1\207\2\13\1\25\2\1\1\41\1\13\1\1\1\13\1\224\1\225"+
    "\2\1\1\133\7\13\1\132\1\1\1\120\1\4\1\5\1\4\1\30\1\55\4\13\1\117\1\226\1\227"+
    "\2\1\1\230\1\13\1\14\1\231\2\40\2\1\7\13\1\30\4\1\3\13\1\147\7\1\1\232\10"+
    "\1\1\13\1\132\3\13\2\62\1\1\2\13\1\1\1\13\1\30\2\13\1\30\1\13\1\40\2\13\1"+
    "\233\1\234\2\1\11\13\1\40\1\120\2\13\1\233\1\13\1\41\2\13\1\25\3\13\1\150"+
    "\11\1\23\13\1\177\1\13\1\56\1\25\11\1\1\235\2\13\1\236\1\13\1\56\1\13\1\177"+
    "\1\13\1\117\4\1\1\13\1\237\1\13\1\56\1\13\1\120\4\1\3\13\1\240\4\1\1\241\1"+
    "\242\1\13\1\243\2\1\1\13\1\132\1\13\1\132\2\1\1\131\1\13\1\177\1\1\3\13\1"+
    "\56\1\13\1\56\1\13\1\31\1\13\1\16\6\1\4\13\1\145\3\1\3\13\1\31\3\13\1\31\60"+
    "\1\4\13\1\177\1\1\1\55\1\166\3\13\1\30\1\1\1\13\1\145\1\120\3\13\1\133\1\1"+
    "\2\13\1\244\4\13\1\245\1\246\2\1\1\13\1\22\1\13\1\247\4\1\1\250\1\26\1\145"+
    "\3\13\1\30\1\120\1\33\1\45\1\34\1\60\1\65\1\251\1\252\1\147\10\1\4\13\1\30"+
    "\1\120\2\1\4\13\1\253\1\120\12\1\3\13\1\254\1\62\1\255\2\1\4\13\1\256\1\120"+
    "\2\1\3\13\1\25\1\120\3\1\1\13\1\77\1\41\1\120\26\1\4\13\1\120\1\166\34\1\3"+
    "\13\1\145\20\1\1\34\2\13\1\14\1\62\1\120\1\1\1\207\1\13\1\207\1\131\1\177"+
    "\64\1\71\13\1\120\6\1\6\13\1\117\1\1\14\13\1\150\53\1\2\13\1\117\75\1\44\13"+
    "\1\177\33\1\43\13\1\145\1\13\1\117\1\120\6\1\1\13\1\40\1\147\3\13\1\177\1"+
    "\150\1\120\1\223\1\257\1\13\67\1\4\13\1\147\2\13\1\117\1\166\1\13\4\1\1\62"+
    "\1\1\76\13\1\132\1\1\57\13\1\31\20\1\1\16\77\1\6\13\1\30\1\132\1\145\1\260"+
    "\114\1\1\261\1\262\1\263\1\1\1\264\11\1\1\265\33\1\5\13\1\133\3\13\1\146\1"+
    "\266\1\267\1\270\3\13\1\271\1\272\1\13\1\273\1\274\1\76\24\13\1\254\1\13\1"+
    "\76\1\136\1\13\1\136\1\13\1\133\1\13\1\133\1\117\1\13\1\117\1\13\1\34\1\13"+
    "\1\34\1\13\1\275\3\13\40\1\3\13\1\217\2\13\1\132\1\276\1\167\1\155\1\4\25"+
    "\1\1\14\1\210\1\277\75\1\14\13\1\147\1\177\2\1\4\13\1\30\1\120\112\1\1\270"+
    "\1\13\1\300\1\301\1\302\1\303\1\304\1\305\1\306\1\41\1\307\1\41\47\1\1\13"+
    "\1\120\1\13\1\120\1\13\1\120\47\1\55\13\1\177\2\1\103\13\1\147\15\13\1\40"+
    "\150\13\1\16\25\1\41\13\1\40\56\1\17\13\41\1");

  /* The ZZ_CMAP_A table has 3200 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\1\1\5\1\3\22\0\1\4\7\0\1\35\1\11\6\0\12\34\1\0\1\6\1\7\1\10"+
    "\1\0\1\33\1\0\32\34\4\0\1\34\1\0\1\17\1\16\1\32\1\26\1\15\1\34\1\30\1\34\1"+
    "\21\2\34\1\14\1\31\1\22\1\13\1\23\1\34\1\12\1\20\1\25\1\24\2\34\1\27\2\34"+
    "\12\0\1\1\24\0\1\34\12\0\1\34\4\0\1\34\5\0\27\34\1\0\12\34\4\0\14\34\16\0"+
    "\5\34\7\0\1\34\1\0\1\34\1\0\5\34\1\0\2\34\2\0\4\34\1\0\1\34\6\0\1\34\1\0\3"+
    "\34\1\0\1\34\1\0\4\34\1\0\23\34\1\0\20\34\2\0\1\34\6\0\10\34\10\0\16\34\1"+
    "\0\1\34\1\0\2\34\1\0\2\34\1\0\1\34\10\0\13\34\5\0\3\34\15\0\12\34\4\0\6\34"+
    "\1\0\10\34\2\0\12\34\1\0\23\34\2\0\14\34\2\0\11\34\4\0\1\34\5\0\16\34\2\0"+
    "\14\34\4\0\5\34\1\0\10\34\6\0\20\34\2\0\13\34\2\0\16\34\1\0\1\34\3\0\4\34"+
    "\2\0\11\34\2\0\2\34\2\0\4\34\10\0\1\34\4\0\2\34\1\0\1\34\1\0\3\34\1\0\6\34"+
    "\4\0\2\34\1\0\2\34\1\0\2\34\1\0\2\34\2\0\1\34\1\0\5\34\4\0\2\34\2\0\3\34\3"+
    "\0\1\34\7\0\4\34\1\0\1\34\7\0\20\34\13\0\3\34\1\0\11\34\1\0\2\34\1\0\2\34"+
    "\1\0\5\34\2\0\12\34\1\0\3\34\1\0\3\34\2\0\1\34\30\0\1\34\7\0\3\34\1\0\10\34"+
    "\2\0\6\34\2\0\2\34\2\0\3\34\10\0\2\34\4\0\2\34\1\0\1\34\1\0\1\34\20\0\2\34"+
    "\1\0\6\34\3\0\3\34\1\0\4\34\3\0\2\34\1\0\1\34\1\0\2\34\3\0\2\34\3\0\3\34\3"+
    "\0\5\34\3\0\3\34\1\0\4\34\2\0\1\34\6\0\1\34\10\0\4\34\1\0\10\34\1\0\3\34\1"+
    "\0\30\34\3\0\10\34\1\0\3\34\1\0\4\34\7\0\2\34\1\0\3\34\5\0\4\34\1\0\5\34\2"+
    "\0\4\34\5\0\2\34\7\0\1\34\2\0\2\34\16\0\3\34\1\0\10\34\1\0\7\34\1\0\3\34\1"+
    "\0\5\34\5\0\4\34\7\0\1\34\12\0\6\34\2\0\2\34\1\0\22\34\3\0\10\34\1\0\11\34"+
    "\1\0\1\34\2\0\7\34\3\0\1\34\4\0\6\34\1\0\1\34\1\0\10\34\2\0\2\34\14\0\17\34"+
    "\1\0\12\34\7\0\2\34\1\0\1\34\2\0\2\34\1\0\1\34\2\0\1\34\6\0\4\34\1\0\7\34"+
    "\1\0\3\34\1\0\1\34\1\0\1\34\2\0\2\34\1\0\15\34\1\0\3\34\2\0\5\34\1\0\1\34"+
    "\1\0\6\34\2\0\12\34\2\0\4\34\10\0\2\34\13\0\1\34\1\0\1\34\1\0\1\34\4\0\12"+
    "\34\1\0\24\34\3\0\5\34\1\0\12\34\6\0\1\34\11\0\6\34\1\0\1\34\5\0\1\34\2\0"+
    "\13\34\1\0\15\34\1\0\4\34\2\0\7\34\1\0\1\34\1\0\4\34\2\0\1\34\1\0\4\34\2\0"+
    "\7\34\1\0\1\34\1\0\4\34\2\0\16\34\2\0\6\34\2\0\13\34\3\0\13\34\7\0\15\34\1"+
    "\0\7\34\13\0\4\34\14\0\1\34\1\0\2\34\14\0\4\34\3\0\1\34\4\0\2\34\15\0\3\34"+
    "\11\0\1\34\23\0\10\34\1\0\23\34\1\0\2\34\6\0\6\34\5\0\15\34\1\0\1\34\1\0\1"+
    "\34\1\0\1\34\1\0\6\34\1\0\7\34\1\0\1\34\3\0\3\34\1\0\7\34\3\0\4\34\2\0\6\34"+
    "\14\0\2\1\25\0\1\34\4\0\1\34\14\0\1\34\15\0\1\34\2\0\1\34\4\0\1\34\2\0\12"+
    "\34\1\0\1\34\3\0\5\34\6\0\1\34\1\0\1\34\1\0\1\34\1\0\4\34\1\0\1\34\5\0\5\34"+
    "\4\0\1\34\1\0\5\34\6\0\15\34\7\0\10\34\11\0\7\34\1\0\7\34\6\0\3\34\11\0\5"+
    "\34\2\0\5\34\3\0\7\34\2\0\2\34\2\0\3\34\5\0\16\34\1\0\12\34\1\0\1\34\7\0\11"+
    "\34\2\0\27\34\2\0\15\34\3\0\1\34\1\0\1\34\2\0\1\34\16\0\1\34\2\0\5\34\12\0"+
    "\6\34\2\0\6\34\2\0\6\34\11\0\13\34\1\0\2\34\2\0\7\34\4\0\5\34\3\0\5\34\5\0"+
    "\12\34\1\0\5\34\1\0\1\34\1\0\2\34\1\0\2\34\1\0\12\34\3\0\15\34\3\0\2\34\30"+
    "\0\3\34\2\0\6\34\2\0\6\34\2\0\6\34\2\0\3\34\3\0\14\34\1\0\16\34\1\0\2\34\1"+
    "\0\1\34\15\0\1\34\2\0\4\34\4\0\10\34\1\0\5\34\12\0\6\34\2\0\1\34\1\0\14\34"+
    "\1\0\2\34\3\0\1\34\2\0\4\34\1\0\2\34\12\0\10\34\6\0\6\34\1\0\2\34\5\0\10\34"+
    "\1\0\3\34\1\0\13\34\4\0\3\34\4\0\5\34\2\0\1\34\11\0\5\34\5\0\3\34\3\0\13\34"+
    "\1\0\1\34\3\0\10\34\6\0\1\34\1\0\7\34\1\0\1\34\1\0\4\34\1\0\2\34\6\0\1\34"+
    "\5\0\7\34\2\0\7\34\3\0\6\34\1\0\1\34\10\0\6\34\2\0\10\34\10\0\6\34\2\0\1\34"+
    "\3\0\1\34\13\0\10\34\5\0\15\34\3\0\2\34\6\0\5\34\3\0\6\34\10\0\10\34\2\0\7"+
    "\34\16\0\4\34\4\0\3\34\15\0\1\34\2\0\2\34\2\0\4\34\1\0\14\34\1\0\1\34\1\0"+
    "\7\34\1\0\21\34\1\0\4\34\2\0\10\34\1\0\7\34\1\0\14\34\1\0\4\34\1\0\5\34\1"+
    "\0\1\34\3\0\11\34\1\0\10\34\2\0\2\34\5\0\1\34\12\0\2\34\1\0\2\34\1\0\5\34"+
    "\6\0\2\34\1\0\1\34\2\0\1\34\1\0\12\34\1\0\4\34\1\0\1\34\1\0\1\34\6\0\1\34"+
    "\4\0\1\34\1\0\1\34\1\0\1\34\1\0\3\34\1\0\2\34\1\0\1\34\2\0\1\34\1\0\1\34\1"+
    "\0\1\34\1\0\1\34\1\0\1\34\1\0\2\34\1\0\1\34\2\0\4\34\1\0\7\34\1\0\4\34\1\0"+
    "\4\34\1\0\1\34\1\0\12\34\1\0\5\34\1\0\3\34\1\0\5\34\1\0\5\34");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\1\1\4\11\1\1\5"+
    "\11\6\2\7\13\0\1\10\13\6\2\0\1\11\4\0"+
    "\2\6\1\11\4\6\2\0\2\6\2\0\2\6\1\0"+
    "\1\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[76];
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
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\132"+
    "\0\322\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4"+
    "\0\u01c2\0\132\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276"+
    "\0\u0294\0\u02b2\0\u02d0\0\170\0\u02ee\0\u030c\0\u032a\0\u0348"+
    "\0\u0366\0\u0384\0\u03a2\0\u03c0\0\u03de\0\u03fc\0\u041a\0\u0438"+
    "\0\u01c2\0\u0456\0\u0474\0\u0492\0\u04b0\0\u04ce\0\u04ec\0\u050a"+
    "\0\u0528\0\u0546\0\u0564\0\u0582\0\u05a0\0\u05be\0\132\0\u05dc"+
    "\0\u05fa\0\u0618\0\u0636\0\u0654\0\u0672\0\u01fe\0\u0690\0\u06ae"+
    "\0\u06cc\0\u06ea\0\u0708\0\u0726\0\u0744\0\u0762\0\u0780\0\u079e"+
    "\0\u07bc\0\u07da\0\u07f8\0\u0816";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[76];
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
    "\1\4\5\5\1\6\1\7\1\4\1\10\1\11\1\4"+
    "\1\12\1\4\1\13\2\4\1\14\1\15\2\4\1\16"+
    "\1\17\1\4\1\20\2\4\1\21\1\4\1\22\1\4"+
    "\5\5\1\4\1\7\1\4\1\10\1\23\1\24\1\25"+
    "\1\24\1\26\2\24\1\27\1\30\2\24\1\31\1\32"+
    "\1\24\1\33\2\24\1\4\1\24\2\4\1\5\1\34"+
    "\1\5\1\35\1\34\30\4\37\0\5\5\30\0\2\6"+
    "\2\0\32\6\10\0\1\10\40\0\1\36\37\0\1\37"+
    "\37\0\1\40\40\0\1\41\26\0\1\42\1\0\1\43"+
    "\32\0\1\44\2\0\1\45\33\0\1\46\5\0\1\47"+
    "\27\0\1\50\34\0\21\51\1\0\1\51\13\0\1\24"+
    "\1\52\17\24\1\0\1\24\13\0\21\24\1\0\1\24"+
    "\13\0\3\24\1\53\15\24\1\0\1\24\13\0\5\24"+
    "\1\54\13\24\1\0\1\24\13\0\10\24\1\55\10\24"+
    "\1\0\1\24\13\0\1\24\1\56\1\24\1\57\15\24"+
    "\1\0\1\24\13\0\1\60\2\24\1\61\15\24\1\0"+
    "\1\24\13\0\1\24\1\62\5\24\1\63\11\24\1\0"+
    "\1\24\13\0\1\24\1\64\17\24\1\0\1\24\2\0"+
    "\1\5\1\35\1\5\2\35\44\0\1\65\51\0\1\50"+
    "\25\0\1\65\36\0\1\42\1\0\1\66\37\0\1\67"+
    "\37\0\1\42\32\0\1\65\23\0\1\70\40\0\1\71"+
    "\40\0\1\72\34\0\1\73\30\0\2\24\1\74\16\24"+
    "\1\0\1\24\13\0\16\24\1\64\2\24\1\0\1\24"+
    "\13\0\6\24\1\74\12\24\1\0\1\24\13\0\7\24"+
    "\1\56\1\24\1\75\7\24\1\0\1\24\13\0\13\24"+
    "\1\76\5\24\1\0\1\24\13\0\15\24\1\56\3\24"+
    "\1\0\1\24\13\0\12\24\1\74\6\24\1\0\1\24"+
    "\13\0\1\77\20\24\1\0\1\24\13\0\3\24\1\100"+
    "\15\24\1\0\1\24\13\0\6\24\1\101\12\24\1\0"+
    "\1\24\13\0\5\24\1\102\13\24\1\0\1\24\16\0"+
    "\1\67\44\0\1\42\42\0\1\103\24\0\1\67\42\0"+
    "\1\104\24\0\1\67\33\0\3\24\1\76\15\24\1\0"+
    "\1\24\13\0\12\24\1\56\6\24\1\0\1\24\13\0"+
    "\17\24\1\105\1\24\1\0\1\24\13\0\6\24\1\76"+
    "\12\24\1\0\1\24\13\0\13\24\1\106\5\24\1\0"+
    "\1\24\13\0\2\24\1\76\16\24\1\0\1\24\22\0"+
    "\1\107\35\0\1\110\26\0\7\24\1\111\11\24\1\0"+
    "\1\24\13\0\7\24\1\112\11\24\1\0\1\24\23\0"+
    "\1\50\35\0\1\113\25\0\10\24\1\64\10\24\1\0"+
    "\1\24\13\0\10\24\1\114\10\24\1\0\1\24\33\0"+
    "\1\42\15\0\20\24\1\56\1\0\1\24\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2100];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\3\1\1\11\11\1\1\11\13\1\13\0"+
    "\14\1\2\0\1\11\4\0\7\1\2\0\2\1\2\0"+
    "\2\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[76];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  GdlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return GdlTypes.CONSTANT;
            } 
            // fall through
          case 10: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 11: break;
          case 3: 
            { yybegin(YYINITIAL); return GdlTypes.COMMENT;
            } 
            // fall through
          case 12: break;
          case 4: 
            { yybegin(YYINITIAL); return GdlTypes.OPERATOR;
            } 
            // fall through
          case 13: break;
          case 5: 
            { yybegin(PARENOPEN); return GdlTypes.OPERATOR;
            } 
            // fall through
          case 14: break;
          case 6: 
            { yybegin(YYINITIAL); return GdlTypes.FUNCTION;
            } 
            // fall through
          case 15: break;
          case 7: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 16: break;
          case 8: 
            { yybegin(YYINITIAL); return GdlTypes.VARIABLE;
            } 
            // fall through
          case 17: break;
          case 9: 
            { yybegin(YYINITIAL); return GdlTypes.KEY;
            } 
            // fall through
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
