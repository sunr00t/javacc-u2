/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package javacc;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fe0L) != 0L)
         {
            jjmatchedKind = 17;
            return 9;
         }
         return -1;
      case 1:
         if ((active0 & 0x3400L) != 0L)
            return 9;
         if ((active0 & 0xbe0L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 17;
               jjmatchedPos = 1;
            }
            return 9;
         }
         return -1;
      case 2:
         if ((active0 & 0xbe0L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
            return 9;
         }
         return -1;
      case 3:
         if ((active0 & 0xb60L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 3;
            return 9;
         }
         if ((active0 & 0x80L) != 0L)
            return 9;
         return -1;
      case 4:
         if ((active0 & 0xa60L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
            return 9;
         }
         if ((active0 & 0x100L) != 0L)
            return 9;
         return -1;
      case 5:
         if ((active0 & 0x840L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 5;
            return 9;
         }
         if ((active0 & 0x220L) != 0L)
            return 9;
         return -1;
      case 6:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 6;
            return 9;
         }
         if ((active0 & 0x40L) != 0L)
            return 9;
         return -1;
      case 7:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 7;
            return 9;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 40:
         return jjStopAtPos(0, 24);
      case 41:
         return jjStopAtPos(0, 25);
      case 44:
         return jjStopAtPos(0, 23);
      case 46:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 58:
         return jjStopAtPos(0, 20);
      case 59:
         return jjStopAtPos(0, 21);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x440L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x3000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x280L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 46:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x280L);
      case 102:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x840L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 9);
         break;
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x120L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 108:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 9);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x2800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x2800L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 121:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x2800L);
      case 100:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 9);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 103:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x2800L);
      case 114:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x2800L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(8, 11, 9);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(8, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 34 && kind > 14)
                     kind = 14;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(4);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 46)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(7);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjstateSet[jjnewStateCnt++] = 9;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 9:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(9);
                  break;
               case 1:
                  jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   4, 5, 6, 1, 2, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\163\164\162\151\156\147", 
"\151\156\164\145\147\145\162", "\162\145\141\154", "\141\162\162\141\171", "\162\145\143\157\162\144", 
"\151\163", "\145\156\144\162\145\143\157\162\144", "\157\146", 
"\157\146\40\162\145\143\157\162\144", null, null, null, null, null, null, "\72", "\73", "\56\56", "\54", "\50", 
"\51", "\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[10];
private final int[] jjstateSet = new int[20];
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 10; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000400L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
