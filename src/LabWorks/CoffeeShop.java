package LabWorks;
import java.util.*;

public class CoffeeShop{
public static void main(String[] args) {

   //This needs
    System.out.print("Hello! Welcome to our coffe shop! Our menu is:\n------------------ \nAmericano"+
            "\nCappucino\nLatte\nEspresso\n------------------\nPlease make a choice (A/C/L/E): ");
    Scanner keyboard = new Scanner(System.in);
    String choice = keyboard.nextLine();
    System.out.println(". . .");
    switch(choice.charAt(0)){
        case 'A': System.out.println("The price of Americano is 3 TL"); break;
        case 'C': System.out.println("The price of Cappucino is 3.75 TL"); break;
        case 'L': System.out.println("The price of Latte is 4 TL"); break;
        case 'E': System.out.println("The price of Espresso is 2.50 TL"); break;
        default: System.out.println("Invalid choice!");
        }
    }

}
