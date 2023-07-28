package HomeWork004;

public class ProductException extends Exception{
    public ProductException(String message) {
        super(message);
        System.out.println(message);
    }
}
