package org.gdlplugin;

import com.intellij.lang.Language;

public class GdlLanguage extends Language {

    public static final GdlLanguage INSTANCE = new GdlLanguage();

    private GdlLanguage() {
        super("Gdl");
    }
}