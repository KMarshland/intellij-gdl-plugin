package org.gdlplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class GdlLexerAdapter extends FlexAdapter {
    public GdlLexerAdapter() {
        super(new GdlLexer((Reader) null));
    }
}
