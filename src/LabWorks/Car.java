package LabWorks;
import java.util.*;

public class Car {

    String brand;
    String model;
    int year;
    Engine engine;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println(this.year+ " " + this.brand+ " " + this.model);
    }
    public static void main(String[] args){
        Car myCar = new Car("BMW","i8",2018);
        myCar.displayInfo();
    }
}
