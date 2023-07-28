package HomeWork004;

public class CustomerException extends Exception{
    public CustomerException(String message) {
        super(message);
        System.out.println(message);
    }
}
