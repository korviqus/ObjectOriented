package lastweektwo;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1.5,2.5));
        System.out.println(calc.add(1,2,7));
    }

}
