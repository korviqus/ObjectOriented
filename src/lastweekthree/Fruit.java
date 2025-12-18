package lastweekthree;

public class Fruit {
    protected String name;
    protected double calories;

    public Fruit(String name, double calories){
        this.name = name;
        this.calories = calories;
    }

    public String getInfo(){
        return this.name+" | "+this.calories;
    }

    public void describe(){
        System.out.println("General fruit info: "+this.getInfo());
    }
}
