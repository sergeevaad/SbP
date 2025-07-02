package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SwapMap<Integer, String> map = new SwapMap<>();

        Map<Integer, String> numberToWord = new HashMap<>();
        numberToWord.put(1, "one");
        numberToWord.put(2, "two");
        numberToWord.put(3, "three");

        System.out.println(numberToWord);

        Map<String, Integer> wordToNumber = map.swapMap(numberToWord);

        System.out.println(wordToNumber);
    }
}