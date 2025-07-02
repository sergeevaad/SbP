package org.example;

import java.io.IOException;
import java.util.Map;

public class ResPrint {
    private WordCounter counter;

    public ResPrint(WordCounter counter) {
        this.counter = counter;
    }

    public void print() throws IOException {
        Map<String, Integer> wordCount = counter.count();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
