package HomeWork001.ru.gb.javaHw1;

import java.util.Scanner;

public class Main {
    public static void App() {
        try (Scanner in = new Scanner(System.in)) {
            while(true) {
                System.out.println((char)27 + "[33m1 - вывод всех записей\n2 - добавить новую запись\n3 - выход"+ (char)27 + "[0m");
                String menu = in.nextLine();
                if (menu.equals("1")) FileCommand.readerNote();
                else if (menu.equals("2")) FileCommand.writeNote(addNote(in));
                else System.exit(0);
            }
        } catch (Exception e) {
            
        }
    }
    public static void showNote() {

    }
    public static String addNote(Scanner in) {
        InputData newData = new InputData();
        newData.setText(in);
        newData.setDate();

        return newData.toString();
    }
}
