package accessmodifiers;

public class Flower {
    private String colour;
    private String name;
    private double unitPrice;

    public Flower(String colour, String name, double unitPrice){
        this.colour = colour;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getColour(){
        return this.colour;
    }

    public String getName(){
        return this.name;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setColour(String newColour){
        this.colour = newColour;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setUnitPrice(double newPrice){
        this.unitPrice = newPrice;
    }

    public String getInfo(){
        return this.name+this.colour+ Double.toString(this.unitPrice);

        //Search for some method to call getter sand setter methods quick and short
    }
}
