package Seminar004;

public class CheckData {
    public static final int rightLength = 20;
    public static boolean check(String login, String pass, String conPass) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= rightLength) {
            throw new WrongLoginException("Ошибка в логине", login.length());
        } else if (pass.length() >= rightLength) {
            throw new WrongPasswordException("Ошибка в пароле", pass.length());
        } else if (!pass.equals(conPass)) throw new WrongPasswordException("Ошибка в пароле");
        else return true;
    }
}
