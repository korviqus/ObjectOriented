package LabWorks;

public class Cylinder {
    static int noOfCylinder = 0;
    double r;
    double h;

    public Cylinder(){
        this(3, 4); //this calls the constructor with arguments
    }
    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
        noOfCylinder++;
    }

    public static int getNoOfCylinder(){
        return noOfCylinder;
    }

    public double calculateBaseArea(){
        return Math.PI * r * r;
    }
    public double calculateSurfaceArea(){
        return (Math.PI * 2)*(this.r + this.h);
    }
    public double calculateVolume(){
        return (Math.PI * r * r * this.h);
    }
    public double calculateMass(double density){
        return density * this.calculateVolume();
    }
}
