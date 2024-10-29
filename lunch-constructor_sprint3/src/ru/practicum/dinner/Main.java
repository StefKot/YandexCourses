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
        dishes = new Dishes();

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Введите тип блюда:");
                    String dishType = scanner.nextLine();

                    System.out.println("Введите название блюда:");
                    String dishName = scanner.nextLine();
                    if (dc.isDishEmpty(dishType, dishName)) {
                        System.out.println("Тип блюда и название блюда не могут быть пустыми!");
                        break;
                    } else {
                        dc.addNewDish(dishType, dishName);
                    }
                    break;
                case "2":
                    System.out.println("Начинаем конструировать обед...");

                    System.out.println("Введите количество наборов, которые нужно сгенерировать:");
                    int numberOfCombos = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). " +
                            "Для завершения ввода введите пустую строку");

                    ArrayList<String> dishTypes = new ArrayList<>();
                    String nextItem;


                    while (true) {
                        nextItem = scanner.nextLine();

                        if (nextItem.isEmpty()) {
                            break;
                        }

                        if (dc.containsDishType(nextItem)) {
                            dishTypes.add(nextItem);
                        } else {
                            System.out.println("Тип '" + nextItem + "' не существует. " +
                                    "Пожалуйста, введите корректный тип блюда.");
                        }
                    }

                    if (!dishTypes.isEmpty()) {
                        dc.generateDishCombo(numberOfCombos, dishTypes);
                    } else {
                        System.out.println("Не введено ни одного корректного типа блюда. Программа завершена.");
                    }

                    break;
                case "3":
                    System.out.println("Выход");
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
