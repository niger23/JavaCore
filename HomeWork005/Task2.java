package HomeWork005;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,1,2,2,0};
        writeField(arr);
        loadField();

    }
    public static void writeField(int[] arr) {
        try (FileOutputStream fos = new FileOutputStream("HomeWork005/save.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1 || arr[i] == 2 || arr[i] == 3 || arr[i] == 0) sb.append(arr[i]);
                else throw new RuntimeException();
            }

            fos.write(sb.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (RuntimeException e) {
            System.out.println("В массиве есть что-то кроме 1, 2 или 3");
        }
    }
    public static void loadField() {
        try (FileInputStream fis = new FileInputStream("HomeWork005/save.txt")) {
            int b;
            int count = 0;
            System.out.println("Игровое поле:");
            while ((b = fis.read()) != -1) {
                b = Integer.parseInt(String.valueOf((char) b));
                if (b == 0) System.out.printf("X");
                else if (b == 1) System.out.printf("O");
                else if (b == 2) System.out.printf(".");
                else System.out.printf(" ");
                count++;
                if (count%3 == 0) System.out.printf("\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
