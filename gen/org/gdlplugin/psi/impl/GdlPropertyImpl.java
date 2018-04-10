// This is a generated file. Not intended for manual editing.
package org.gdlplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.gdlplugin.psi.GdlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.gdlplugin.psi.*;

public class GdlPropertyImpl extends ASTWrapperPsiElement implements GdlProperty {

  public GdlPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GdlVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GdlVisitor) accept((GdlVisitor)visitor);
    else super.accept(visitor);
  }

}
