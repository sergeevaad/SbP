package org.example;

import java.util.ArrayList;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private static ArrayList<String> numbers = new ArrayList<>();

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        numbers.add(number);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        numbers.add(number);
    }

    public Phone() {

    }

    public void recieveCall(String name, String number) {

    }

    public void recieveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public String getNumber() {
        return number;
    }

    public static void sendMessage() {
        for (String number: numbers){
            System.out.println(number);
        }
    }

    public String toString() {
        System.out.printf("Номер: %s\nМодель: %s\nВес: %f", number, model, weight);
        return null;
    }
}