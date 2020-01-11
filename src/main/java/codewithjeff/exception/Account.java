package codewithjeff.exception;

public class Account {
    private int balance;

    public void withdraw(int amount) throws AccountException {
        if (amount <= 0)
            throw new AccountException(new InsufficientFundsException("Insufficient Funds."));
        System.out.println("Sucessful! You already withdrawn.");
    }
}
