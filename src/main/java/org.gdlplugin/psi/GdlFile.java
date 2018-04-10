package org.gdlplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.gdlplugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GdlFile extends PsiFileBase {
    public GdlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GdlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return GdlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Gdl File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}