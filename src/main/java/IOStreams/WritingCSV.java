package IOStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingCSV {

    public static void main(String[] args) {
        File f = new File("./file.txt");
        FileWriter fw;
        BufferedWriter br;

        {
            try {
                fw = new FileWriter(f,true);
                br = new BufferedWriter(fw);
                for (int i = 0; i <= 4; i++)
                {
                    int v = (int) (Math.random() * 100);
                    for (int j = 0; j <= 3; j++)
                    {
                        br.write(v+ "\t");
                    }
                    br.newLine();
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
