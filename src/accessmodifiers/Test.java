package accessmodifiers;

import java.util.Date;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Date now = new Date();
        Homework homework = new Homework("SENG 211 - OOP","Prepare a slide about Array vs ArrayList and Date class", now);
        homework.printInfo();
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.DECEMBER, 10, 23, 59);
        Date deadline = cal.getTime();
        Homework hw2 = new Homework("CENG 201 - OOP","BST",deadline);
        hw2.printInfo();
    }
}
