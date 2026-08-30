class BankAccount{
    private double balance;                 //private field - hidden from outside
    public BankAccount(double balance){
        if(balance >= 0){
            this.balance = balance;
        }
    }

    // Getter - controlled read access
    public double getBalance(){
        return balance;
    }

    // Setter with valuatioon - controlled with access
public void deposit(double amount){
    if(amount >0){
        balance += amount;
    }
}

public void withdraw(double amount){
    if(amount <0 && amount <= balance)   balance -= amount;
    else System.out.println("Invalid withdrawal amount");
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10); //create an object of BankAccount class
        account.deposit(40);   //calling a deposit method
        account.withdraw(20);  //calling a withdraw method
        System.out.println("Balance is: " + account.getBalance());


    }

}
