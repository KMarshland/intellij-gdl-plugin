package org.gdlplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class GdlFileType extends LanguageFileType {

    public static final GdlFileType INSTANCE = new GdlFileType();

    private GdlFileType() {
        super(GdlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "GDL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "GDL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gdl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GdlIcons.ICON;
    }
}