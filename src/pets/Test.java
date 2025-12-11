package pets;

public class Test {
    public static void main(String[] args) {
        Pet p = new Pet(3,true);
        System.out.println("Is pet male: "+ p.isMale());

        Dog d = new Dog(3,true,"white","");
        d.beAdpoted("Peter","Leslie");
        System.out.println("Name of dog: "+ d.getName());
        System.out.println("Human ago of dog"+.d.getHumanAge());
        d.speak();
    }
}
