/* The following code was generated by JFlex 1.6.1 */

package traductorPascalC;
import java.io.*;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>D:/Users/Carlos Gil Sabrido/Documents/GitHub/PL2029/TraductorPascalC/src/traductorpascalc/lexico.flex</tt>
 */
class AnalizadorLexico implements java_cup.runtime.Scanner {

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
    "\12\0\1\60\1\63\1\63\1\60\31\0\1\56\1\20\1\21\1\26"+
    "\1\24\1\17\1\25\1\13\1\62\12\54\1\14\1\15\1\22\1\16"+
    "\1\23\2\0\1\46\3\52\1\43\1\52\1\44\1\52\1\11\2\52"+
    "\1\47\1\52\1\10\3\52\1\45\1\52\1\12\1\7\5\52\2\0"+
    "\1\55\1\0\1\53\1\0\1\5\1\41\1\32\1\27\1\33\1\35"+
    "\1\4\1\50\1\30\2\52\1\40\1\6\1\36\1\3\1\1\1\52"+
    "\1\2\1\42\1\37\1\34\1\31\1\51\3\52\1\57\1\0\1\61"+
    "\7\0\1\63\u1fa2\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\10\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\15\2"+
    "\1\17\2\1\1\20\2\2\1\21\4\2\1\22\1\23"+
    "\1\24\1\25\1\2\1\26\10\2\1\27\5\2\2\0"+
    "\1\30\2\0\2\2\1\31\1\32\3\2\1\33\1\34"+
    "\1\2\1\35\2\2\1\36\1\2\1\37\5\2\1\40"+
    "\1\0\1\40\2\0\1\20\3\2\1\41\3\2\1\42"+
    "\2\2\1\43\2\2\1\44\1\2\2\0\5\2\1\45"+
    "\1\46\2\2\1\47\1\50\1\0\2\2\1\51\1\2"+
    "\1\52\1\2\1\53\1\54\1\2\1\55\2\2\1\56"+
    "\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[141];
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
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\64\0\u0208\0\64\0\64\0\64\0\64"+
    "\0\64\0\u023c\0\u0270\0\u02a4\0\u02a4\0\64\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\64\0\u0618"+
    "\0\u064c\0\u0104\0\u0680\0\u06b4\0\u06e8\0\u071c\0\64\0\64"+
    "\0\64\0\u0750\0\u0784\0\u0104\0\u07b8\0\u07ec\0\u0820\0\u0854"+
    "\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0104\0\u0958\0\u098c\0\u09c0"+
    "\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\64\0\u0ac4\0\u0af8\0\u0b2c"+
    "\0\u0b60\0\u0104\0\u0104\0\u0b94\0\u0bc8\0\u0bfc\0\u0104\0\u0104"+
    "\0\u0c30\0\u0104\0\u0c64\0\u0c98\0\u0104\0\u0ccc\0\u0104\0\u0d00"+
    "\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e38\0\u0e6c"+
    "\0\u0ea0\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0104\0\u0f70\0\u0fa4"+
    "\0\u0fd8\0\u0104\0\u100c\0\u1040\0\u0104\0\u1074\0\u10a8\0\u0104"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248"+
    "\0\u0104\0\u0104\0\u127c\0\u12b0\0\u0104\0\u0104\0\u12e4\0\u1318"+
    "\0\u134c\0\u0104\0\u1380\0\u0104\0\u13b4\0\u0104\0\u0104\0\u13e8"+
    "\0\u0104\0\u141c\0\u1450\0\u0104\0\u0104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[141];
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
    "\1\6\1\12\1\6\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\3\6\1\42\3\6\1\43\1\6\1\2"+
    "\1\44\1\2\1\45\1\46\1\0\1\2\1\47\66\0"+
    "\1\6\1\50\10\6\14\0\26\6\10\0\12\6\14\0"+
    "\4\6\1\51\21\6\10\0\1\6\1\52\10\6\14\0"+
    "\26\6\10\0\12\6\14\0\26\6\10\0\12\6\14\0"+
    "\7\6\1\53\16\6\10\0\2\6\1\54\7\6\14\0"+
    "\26\6\10\0\7\6\1\55\2\6\14\0\26\6\10\0"+
    "\7\6\1\56\2\6\14\0\26\6\25\0\1\57\63\0"+
    "\1\60\63\0\1\61\121\0\1\44\10\0\2\6\1\62"+
    "\7\6\14\0\1\6\1\63\24\6\10\0\12\6\14\0"+
    "\6\6\1\64\17\6\10\0\4\6\1\65\5\6\14\0"+
    "\26\6\10\0\2\6\1\66\7\6\14\0\26\6\10\0"+
    "\12\6\14\0\7\6\1\67\1\6\1\70\14\6\10\0"+
    "\12\6\14\0\7\6\1\71\16\6\10\0\2\6\1\72"+
    "\7\6\14\0\5\6\1\73\20\6\10\0\2\6\1\74"+
    "\7\6\14\0\26\6\10\0\2\6\1\75\7\6\14\0"+
    "\21\6\1\76\4\6\10\0\4\6\1\77\5\6\14\0"+
    "\26\6\10\0\12\6\14\0\4\6\1\100\21\6\10\0"+
    "\12\6\14\0\14\6\1\101\11\6\10\0\12\6\14\0"+
    "\21\6\1\102\4\6\22\0\1\103\17\0\1\104\7\0"+
    "\1\104\10\0\1\44\65\0\1\105\5\0\26\106\1\107"+
    "\31\106\1\0\1\47\2\106\1\0\2\6\1\110\7\6"+
    "\14\0\26\6\10\0\1\111\11\6\14\0\26\6\10\0"+
    "\12\6\14\0\1\112\25\6\10\0\12\6\14\0\1\113"+
    "\25\6\10\0\10\6\1\114\1\6\14\0\26\6\10\0"+
    "\11\6\1\115\14\0\26\6\10\0\12\6\14\0\22\6"+
    "\1\116\3\6\10\0\12\6\14\0\2\6\1\117\23\6"+
    "\10\0\1\6\1\120\10\6\14\0\26\6\10\0\12\6"+
    "\14\0\7\6\1\121\16\6\10\0\12\6\14\0\1\122"+
    "\25\6\10\0\12\6\14\0\13\6\1\123\12\6\10\0"+
    "\12\6\14\0\10\6\1\124\15\6\10\0\1\6\1\125"+
    "\10\6\14\0\26\6\10\0\12\6\14\0\7\6\1\126"+
    "\16\6\10\0\12\6\14\0\10\6\1\127\15\6\10\0"+
    "\12\6\14\0\4\6\1\130\21\6\10\0\5\6\1\131"+
    "\4\6\14\0\26\6\10\0\3\6\1\132\6\6\14\0"+
    "\26\6\10\0\12\6\14\0\17\6\1\133\6\6\10\0"+
    "\12\6\14\0\1\6\1\134\24\6\63\0\1\135\33\0"+
    "\2\136\26\0\1\137\7\0\60\106\1\0\1\47\2\106"+
    "\26\107\1\140\31\107\1\141\1\142\2\107\1\0\3\6"+
    "\1\143\6\6\14\0\3\6\1\144\22\6\10\0\12\6"+
    "\14\0\4\6\1\145\21\6\10\0\11\6\1\146\14\0"+
    "\26\6\10\0\12\6\14\0\14\6\1\147\11\6\10\0"+
    "\12\6\14\0\7\6\1\150\16\6\10\0\12\6\14\0"+
    "\13\6\1\151\12\6\10\0\12\6\14\0\4\6\1\152"+
    "\21\6\10\0\12\6\14\0\1\6\1\153\24\6\10\0"+
    "\12\6\14\0\3\6\1\154\22\6\10\0\12\6\14\0"+
    "\7\6\1\155\16\6\10\0\12\6\14\0\12\6\1\156"+
    "\13\6\10\0\12\6\14\0\1\6\1\157\24\6\10\0"+
    "\12\6\14\0\20\6\1\160\5\6\10\0\12\6\14\0"+
    "\11\6\1\161\14\6\63\0\1\137\1\162\62\0\1\137"+
    "\7\0\60\107\1\141\1\47\2\107\26\141\1\163\35\141"+
    "\1\0\1\6\1\164\10\6\14\0\26\6\10\0\12\6"+
    "\14\0\4\6\1\165\21\6\10\0\4\6\1\166\5\6"+
    "\14\0\26\6\10\0\12\6\14\0\15\6\1\167\10\6"+
    "\10\0\12\6\14\0\10\6\1\170\15\6\10\0\12\6"+
    "\14\0\10\6\1\171\15\6\10\0\12\6\14\0\11\6"+
    "\1\172\14\6\10\0\12\6\14\0\10\6\1\173\15\6"+
    "\10\0\12\6\14\0\1\174\25\6\10\0\12\6\14\0"+
    "\7\6\1\175\16\6\10\0\12\6\14\0\4\6\1\176"+
    "\21\6\42\0\1\104\7\0\1\104\11\0\1\162\6\0"+
    "\26\141\1\177\32\141\1\47\2\141\1\0\4\6\1\200"+
    "\5\6\14\0\26\6\10\0\12\6\14\0\1\201\25\6"+
    "\10\0\12\6\14\0\10\6\1\202\15\6\10\0\12\6"+
    "\14\0\14\6\1\203\11\6\10\0\2\6\1\204\7\6"+
    "\14\0\26\6\10\0\12\6\14\0\1\6\1\205\24\6"+
    "\10\0\4\6\1\206\5\6\14\0\26\6\7\0\26\141"+
    "\1\163\32\141\1\142\2\141\1\0\5\6\1\207\4\6"+
    "\14\0\26\6\10\0\12\6\14\0\5\6\1\210\20\6"+
    "\10\0\12\6\14\0\16\6\1\211\7\6\10\0\2\6"+
    "\1\212\7\6\14\0\26\6\10\0\1\6\1\213\10\6"+
    "\14\0\26\6\10\0\12\6\14\0\7\6\1\214\16\6"+
    "\10\0\12\6\14\0\4\6\1\215\21\6\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5252];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\1\11\1\1\5\11\4\1\1\11"+
    "\20\1\1\11\7\1\3\11\21\1\2\0\1\11\2\0"+
    "\26\1\1\0\1\1\2\0\20\1\2\0\13\1\1\0"+
    "\16\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[141];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
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
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Caracter erroneo: "+yytext() + " " + yyline + " " + yycolumn);
            }
          case 48: break;
          case 2: 
            { return new Symbol (sym.identifier);
            }
          case 49: break;
          case 3: 
            { return new Symbol (sym.punto);
            }
          case 50: break;
          case 4: 
            { return new Symbol(sym.dosPuntos);
            }
          case 51: break;
          case 5: 
            { return new Symbol(sym.puntoComa);
            }
          case 52: break;
          case 6: 
            { return new Symbol(sym.igual);
            }
          case 53: break;
          case 7: 
            { return new Symbol(sym.coma);
            }
          case 54: break;
          case 8: 
            { return new Symbol(sym.abrirPar);
            }
          case 55: break;
          case 9: 
            { return new Symbol(sym.cerrarPar);
            }
          case 56: break;
          case 10: 
            { return new Symbol(sym.menor);
            }
          case 57: break;
          case 11: 
            { return new Symbol(sym.mayor);
            }
          case 58: break;
          case 12: 
            { return new Symbol(sym.mas);
            }
          case 59: break;
          case 13: 
            { return new Symbol(sym.menos);
            }
          case 60: break;
          case 14: 
            { return new Symbol(sym.mul);
            }
          case 61: break;
          case 15: 
            { return new Symbol (sym.numeric_integer_const,yytext());
            }
          case 62: break;
          case 16: 
            { 
            }
          case 63: break;
          case 17: 
            { return new Symbol(sym.or_);
            }
          case 64: break;
          case 18: 
            { return new Symbol(sym.puntosIgual);
            }
          case 65: break;
          case 19: 
            { return new Symbol(sym.menorIgual);
            }
          case 66: break;
          case 20: 
            { return new Symbol(sym.mayorIgual);
            }
          case 67: break;
          case 21: 
            { return new Symbol(sym.do_);
            }
          case 68: break;
          case 22: 
            { return new Symbol(sym.if_);
            }
          case 69: break;
          case 23: 
            { return new Symbol(sym.to_);
            }
          case 70: break;
          case 24: 
            { return new Symbol (sym.string_const, yytext());
            }
          case 71: break;
          case 25: 
            { return new Symbol(sym.and_);
            }
          case 72: break;
          case 26: 
            { return new Symbol(sym.mod_);
            }
          case 73: break;
          case 27: 
            { return new Symbol(sym.div_);
            }
          case 74: break;
          case 28: 
            { return new Symbol (sym.var_);
            }
          case 75: break;
          case 29: 
            { return new Symbol(sym.end_);
            }
          case 76: break;
          case 30: 
            { return new Symbol(sym.for_);
            }
          case 77: break;
          case 31: 
            { return new Symbol(sym.not_);
            }
          case 78: break;
          case 32: 
            { return new Symbol (sym.numeric_real_const, yytext());
            }
          case 79: break;
          case 33: 
            { return new Symbol(sym.unit_);
            }
          case 80: break;
          case 34: 
            { return new Symbol(sym.else_);
            }
          case 81: break;
          case 35: 
            { return new Symbol(sym.then_);
            }
          case 82: break;
          case 36: 
            { return new Symbol(sym.real_);
            }
          case 83: break;
          case 37: 
            { return new Symbol(sym.const_);
            }
          case 84: break;
          case 38: 
            { return new Symbol(sym.until_);
            }
          case 85: break;
          case 39: 
            { return new Symbol(sym.begin_);
            }
          case 86: break;
          case 40: 
            { return new Symbol(sym.while_);
            }
          case 87: break;
          case 41: 
            { return new Symbol(sym.repeat_);
            }
          case 88: break;
          case 42: 
            { return new Symbol(sym.downto_);
            }
          case 89: break;
          case 43: 
            { return new Symbol(sym.lambda);
            }
          case 90: break;
          case 44: 
            { return new Symbol(sym.program_);
            }
          case 91: break;
          case 45: 
            { return new Symbol(sym.int_);
            }
          case 92: break;
          case 46: 
            { return new Symbol(sym.function_);
            }
          case 93: break;
          case 47: 
            { return new Symbol(sym.procedure_);
            }
          case 94: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
