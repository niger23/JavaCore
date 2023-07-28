package HomeWork004;

public class AmountException extends Exception{
    public AmountException(String message, int value) {
        super(message);
        System.out.printf("Значение не должно быть более 100 или менее 1\nВаше значение: %s\n", value);
    }
}
