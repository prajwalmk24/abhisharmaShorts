package testKnowledge;

public class synchroExample {
    public static void main(String[] args) {

        BankAccount b1= new BankAccount();
        b1.withdraw(100);
        System.out.println(b1.getBalance());
    }
}

class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

