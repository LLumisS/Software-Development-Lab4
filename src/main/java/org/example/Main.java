package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cloth> clothes = new ArrayList<>();

        clothes.add(new Cloth("jeans", "L", "blue", 2.99));
        clothes.add(new Cloth("t-shirt", "M", "red", 1.99));
        clothes.add(new Cloth("jacket", "XL", "black", 5.99));
        clothes.add(new Cloth("pants", "S", "gray", 3.49));
        clothes.add(new Cloth("shorts", "XXL", "pink", 9.99));

        Collections.sort(clothes, Comparator.comparingDouble(Cloth::getPrice).reversed());
        
        System.out.println();
        showList(clothes);
        
        Collections.sort(clothes, Comparator.comparingInt(Cloth::getId));

        showList(clothes);
    }

    private static void showList(ArrayList<Cloth> clothes) {
        for (Cloth cloth : clothes) {
            System.out.println(cloth.getId() + "\t" + cloth.getType() + "\t" + 
                cloth.getSize() + "\t" + cloth.getColor() + "\t" + cloth.getPrice());
        }
        System.out.println();
    }
}