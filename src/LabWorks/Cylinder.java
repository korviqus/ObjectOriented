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

    public static void main(String[] args){
        Cylinder itsaCylinder = new Cylinder();
        System.out.println("Radius: "+itsaCylinder.r+", height: "+itsaCylinder.h);
        System.out.println(getNoOfCylinder());

        Cylinder myCylinder = new Cylinder(10,20);
        System.out.println("Radius: "+myCylinder.r+", height: "+myCylinder.h);
        System.out.println("Base area: "+myCylinder.calculateBaseArea());
        System.out.println("Surface area: "+myCylinder.calculateSurfaceArea());
        System.out.println("Volume: "+myCylinder.calculateVolume());
        System.out.println("Mass: "+myCylinder.calculateMass(5.12));
    }
}
