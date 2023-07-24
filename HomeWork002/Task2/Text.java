package HomeWork002.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Text {
    private String text;
    private boolean code;
    
    public Text() throws IOException{
        this.text = Files.readString(Path.of("HomeWork002\\\\Task2\\\\text.txt"));
        this.code = false;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public boolean isCode() {
        return code;
    }
    public void setCode() {
        if (code) this.code = false;
        else this.code = true;
    }
    public static void codeGen(Text text, int shift) throws IOException {
        if(!text.code) {
            String s = "";
            String msg = text.getText();
            int len = msg.length();
            for(int x = 0; x < len; x++){
                char c = (char)(msg.charAt(x) + shift);
                if (c > 'z')
                    s += (char)(msg.charAt(x) - (26-shift));
                else
                    s += (char)(msg.charAt(x) + shift);
            }
            System.out.println("Зашифрованно!");
            text.setCode();
            text.setText(s);
            FileCommand.writeNote(s);
        } else {
            String s = "";
            String msg = text.getText();
            int len = msg.length();
            for(int x = 0; x < len; x++){
                char c = (char)(msg.charAt(x) - shift);
                if (c > 'z')
                    s += (char)(msg.charAt(x) + (26+shift));
                else
                    s += (char)(msg.charAt(x) - shift);
            }
            System.out.println("Расшифрованно!");
            text.setCode();
            text.setText(s);
            FileCommand.writeNote(s);
        }
    }
    
}
