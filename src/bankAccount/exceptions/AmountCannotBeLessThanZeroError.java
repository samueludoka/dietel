package bankAccount.exceptions;

public class AmountCannotBeLessThanZeroError extends RuntimeException{
    public AmountCannotBeLessThanZeroError(String message){
        super(message);
    }
}
