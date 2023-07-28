package Seminar004;

public class WrongLoginException extends Exception{

    public WrongLoginException(String msg, int length) {
        super(msg);
        System.out.println(msg + "\n" + "Должны были получить длину: < " + CheckData.rightLength + "\n" + "Получили: " + length);

    }
}
