package lastweek;

public class MainDish extends Food {
    private boolean spicy;

    public MainDish(String name, double price, boolean spicy){
        super(name,price);
        this.spicy = spicy;
    }

    @Override
    public void describe(){
        System.out.print("Description of main dish: "+getInfo());
        if(spicy){
            System.out.print(" Warning: spicy.\n");
        }else{
            System.out.print(" Warning: not spicy :( .\n");
        }
    }
}
