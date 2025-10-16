package LabWorks;

public class CheckPrime {
    public static boolean isPrime(int n) {
        for(int i = 2; i < n/2; i++){
            if(i > 0){
                if(i == 0){
                    System.out.println("One is not a prime number!");
                }
            }else{
                System.out.println("Negative numbers are not prime numbers.");
            }
        }
    }
    public static void main(String[] args){
        System.out.println(isPrime(51));
    }
}
