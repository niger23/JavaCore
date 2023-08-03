package HomeWork005;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task1 {
    public static void main(String[] args) throws IOException {
        backupFolder();
    }
    public static void  backupFolder() throws IOException {
        File folder = new File("HomeWork005/Test");
        File backUpFolder = new File ("./HomeWork005/backup/");
        if(!backUpFolder.exists())
        {
            Path path = Files.createDirectory(Paths.get("./HomeWork005/backup"));
            System.out.print("Folder backup create\n");
        }
        for (File file : folder.listFiles())
            if (file.isFile()) {
                Files.copy(file.toPath(), Paths.get(backUpFolder+"/"+file.getName()), StandardCopyOption.REPLACE_EXISTING);
                System.out.printf("File %s copy\n", file.getName());
            }
    }
}
