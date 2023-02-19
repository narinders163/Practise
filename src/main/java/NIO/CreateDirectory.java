package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
    public static void main(String[] args) {
        try{
            Path dataSet = Paths.get("DataSet1");
            if(Files.exists(dataSet)) {
                System.out.println("Directory is found");
            }
            else {
                Path directory = Files.createDirectory(dataSet);
                System.out.println("The Path of the directoy is : " + directory.toString());
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("jbjzbjzdbjdb");

    }
}
