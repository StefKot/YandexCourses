import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData monthData = new MonthData();
    Converter converter = new Converter();
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay;

    StepTracker(Scanner scan) {
        scanner = scan;
        goalByStepsPerDay = 10000;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        System.out.println( "1 - Январь, 2 - Февраль, 3 - Март, 4 - Апрель, 5 - Май, 6 - Июнь, " + "\n" +
                "7 - Июль, 8 - Август, 9 - Сентябрь, 10 - Октябрь, 11 - Ноябрь, 12 - Декабрь");
        int monthNumber = scanner.nextInt() - 1;
        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Неверный номер месяца <--Обратите внимание на вывод приложения-->");
        } else {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt();
            if (day < 1 || day > 30) {
                System.out.println("День введен некорректно");
            } else {
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();
                if (steps <= 0) {
                    System.out.println("Указано неверное количество шагов " +
                            "<--Обратите внимание на вывод приложения-->");
                } else {
                    monthData.days[day-1] = steps;
                }
            }


        }
    }

    void changeStepGoal() {
        System.out.println("Введите цель по шагам за день: ");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Цель должна быть больше нуля! <--Обратите внимание на вывод приложения-->");
            goalByStepsPerDay = 10000;
            System.out.println("Значение цели по шагам за день взято по умолчанию");
        } else {
            System.out.println("Цель по шагам успешно изменена на " + goalByStepsPerDay);
        }
    }

    void printStatistic(Scanner scan) {
        System.out.println("Введите число месяца: ");
        System.out.println( "1 - Январь, 2 - Февраль, 3 - Март, 4 - Апрель, 5 - Май, 6 - Июнь, " + "\n" +
                "7 - Июль, 8 - Август, 9 - Сентябрь, 10 - Октябрь, 11 - Ноябрь, 12 - Декабрь");
        int monthNumber = scanner.nextInt() - 1;

        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Неверный номер месяца <--Обратите внимание на вывод приложения-->");
        } else {
            int sumSteps = monthData.sumStepsFromMonth();
            int distance = converter.convertToKm(monthData.sumStepsFromMonth());
            int calories = converter.convertStepsToKilocalories(monthData.sumStepsFromMonth());

            monthData.printDaysAndStepsFromMonth();
            System.out.println("*** Общее количество шагов за месяц: " + sumSteps);
            System.out.println("*** Максимальное пройденное количество шагов за месяц: " + monthData.maxSteps());
            System.out.println("*** Среднее количество шагов: " + monthData.averageSteps());
            System.out.println("*** Пройденная дистанция (в км): " + distance);
            System.out.println("*** Количество сожжённых килокалорий: " + calories);
            System.out.println("*** Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
            ;
            System.out.println();
        }
    }
} 