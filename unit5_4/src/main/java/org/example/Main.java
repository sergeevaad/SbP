package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            IReader reader = new FileRead("unit5_4/src/main/java/org/example/file.txt");
            ITextProcessor processor = new TextProcessor(reader);
            WordCounter counter = new WordCounter(processor);
            ResPrint res = new ResPrint(counter);

            res.print();
        }catch (IOException e){
            System.err.println("Ошибка: " + e.getMessage());
        }

    }
}