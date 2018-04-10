// This is a generated file. Not intended for manual editing.
package org.gdlplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.gdlplugin.psi.impl.*;

public interface GdlTypes {

  IElementType PROPERTY = new GdlElementType("PROPERTY");

  IElementType COMMENT = new GdlTokenType("COMMENT");
  IElementType CONSTANT = new GdlTokenType("CONSTANT");
  IElementType CRLF = new GdlTokenType("CRLF");
  IElementType FUNCTION = new GdlTokenType("FUNCTION");
  IElementType KEY = new GdlTokenType("KEY");
  IElementType OPERATOR = new GdlTokenType("OPERATOR");
  IElementType SEPARATOR = new GdlTokenType("SEPARATOR");
  IElementType VARIABLE = new GdlTokenType("VARIABLE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new GdlPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
