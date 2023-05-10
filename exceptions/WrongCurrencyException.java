package exceptions;

public class WrongCurrencyException extends Exception{
    public WrongCurrencyException(String message) {
        super(message);
    }
}
