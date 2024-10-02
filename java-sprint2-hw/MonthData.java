import java.util.Scanner;

public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            // вывод элементов массива в нужном формате
            System.out.println();
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
            // поиск максимальной серии
            System.out.println();
        }
        return finalSeries;
    }

    void printStatistic(Scanner scan) {
        System.out.println("Введите число месяца");
        int monthNumber = scan.nextInt(); // ввод и проверка номера месяца

        monthData = 0; // получение соответствующего месяца
        int sumSteps = 0; // получение суммы шагов за месяц
        // вывод общей статистики по дням
        // вывод суммы шагов за месяц
        // вывод максимального пройденного количества шагов за месяц
        // вывод среднего пройденного количества шагов за месяц
        // вывод пройденной за месяц дистанции в километрах
        // вывод количества сожжённых килокалорий за месяц
        // вывод лучшей серии
        System.out.println(); // дополнительный перенос строки
    }
}
