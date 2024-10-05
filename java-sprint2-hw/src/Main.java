import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        label:
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    stepTracker.changeStepGoal();
                    break;
                case 3:
                    stepTracker.printStatistic(scanner);
                    break;
                case 4:
                    System.out.println("Выход");
                    break label;
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Изменить цель по количеству шагов в день");
        System.out.println("3. Напечатать статистику за определённый месяц");
        System.out.println("4. Выйти из приложения");
        System.out.print("--> ");
    }
}


