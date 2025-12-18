package lastweek;

public class Food {
    protected String name;
    protected double price;

    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getInfo(){
        return this.name + "|" + this.price;
    }

    public void describe(){
        System.out.print("Description of food class: "+getInfo());
    }


}
