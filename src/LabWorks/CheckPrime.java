package LabWorks;

public class CheckPrime {

    public static void isPrime(int n) {
        if(n > 1){
            for(int i = 2; i <= n/2; i++){
                if(n%i == 0){
                    System.out.printf("%d is not a prime number\n", n);
                    return;

                }
            }
            System.out.printf("%d is a prime number.\n",n);
        } else if (n == 1) {
            System.out.println("One is not a prime number!");
        } else {
            System.out.println("Negative numbers are not prime numbers!");
        }
    }
    public static void main(String[] args){
        isPrime(51);
        isPrime(3);
        isPrime(1);
        isPrime(-12);
    }
}
