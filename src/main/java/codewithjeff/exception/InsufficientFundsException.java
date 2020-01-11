package codewithjeff.exception;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Failed: Insufficient Funds");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
