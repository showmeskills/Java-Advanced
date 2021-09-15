package Demo01.BufferedStream;

import java.io.*;

public class Demo04BufferedRead {
    public static void main(String ...args) throws IOException {
        show();
    }
    public static void show() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/b.txt");
        FileReader fr = new FileReader(pathname);
        BufferedReader br = new BufferedReader(fr);
        //read one line
        System.out.println("only the first line==>"+br.readLine());
        //int read()
        System.out.println(br.read());//int
        //int read(char[] cbuf)
        char[] cs = new char[1024];//1024 或者 1024的倍数
        int len = 0;
        while((len = br.read(cs))!= -1){
            System.out.println(new String(cs,0,len));
        }
        br.close();
        fr.close();
    }
}
