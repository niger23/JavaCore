package HomeWork002.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCommand {
    
    public FileCommand() throws IOException{
        }
        
        public static void writeNote(String text) {
    
        try(FileWriter writer = new FileWriter("HomeWork002\\Task2\\text.txt", false)) {
            writer.write(text);
        } catch(IOException ex) {          
            System.out.println(ex.getMessage());
        }
    }
    
    public static void readerNote() {
        try(FileReader reader = new FileReader("HomeWork002\\Task2\\text.txt")) {
            
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
