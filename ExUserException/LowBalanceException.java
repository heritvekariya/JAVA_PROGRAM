package ExUserException;
public class LowBalanceException extends Exception {

    public LowBalanceException() {
        super("Balance is too low for this withdrawal.");
    }
    public LowBalanceException(String msg) {
        super(msg);
    }
}
