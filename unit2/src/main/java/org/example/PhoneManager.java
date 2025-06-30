package org.example;

import java.util.ArrayList;

public class PhoneManager {
    private ArrayList<String> numbers = new ArrayList<>();

    public void addNumber(String number){
        numbers.add(number);
    }

    public ArrayList<String> getNumbers(){
        return new ArrayList<>(numbers);
    }
}
