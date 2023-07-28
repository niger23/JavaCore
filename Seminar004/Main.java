package Seminar004;

//Задача: Проверка логина и пароля
//        1. Создать статический метод который принимает на вход три
//        параметра: login, password и confirmPassword.
//        2. Длина login должна быть меньше 20 символов. Если login не
//        соответствует этим требованиям, необходимо выбросить
//        WrongLoginException.
//        3. Длина password должна быть меньше 20 символов. Также password
//        и confirmPassword должны быть равны. Если password не
//        соответствует этим требованиям, необходимо выбросить
//        WrongPasswordException.
//        4. WrongPasswordException и WrongLoginException - пользовательские
//        классы исключения с двумя конструкторами – один по умолчанию,
//        второй принимает сообщение исключения и передает его в
//        конструктор класса Exception.
//        5. В основном классе программы необходимо по-разному обработать
//        исключения.
//        6. Метод возвращает true, если значения верны или false в другом
//        случае.

public class Main {
    public static void main(String[] args) {
        System.out.println(checkLoginPass("test","test","test1"));
        System.out.println(checkLoginPass("tebnbnbnbnbnbnbsdsdnbst","test","test1"));
        System.out.println(checkLoginPass("test","tesdsadsadsadasdsadsadst","test1"));
        System.out.println(checkLoginPass("test","test","test"));

    }
    public static boolean checkLoginPass(String a, String b, String c) {
        boolean result = false;
        try {
            result = CheckData.check(a,b,c);
        } catch (WrongLoginException|WrongPasswordException exception) {
            result = false;
        }
        return result;
    }

}
