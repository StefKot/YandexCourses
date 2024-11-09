import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest summerForest = new Forest(hares, "лето");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        summerForest.printHares();

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        summerForest.setSeason("зима");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        summerForest.printHares();
    }
}