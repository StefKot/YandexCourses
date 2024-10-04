import java.util.Scanner;

public class MonthData {
    int[] days = new int[30];
    Converter converter = new Converter();
    StepTracker stepTracker;
    int goalByStepsPerDay;

    // Конструктор, принимающий goalByStepsPerDay
    MonthData(int goalByStepsPerDay) {
        this.goalByStepsPerDay = goalByStepsPerDay;
    }

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            // вывод элементов массива в нужном формате
            System.out.println(i + "-й день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            // подсчёт суммы элементов массива days[]
            sumSteps += days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимального элемента
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) { // поиск максимальной серии
                currentSeries++;
            } else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        if (currentSeries > finalSeries) {
            finalSeries = currentSeries;
        }

        return finalSeries;
    }

    int averageSteps() {
        return sumStepsFromMonth() / 30;
    }

    void printStatistic(Scanner scan) {
        System.out.println("Введите число месяца: ");
        int monthNumber = scan.nextInt() - 1; // ввод и проверка номера месяца
        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Номер месяца введен некорректно");
        }
        // получение соответствующего месяца
        int sumSteps = sumStepsFromMonth(); // получение суммы шагов за месяц
        int distance = converter.convertToKm(sumStepsFromMonth());
        int calories = converter.convertStepsToKilocalories(sumStepsFromMonth());

        printDaysAndStepsFromMonth();
        System.out.println("*** Общее количество шагов за месяц:" + sumSteps);
        System.out.println("*** Максимальное пройденное количество шагов за месяц: " + maxSteps());
        System.out.println("*** Среднее количество шагов: " + averageSteps());
        System.out.println("*** Пройденная дистанция (в км): " + distance);
        System.out.println("*** Количество сожжённых килокалорий: " + calories);
        System.out.println("*** Лучшая серия: " + bestSeries(stepTracker.goalByStepsPerDay));;
        System.out.println();
    }
}
