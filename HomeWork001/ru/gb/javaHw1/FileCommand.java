package HomeWork001.ru.gb.javaHw1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCommand {
    
    public static void writeNote(String text) {
    
        try(FileWriter writer = new FileWriter("HomeWork001\\ru\\gb\\javaHw1\\notes.txt", true)) {
            writer.write(text);
        } catch(IOException ex) {          
            System.out.println(ex.getMessage());
        }
    }
    public static void readerNote() {
        try(FileReader reader = new FileReader("HomeWork001\\ru\\gb\\javaHw1\\notes.txt")) {
            int c;
            while((c=reader.read())!=-1) {    
                System.out.print((char)c);
            } 
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }   
    }
}
