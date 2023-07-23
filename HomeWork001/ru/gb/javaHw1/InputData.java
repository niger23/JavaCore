package HomeWork001.ru.gb.javaHw1;

import java.time.LocalDate;
import java.util.Scanner;

public class InputData {
    private String text;
    private LocalDate date;
     
    public InputData() {
    }

    public void setText(Scanner in) {
        System.out.println("Введите заметку: ");
        this.text = in.nextLine();
    }

    public void setDate() {
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return date + " -> " + text + "\n";
    }
}
