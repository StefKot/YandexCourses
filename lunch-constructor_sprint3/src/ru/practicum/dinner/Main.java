package ru.practicum.dinner;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Введите тип блюда:");
                    String dishType = scanner.nextLine();
                    if (dishType.isEmpty()) {
                        System.out.println("Тип блюда не может быть пустым!");
                        break;
                    }
                    System.out.println("Введите название блюда:");
                    String dishName = scanner.nextLine();
                    if (dishName.isEmpty()) {
                        System.out.println("Название блюда не может быть пустым!");
                        break;
                    }
                    dc.addNewDish(dishType, dishName);
                    break;
                case "2":
                    System.out.println("Начинаем конструировать обед...");

                    System.out.println("Введите количество наборов, которые нужно сгенерировать:");
                    int numberOfCombos = scanner.nextInt();
                    System.out.println("Название блюда не может быть пустым!");
                    scanner.nextLine();

                    System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");

                    ArrayList<String> dishTypes = new ArrayList<>();
                    String nextItem = scanner.nextLine();

                    //реализуйте ввод типов блюд
                    while (!nextItem.isEmpty()) {
                        dishTypes.add(nextItem);
                        nextItem = scanner.nextLine();
                    }
                    dc.generateDishCombo(numberOfCombos, dishTypes);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }
}
