package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteIntoAFile {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("DataSet1/1.txt");
            Files.createFile(path);
            String s = "Hey! What's Up!!";
            Files.write(path,s.getBytes());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
