import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

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
        }
    }
} 