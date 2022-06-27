package ml.bibek.eleven.builder;

import java.util.LinkedList;

public class Vehicle {

    private final LinkedList<String> parts;

    public Vehicle() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        // Adding parts
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequence:-");
        for (String part : parts)
            System.out.println(part);
    }
}
