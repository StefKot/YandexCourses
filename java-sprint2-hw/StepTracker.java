import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        // ввод и проверка номера месяца
        int monthNumber = scanner.nextInt();
        

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня

        System.out.println("Введите количество шагов");
        // ввод и проверка количества шагов

        // получение соответствующего объекта MonthData из массива
        MonthData monthData = ...
        // сохранение полученных данных
        monthData.days[...] = ...
    }
} 