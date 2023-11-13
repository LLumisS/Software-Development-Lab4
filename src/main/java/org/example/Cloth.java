package org.example;

public class Cloth {
    // статичне поле класу для автоінкрементації id в інстансах
    private static int currentId = 0;

    private int id;
    private String type;
    private String size;
    private String color;
    private double price;

    Cloth (String type, String size, String color, double price) {
        this.id = currentId++;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
