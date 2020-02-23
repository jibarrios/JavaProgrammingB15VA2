package day50_inheritance_hiding;

import java.util.*;

public class Shop {
    String name;
    List<Product> products = new ArrayList<>();

    public String toString() {
        return "name = " + name + ", products = " + products;
    }
}


