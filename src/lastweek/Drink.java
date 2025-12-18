package lastweek;

public class Drink extends Food {
    private boolean cold;

    public Drink(String name, double price, boolean cold){
        super(name, price);
        this.cold = cold;
    }

    @Override
    public void describe(){
        System.out.print("Description of the drink: "+getInfo());
        if(cold){
            System.out.println(" Coldd\n");
        }else{
            System.out.println(" It' hott\n");
        }
    }
}
