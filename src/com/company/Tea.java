package com.company;

public class Tea extends Food {

    private String color;

    public Tea(String color) {
        super("Чай");
        this.color = color;
    }

    public void consume() {
        System.out.println(this + " выпито");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return super.toString() + " цвета " + color.toUpperCase() + "'";
    }
}