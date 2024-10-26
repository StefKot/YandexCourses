import java.util.ArrayList;
import java.util.HashMap;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> foodByCategories;

    DinnerConstructor() {
        foodByCategories = new HashMap<>();
        ArrayList<String> nameOfDishes = new ArrayList<>();
    }

    void addNewDish(String dishType, String dishName) {
        if (foodByCategories.containsKey(dishType)) {
            ArrayList <String> names = foodByCategories.get(dishType);
            names.add(dishName);
        } else {
            ArrayList <String> dishes = new ArrayList<>();
            dishes.add(dishName);
            foodByCategories.put(dishType, dishes);

        }
    }

    void generateCombinationOfDishes() {

    }
}
