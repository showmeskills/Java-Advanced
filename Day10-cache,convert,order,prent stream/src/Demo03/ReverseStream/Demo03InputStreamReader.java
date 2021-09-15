package Demo03.ReverseStream;

import java.io.*;

public class Demo03InputStreamReader {
    public static void main (String ...args) throws IOException {
        read();
    }
    public static void read() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/d.txt");
        FileInputStream fis = new FileInputStream(pathname);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        int len = 0;
        while((len = isr.read())!= -1){
            System.out.println((char)len);
        }
    }
}
