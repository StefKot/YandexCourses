class MountainHare {
    private int age;
    private double weight;
    private double jumpLength;
    private String color;

    // Конструктор
    public MountainHare(int age, double weight, double jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
        this.color = "серо-рыжий"; // Начальный цвет по умолчанию
    }

    // Метод для установки цвета
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}