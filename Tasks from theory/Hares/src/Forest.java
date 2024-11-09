import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;
    public static String season;

    // Конструктор
    public Forest(ArrayList<MountainHare> hares, String season) {
        this.hares = hares;
        this.season = season;
        setSeason(season);
    }

    // Метод для установки времени года и изменения цвета шерсти зайцев
    public void setSeason(String newSeason) {
        season = newSeason;
        for (MountainHare hare : hares) {
            if (season.equals("зима")) {
                hare.setColor("белый");
            } else if (season.equals("лето")) {
                hare.setColor("серо-рыжий");
            }
        }
    }

    // Метод для печати зайцев
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
