package org.gdlplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.gdlplugin.GdlLanguage;
import org.jetbrains.annotations.*;

public class GdlElementType extends IElementType {
    public GdlElementType(@NotNull @NonNls String debugName) {
        super(debugName, GdlLanguage.INSTANCE);
    }
}