package bankAccount.exceptions;

public class WrongPinException extends RuntimeException{

    public WrongPinException(String message) {
        super(message);
    }
}
