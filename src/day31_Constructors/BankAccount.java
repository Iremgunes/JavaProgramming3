package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your avaliable balance is: " + balance);
    }

    public  void deposit(double amount){
        if(amount<0){
            System.err.println("depositinf amount can not be zero or negative");
        return; // exits the methods
        }

        balance += amount;
        }

    public void  withdraw(double amount){

        if(amount> balance){
            System.out.println("ınsufficient balance");
            return;
        }

        if(amount<=0){
            System.out.println("withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;

        }


}
