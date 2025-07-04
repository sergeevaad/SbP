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
        wordCount.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
