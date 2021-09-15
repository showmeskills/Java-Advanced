package Demo03.ReverseStream;

import java.io.*;

public class Test {
    public static void main (String ...args) throws IOException {
        convert();
    }
    public static void convert() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/e.txt");
        FileInputStream fis = new FileInputStream(pathname);
        InputStreamReader isr = new InputStreamReader(fis,"GBK");

        File dist = new File(new File("").getAbsolutePath(),"src/dist.txt");
        FileOutputStream fos = new FileOutputStream(dist);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        int len = 0;
        while((len = isr.read()) != -1){
            osw.write((char)len);
        }
        isr.close();
        osw.close();
    }
}

