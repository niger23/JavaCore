package HomeWork002.Task2;

import java.util.Scanner;

public class UserConsole {
    public static void App () {
        try (Scanner in = new Scanner(System.in)) {
            Text text = new Text();
            while(true) {
                System.out.println((char)27 + "[33m\n1 - Посмотреть текст\n2 - Зашифровать/Расшифровать\n3 - Записать новый текст\n4 - выход"+ (char)27 + "[0m");
                String menu = in.nextLine();
                if (menu.equals("1")) FileCommand.readerNote();
                else if (menu.equals("2")) {
                    Integer shift = -1;
                    while (shift < 0) {
                        System.out.println("Введите ключ (число): ");
                            shift = Integer.parseInt(in.nextLine());
                        }
                        Text.codeGen(text,shift);
                } else if (menu.equals("3")) {
                    System.out.println("Введите новый текст(en): ");
                    String msg = in.nextLine();
                    text.setText(msg);
                    FileCommand.writeNote(msg);
                }
                else System.exit(0);
            }
            } catch (Exception e) {
                System.out.println((char)27 + "[31mНепредвиденная ошибка"+ (char)27 + "[0m");
        }
    }
}
