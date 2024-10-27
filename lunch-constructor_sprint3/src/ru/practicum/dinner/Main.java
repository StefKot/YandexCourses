package ru.practicum.dinner;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;
    static Dishes dishes;

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
                    System.out.println("Введите название блюда:");
                    String dishName = scanner.nextLine();
                    dc.addNewDish(dishType, dishName);
                    break;
                case "2":
                    System.out.println("Начинаем конструировать обед...");

                    System.out.println("Введите количество наборов, которые нужно сгенерировать:");
                    int numberOfCombos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");

                    ArrayList<String> dishTypes = new ArrayList<>();
                    String nextItem = scanner.nextLine();

                    //реализуйте ввод типов блюд
                    while (!nextItem.isEmpty()) {
                        dishTypes.add(nextItem);
                        nextItem = scanner.nextLine();
                    }
                    dc.generateDishCombo(dishTypes);
                    break;
                case "3":
                    return;
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
