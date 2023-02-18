package IOStreams;

import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
    public static void main(String[] args)
    {
        FileReader fr = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("C:\\Users\\snari\\Documents\\notes\\istqb.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("C:\\Users\\snari\\Documents\\notes\\1.txt");
            bw = new BufferedWriter(fw);

            String sentence;
            while ((sentence=br.readLine())!=null)
            {
                StringTokenizer st =  new StringTokenizer(sentence , "" ,true);
                while(st.hasMoreTokens())
                {
                    //bw.write(st.nextToken());
                    System.out.println(st.nextToken());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
                fr.close();
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
