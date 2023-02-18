package IOStreams;

import java.io.*;

public class FileInputReaderDemo {

    public static void main(String[] args)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("C:\\Users\\snari\\Documents\\notes\\1.txt"));
            fos = new FileOutputStream(new File("C:\\Users\\snari\\Documents\\notes\\2.txt"));

            int i;
            while ((i=fis.read())!=-1)
            {
                System.out.println((char)i);
                fos.write((char)i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
