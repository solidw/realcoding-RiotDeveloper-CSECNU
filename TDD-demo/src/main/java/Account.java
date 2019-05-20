public class Account {
    private int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int depositMoney) {
        balance += depositMoney;
    }

    public void withdraw(int withdrawMoney) {
        if(balance < withdrawMoney)
            throw new IllegalArgumentException();
        balance -= withdrawMoney;
    }
}
