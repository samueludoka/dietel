package bankAccount.exceptions;

public class AccountNotFoundError extends RuntimeException{
    public AccountNotFoundError(String message){
        super(message);
    }
}
