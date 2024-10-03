import java.util.Scanner;

public class MonthData {
    int[] days = new int[30];
    Converter converter = new Converter();

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

    int avgSteps() {
        return sumStepsFromMonth() / 30;
    }

    void printStatistic(Scanner scan) {
        System.out.println("Введите число месяца: ");
        int monthNumber = scan.nextInt() - 1; // ввод и проверка номера месяца
        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Номер месяца введен некорректно");
        }
        monthData = 0; // получение соответствующего месяца
        int sumSteps = 0; // получение суммы шагов за месяц
        printDaysAndStepsFromMonth();// вывод общей статистики по дням
        sumStepsFromMonth();// вывод суммы шагов за месяц
        maxSteps(); // вывод максимального пройденного количества шагов за месяц
        avgSteps(); // вывод среднего пройденного количества шагов за месяц
        System.out.println(converter.convertToKm(sumStepsFromMonth()));// вывод пройденной за месяц дистанции в километрах
        System.out.println(converter.convertStepsToKilocalories(sumStepsFromMonth()));// вывод количества сожжённых килокалорий за месяц
        bestSeries(); // вывод лучшей серии
        System.out.println(); // дополнительный перенос строки
    }
}
