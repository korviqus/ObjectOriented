package lastweek;

public class TestFood {
    public static void main(String[] args) {
        MainDish anayemek = new MainDish("Kavurma", 150, false);
        Dessert tatli = new Dessert("Kadayıf",180,true);
        Drink icecek = new Drink("Kahve",65,false);

        anayemek.describe();
        tatli.describe();
        icecek.describe();
    }
}
