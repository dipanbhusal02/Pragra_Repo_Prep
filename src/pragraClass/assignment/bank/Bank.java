package pragraClass.assignment;

public class Bank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Ryan", 500);
        BankAccount account2 = new BankAccount("Christoper", 1000);
        BankAccount account3 = new BankAccount("Jose",1500.45);
        
        account1.display();
        account1.withdraw( 50);
        account1.deposit(500);
        System.out.println(account1.name);
    }

}
