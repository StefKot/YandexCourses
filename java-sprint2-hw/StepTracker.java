import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay;
    MonthData monthData = new MonthData();
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;
        goalByStepsPerDay = 10000;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        // ввод и проверка номера месяца
        int monthNumber = scanner.nextInt() - 1;
        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Номер месяца введен некорректно");
        } else {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt(); // ввод и проверка дня
            if (day < 1 || day > 30) {
                System.out.println("День введен некорректно");
            } else {
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt(); // ввод и проверка количества шагов
                if (steps <= 0) {
                    System.out.println("Количество шагов введено некорректно");
                } else {
                    // получение соответствующего объекта MonthData из массива
                    MonthData monthData = new MonthData();
                    // сохранение полученных данных
                    monthData.days[day] = steps;
                    System.out.println(steps + " шагов записано");
                }
            }


        }
    }

    void changeStepGoal() {
        System.out.println("Введите цель по шагам за день: ");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Цель по шагам на день должна быть больше 0");
            goalByStepsPerDay = 10000;
            System.out.println("Значение цели по шагам за день взято по умолчанию");
        } else {
            System.out.println("Цель по шагам успешно изменена на " + goalByStepsPerDay);
        }
    }

    void printStatistic(Scanner scan) {
        System.out.println("Введите число месяца: ");
        int monthNumber = scan.nextInt() - 1; // ввод и проверка номера месяца
        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Номер месяца введен некорректно");
        }
        // получение соответствующего месяца
        int sumSteps = monthData.sumStepsFromMonth(); // получение суммы шагов за месяц
        int distance = converter.convertToKm(monthData.sumStepsFromMonth());
        int calories = converter.convertStepsToKilocalories(monthData.sumStepsFromMonth());

        monthData.printDaysAndStepsFromMonth();
        System.out.println("*** Общее количество шагов за месяц:" + sumSteps);
        System.out.println("*** Максимальное пройденное количество шагов за месяц: " + monthData.maxSteps());
        System.out.println("*** Среднее количество шагов: " + monthData.averageSteps());
        System.out.println("*** Пройденная дистанция (в км): " + distance);
        System.out.println("*** Количество сожжённых килокалорий: " + calories);
        System.out.println("*** Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));;
        System.out.println();
    }
} 