package org.example;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private ITextProcessor textProcessor;

    public WordCounter(ITextProcessor textProcessor){
        this.textProcessor=textProcessor;
    }

    public Map<String,Integer> count() throws IOException {
        Map<String,Integer> wordsCount = new HashMap<>();
        String word;
        while ((word = textProcessor.getWord())!= null){
            if(wordsCount.containsKey(word)){
                wordsCount.put(word,wordsCount.get(word)+1);
            }else {
                wordsCount.put(word,1);
            }
        }
        return wordsCount;
    }
}
