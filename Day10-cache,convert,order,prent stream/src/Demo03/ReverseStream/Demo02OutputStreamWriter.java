package Demo03.ReverseStream;

import java.io.*;

public class Demo02OutputStreamWriter {
    public static void main(String ...args) throws IOException {
        write_gbk();
        //write_utf_8();
    }
    public static void write_gbk() throws IOException{
        File pathname = new File(new File("").getAbsolutePath(),"src/e.txt");
        FileOutputStream fos = new FileOutputStream(pathname);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");//
        osw.write("你好");
        osw.flush();
        osw.close();
    }
    public static void write_utf_8() throws  IOException{
        File pathname = new File(new File("").getAbsolutePath(),"src/d.txt");
        FileOutputStream fos = new FileOutputStream(pathname);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
