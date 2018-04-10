package org.gdlplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.gdlplugin.GdlLanguage;
import org.jetbrains.annotations.*;

public class GdlTokenType extends IElementType {
    public GdlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, GdlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GdlTokenType." + super.toString();
    }
}