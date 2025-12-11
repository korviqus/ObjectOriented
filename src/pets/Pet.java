package pets;

public class Pet {
    private String name;
    private String owner;
    private int age;
    private boolean isMale;



    public Pet(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.owner = "empty";
    }

    public Pet(int age, boolean isMale){
        this.age = age;
        this.isMale = isMale;
        this.owner = "empty";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void beAdpoted(String owner, String name){
        this.owner = owner;
        this.name = name;
    }

    protected static boolean isNullOrEmpty(String s){
        return s.isEmpty() || s == null;
    }

    protected boolean hasOwner(){
        return isNullOrEmpty(this.owner);
    }

    public void changeName(String name){
        if(hasOwner()){
            this.name = name;
        }
    }
}
