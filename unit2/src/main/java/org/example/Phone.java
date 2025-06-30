package org.example;

import java.util.ArrayList;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private PhoneManager phoneManager;

    public Phone(String number, String model, double weight, PhoneManager phoneManager) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.phoneManager = phoneManager;
        phoneManager.addNumber(number);
    }

    public Phone(String number, String model,PhoneManager phoneManager) {
        this.number = number;
        this.model = model;
        phoneManager.addNumber(number);
    }

    public Phone() {

    }

    public void recieveCall(String name, String number) {

    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage() {
        for (String number: phoneManager.getNumbers()){
            System.out.println(number);
        }
    }

    public String toString() {
        return "Номер: "+number+"\nМодель: "+model+"\nВес: "+ weight;
    }
}