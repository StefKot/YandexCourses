package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {

    Dishes dishes = new Dishes();
    Random random = new Random();

    void addNewDish(String dishType, String dishName) {
        if (dishes.foodByCategories.containsKey(dishType)) {
            ArrayList<String> names = dishes.foodByCategories.get(dishType);
            names.add(dishName);
        } else {
            ArrayList<String> meals = new ArrayList<>();
            meals.add(dishName);
            dishes.foodByCategories.put(dishType, meals);
        }
    }

    boolean isDishEmpty(String dishType, String dishName) {
        boolean isEmpty = false;
        if (dishType.isEmpty() || dishName.isEmpty()) {
            isEmpty = true;
        }
        return isEmpty;
    }

    boolean containsDishType(String dishType) {
        boolean containsDishType = false;
        if (dishes.foodByCategories.containsKey(dishType)) {
            containsDishType = true;
        }
        return containsDishType;
    }

    void generateDishCombo(int numberOfCombos, ArrayList<String> dishTypes) {
        if (dishes.foodByCategories.isEmpty()) {
            System.out.println("Вы еще не создали таблицу с блюдами!");
            return;
        }

        ArrayList<ArrayList<String>> randomCombos = new ArrayList<>();

        for (int i = 0; i < numberOfCombos; i++) {
            ArrayList<String> combo = new ArrayList<>();

            for (String dishType : dishTypes) {
                ArrayList<String> dishesOfType = dishes.foodByCategories.get(dishType);
                if (dishesOfType != null && !dishesOfType.isEmpty()) {
                    int randomIndex = random.nextInt(dishesOfType.size());
                    combo.add(dishesOfType.get(randomIndex));
                }
            }

            randomCombos.add(combo);
        }

        for (int i = 0; i < randomCombos.size(); i++) {
            System.out.println("Комбо " + (i + 1));
            System.out.println(randomCombos.get(i));
        }
    }
}
