import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

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
                    boolean productExists = false;
                    for (int i = 0; i < productCount; i++) {
                        if (shoppingList[i] != null && shoppingList[i].equals(productName)) {
                            productExists = true;
                            break;
                        }
                    }
                    if (productExists) {
                        System.out.println("Товар уже есть в списке");
                    }
                    else {
                        if (productCount == shoppingList.length) {
                            String[] biggerShoppingList = new String[shoppingList.length * 2];
                            // можно сделать через System.arraycopy();
                            for (int i = 0; i < shoppingList.length; i++) {
                                biggerShoppingList[i] = shoppingList[i];
                            }
                            shoppingList = biggerShoppingList;
                        }
                        shoppingList[productCount] = productName;
                        productCount++;
                        System.out.println("Товар " + productName + " добавлен в список под номером " + productCount);
                    }
                    break;

                case "2":
                    if (productCount == 0) {
                        System.out.println("Список товаров пуст");
                    } else {
                        System.out.println("Список товаров: ");
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(i + 1 + ". " + shoppingList[i]);
                        }
                    }
                    break;

                case "3":
                    shoppingList = new String[8];
                    productCount = 0;
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