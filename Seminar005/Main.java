package Seminar005;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[] {1,2,3,4,5,6,7,8,9 };
//        createFile(arr);
//        int[] resArr = readFile();
//        System.out.println(Arrays.toString(resArr));
        reloadChar('1','0');

    }
    public static void createFile (int[] arr) {
        try (FileOutputStream fos = new FileOutputStream("Seminar005/save.txt");) {
            for (int i = 0; i < arr.length; i++) {
                fos.write(String.valueOf(arr[i]).getBytes());
                fos.write(String.valueOf(0).getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] readFile() {
        int[] res = new int[9];
        try (FileInputStream fos = new FileInputStream("Seminar005/save.txt");) {
            for (int i = 0; i < res.length; i++) {
                res[i] = Integer.parseInt(String.valueOf((char)fos.read()));
                fos.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
    public static void reloadChar(char chOld, char chNew) {
        String tempString;
        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream("Seminar005/text.txt"))) {
            tempString = new String(reader.readAllBytes()).replace(chOld,chNew);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("Seminar005/text.txt"))) {
            writer.write(tempString.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
