package LabWorks;
import java.util.*;

public class Car {

    String brand;
    String model;
    int year;
    Engine engine;

    public Car(String brand, String model, int year, int horsePower, Engine.FuelType fuelType){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = new Engine(horsePower, fuelType);
    }

    public void displayInfo(){
        System.out.println(this.year+ " " + this.brand+ " " + this.model);
    }
    public static void main(String[] args){
        Car myCar = new Car("BMW","i8",2018, 320, Engine.FuelType.ELECTRIC);
        myCar.displayInfo();
    }
}
