package day61_Collections3;

import day60_collection2.Product;

import java.util.*;

public class HashSetOfProduct {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("book",25));
        productSet.add(new Product("book",24));
        productSet.add(new Product("Magazine",17));

    }
}
