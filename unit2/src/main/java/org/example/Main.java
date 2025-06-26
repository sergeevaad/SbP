package org.example;

public class Main {
    public static void main(String[] args){
        Phone phone1 = new Phone("89000000000","Sam",0.209);
        Phone phone2 = new Phone("89111111111","Sam");
        Phone phone3 = new Phone();

        phone1.recieveCall("Анастасия");
        System.out.println("Номер phone2: "+phone2.getNumber());
        Phone.sendMessage();
        phone1.toString();

    }
}
