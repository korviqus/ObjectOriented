package LabWorks;
import java.util.*;

public class ConvertDay {
    public static void main(String[] args){
        String day = "";
        System.out.print("Hello! Please enter a number (1-7): ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        //The use of if/else is requested
        if(number == 1){
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = "Friday";
        } else if (number == 6){
            day = "Saturday";
        } else if (number == 7) {
            day = "Sunday";
        }

        System.out.println("Day number "+ number+"is "+day);

    }
}
