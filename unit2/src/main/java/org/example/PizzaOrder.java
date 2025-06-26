package org.example;

enum PizzaSize {
    SMALL("Маленькая"),
    MEDIUM("Средняя"),
    BIG("Большая");

    private final String sizeName;

    PizzaSize(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getSizeName() {
        return sizeName;
    }
}

public class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean sauce;
    private String address;
    private boolean accepted;

    public PizzaOrder(String name, PizzaSize size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public void order() {
        if (accepted) {
            System.out.println("Заказ уже принят");
        } else {
            this.accepted = true;
            System.out.println("Заказ принят. " + size.getSizeName() +
                    " пицца " + name + " " + (sauce ? "с соусом" : "без соуса") + " на адрес " + address);
        }
    }

    public void cancel() {
        if (accepted) {
            this.accepted = false;
            System.out.println("Заказ отменен");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Пицца: " + name + "\nРазмер: " + size.getSizeName() + "\nСоус: " + (sauce ? "Да" : "Нет") +
                "\nАдрес: " + address + "\nЗаказ: " + (accepted ? "Принят" : "Не принят/Отменен");
    }


}
