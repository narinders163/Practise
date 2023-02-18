package IOStreams;

import java.io.*;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
            FileReader rd = new FileReader("C:\\Users\\snari\\Documents\\notes\\1.txt");
            FileWriter wr = new FileWriter("C:\\Users\\snari\\Documents\\notes\\2.txt");
            int c;
            while ((c=rd.read())!=-1)
            {
               wr.write((char)c);
                //System.out.print((char)c);
            }
            rd.close();
            wr.close();
    }
}
