public class VegetarianSoup extends SoupBase {
    double water;
    double salt;
    double vegetables;

    // реализуйте необходимые конструкторы
    public VegetarianSoup(SoupBase soupbase, double vegetables) {
        super(soupbase.water, soupbase.salt);
        this.vegetables = vegetables;
    }

    public VegetarianSoup(double water, double salt, double vegetables) {
        super(water, salt);
        this.vegetables = vegetables;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}