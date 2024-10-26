import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DinnerConstructor dinnerConstructor = new DinnerConstructor();


        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите тип блюда: ");
                String dishType = scanner.next();
                System.out.println("Введите название блюда: ");
                String dishName = scanner.next();
                dinnerConstructor.addNewDish(dishType, dishName);
            } else if (command == 2) {
                dinnerConstructor.generateCombinationOfDishes();
            } else if (command == 3) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }
}
