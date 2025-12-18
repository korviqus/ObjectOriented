package lastweek;

public class Dessert extends Food {
    private boolean containsSugar;

    public Dessert(String name, double price, boolean containsSugar){
        super(name, price);
        this.containsSugar = containsSugar;
    }

    @Override
    public void describe(){
        System.out.print("Description of the dessert: "+getInfo());
        if(containsSugar){
            System.out.print(" With sugar.\n");
        }else{
            System.out.print(" Without sugar\n");
        }
    }
}
