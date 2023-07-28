package Seminar004;

public class WrongPasswordException extends Exception{


    public WrongPasswordException(String msg, int length) {
        super(msg);
        System.out.println(msg + "\n" + "Должны были получить длину: < " + CheckData.rightLength + "\n" + "Получили: " + length);

    }
    public WrongPasswordException(String msg) {
        super(msg);
        System.out.println(msg + "\n" + "Пароль и повторение пароля не равны!");

    }
}
