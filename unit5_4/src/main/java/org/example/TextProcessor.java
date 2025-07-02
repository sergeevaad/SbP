package org.example;

import java.io.IOException;


public class TextProcessor implements ITextProcessor{
    private final IReader reader;
    private String[] words = new String[0];
    private int index = 0;

    public TextProcessor(IReader reader) {
        this.reader = reader;
    }

    public String getWord() throws IOException {
        while (index>=words.length) {
            String line = reader.readNextLine();
            StringBuilder res = new StringBuilder();
            if (line == null){
                return null;
            }
            for (char ch : line.toCharArray()) {
                if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
                    res.append(ch);
                }
            }

            words = res.toString().toLowerCase().trim().split("\\s+");
            index=0;
        }
        return words[index++];
    }
}
