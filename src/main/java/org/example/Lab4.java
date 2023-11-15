package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab4 {
    public static void main(String[] args) {
        // creating an array of clothes 
        ArrayList<Cloth> clothes = new ArrayList<>();

        // adding elements to the array
        clothes.add(new Cloth("jeans", "L", "blue", 2.99));
        clothes.add(new Cloth("t-shirt", "M", "red", 1.99));
        clothes.add(new Cloth("jacket", "XL", "black", 5.99));
        clothes.add(new Cloth("pants", "S", "gray", 3.49));
        clothes.add(new Cloth("shorts", "XXL", "pink", 9.99));

        System.out.println();
        showList(clothes);
        
        // sorting the array by decreasing price (double value from the `getPrice` method)
        Collections.sort(clothes, Comparator.comparingDouble(Cloth::getPrice).reversed());
        
        showList(clothes);
        
        // sorting the array by increasing id (int value from the `getId` method)
        Collections.sort(clothes, Comparator.comparingInt(Cloth::getId));

        showList(clothes);
    }

    // array output
    private static void showList(ArrayList<Cloth> clothes) {
        for (Cloth cloth : clothes) {
            System.out.println(cloth.getId() + "\t" + cloth.getType() + "\t" + 
                cloth.getSize() + "\t" + cloth.getColor() + "\t" + cloth.getPrice());
        }
        System.out.println();
    }
}