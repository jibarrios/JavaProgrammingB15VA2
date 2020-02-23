package day50_inheritance_hiding;

import java.util.*;

public class Ingredient {
    private String name;
    private int calories;



    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}


