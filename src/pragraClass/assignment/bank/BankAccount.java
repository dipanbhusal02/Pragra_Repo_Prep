package pragraClass.assignment;

public class BankAccount {
    String name;
    double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account name: "+ name);
        System.out.println("Account Balance: "+ balance);
    }

    public void withdraw(double amount) {
        if (amount>balance){
            System.out.println("Insufficient funds!");
            System.out.println("Account balance:"+ balance );
            System.out.println("Withdraw attempted: "+ amount);
        }
        else if( amount<balance){
            balance -= amount;
            System.out.println("Transaction successfull!");
            System.out.println("The new balance is: "+ balance);

        }
        else{
            System.out.println("Invalid Entry");
        }
    }

    public void deposit(int amount) {
        if(amount>0){
            balance += amount;
            System.out.println("Deposit Successfull");
            System.out.println("New account balance is: "+ balance);
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
}
