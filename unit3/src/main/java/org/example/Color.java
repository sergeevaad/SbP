package org.example;

public enum Color {
    RED("красным"),
    GREEN("зеленым"),
    YELLOW("желтым"),
    BLUE("синим"),
    BLACK("черным");

    private final String colorName;

    Color(String colorName) {

        this.colorName = colorName;
    }

    public String getColorName() {

        return colorName;
    }
}