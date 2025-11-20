package LabWorks;

public class Cat {
    int x;
    double direction;
    String name;

    public Cat(){
        this(0,180.0,"Sofya");
    }
    public Cat(int x, double direction, String name){
        this.x = x;
        this.direction = direction;
        this.name = name;
    }

    public void move(){
        this.x += 20;
    }

    public void move2(int a){
        this.x += a;
    }

    public void turn(double angle){
        this.direction += angle;
    }

    public void status(){
        System.out.println("Name: "+this.name+", X: "+this.x+", Direction: "+this.direction);
        System.out.println("---------------------------------------");
    }
    public static void main(String[] args){
        Cat myCat = new Cat();
        myCat.status();

        Cat secondCat = new Cat(5,45,"Lucy");

        myCat.move();
        secondCat.move2(20);

        myCat.status();

        secondCat.status();

    }
}

