package org.example;

// representation of cloth

public class Cloth {
    // static field for auto-incrementing id in instances
    private static int currentId = 0;

    private int id;
    private String type;
    private String size;
    private String color;
    private double price;

    // constructor
    Cloth (String type, String size, String color, double price) {
        this.id = currentId++;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    // getters
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

    // setter for price (some checks could be added)
    public void setPrice(double price) {
        this.price = price;
    }
}
