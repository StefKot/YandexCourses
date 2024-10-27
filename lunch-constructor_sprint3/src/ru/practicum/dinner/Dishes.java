package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

public class Dishes {
    HashMap<String, ArrayList<String>> foodByCategories;

    Dishes() {
        foodByCategories = new HashMap<>();
        ArrayList<String> nameOfDishes = new ArrayList<>();
    }

}
