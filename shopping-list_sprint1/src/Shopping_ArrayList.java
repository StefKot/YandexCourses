import java.util.ArrayList;
import java.util.Scanner;

public class Shopping_ArrayList {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        ArrayList<String> shoppingList = new ArrayList<>(8);

        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");
            System.out.print("--> ");

            String actionNumber = scanner.next();

            switch (actionNumber) {
                case "1":
                    System.out.println("Введите название товара: ");
                    System.out.print("--> ");
                    String productName = scanner.next();
                    if (shoppingList.contains(productName)) {
                        System.out.println("Товар уже есть в списке");
                    } else {
                        shoppingList.add(productName);
                        System.out.println("Товар " + productName + " добавлен в список под номером " + shoppingList.size());
                    }
                    break;
                case "2":
                    if (shoppingList.isEmpty()) {
                        System.out.println("Список товаров пуст");
                    } else {
                        System.out.println("Список товаров: ");
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println(i + 1 + ". " + shoppingList.get(i));
                        }
                    }

                    break;
                case "3":
                    shoppingList.clear();
                    System.out.println("Список товаров очищен");
                    break;
                case "4":
                    break label;
                default:
                    System.out.println("Неизвестная команда!");
                    break;
            }
        }
    }
}