package LabWorks;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;
    private static int totalAccounts;
    private static int MIN_BALANCE;
    private static int MAX_BALANCE;

    public BankAccount(){

    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
        }else{
            System.out.println("How are you going to deposit a nonexistent amount of money in here?");
        }
    }

    public void withdraw(){
        //
    }
    public String getInfo(){
        return accountNumber+ownerName+balance;
    }


}
