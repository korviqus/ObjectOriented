package LabWorks;

public class Engine{
    public enum FuelType{
        GASOLINE,DIESEL,ELECTRIC
    }
    int horsePower;
    FuelType fueltype;

    public Engine(int horsepower, FuelType fuelType){
        this.horsePower = horsepower;
        this.fueltype = fuelType;
    }
}
