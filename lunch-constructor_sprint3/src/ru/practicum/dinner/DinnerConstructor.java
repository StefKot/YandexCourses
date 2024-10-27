package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {
    Dishes dishes = new Dishes();
    Random random = new Random();


    void addNewDish(String dishType, String dishName) {
        if (dishes.foodByCategories.containsKey(dishType)) {
            ArrayList <String> names = dishes.foodByCategories.get(dishType);
            names.add(dishName);
        } else {
            ArrayList <String> dishes = new ArrayList<>();
            dishes.add(dishName);
            dishes.foodByCategories.put(dishType, dishes);

        }
    }

//    static void addNewDish() {
//
//
//        // добавьте новое блюдо
//        if (dc.dishes.containsKey(dishType)) {
//            ArrayList<String> dishes = dc.dishes.get(dishType);
//            dishes.add(dishName);
//        } else {
//            ArrayList<String> dishes = new ArrayList<>();
//            dishes.add(dishName);
//            dc.dishes.put(dishType, dishes);
//        }
//    }



    static void generateDishCombo(ArrayList<String> dishTypes) {

        // сгенерируйте комбинации блюд и выведите на экран
        for (int i = 0; i < numberOfCombos; i++) {
            System.out.println("Комбо " + (i + 1));
            System.out.println();
        }
    }
}
