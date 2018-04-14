package org.gdlplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.gdlplugin.psi.GdlTypes;
import com.intellij.psi.TokenType;

%%

%class GdlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%state PARENOPEN
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
END_OF_LINE_COMMENT=(";")[^\r\n]*
OPERATOR=(<=|[)])
KEYWORD=(role|base|input|init|true|does|next|legal|goal|terminal|distinct|not)
VARIABLE_CHARACTER=(\?\w+)
FUNCTION_CHARACTER=\w+

%state WAITING_VALUE

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return GdlTypes.COMMENT; }

<YYINITIAL> {KEYWORD}                                       { yybegin(YYINITIAL); return GdlTypes.KEY; }
<PARENOPEN> {KEYWORD}                                       { yybegin(YYINITIAL); return GdlTypes.KEY; }

<YYINITIAL> {OPERATOR}                                      { yybegin(YYINITIAL); return GdlTypes.OPERATOR; }
<PARENOPEN> {OPERATOR}                                      { yybegin(YYINITIAL); return GdlTypes.OPERATOR; }

<YYINITIAL> {VARIABLE_CHARACTER}                            { yybegin(YYINITIAL); return GdlTypes.VARIABLE; }

<PARENOPEN> {FUNCTION_CHARACTER}                            { yybegin(YYINITIAL); return GdlTypes.FUNCTION; }

<YYINITIAL> \(                                              { yybegin(PARENOPEN); return GdlTypes.OPERATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return GdlTypes.CONSTANT; }
