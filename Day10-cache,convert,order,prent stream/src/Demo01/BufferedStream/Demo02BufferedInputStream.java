package Demo01.BufferedStream;

import java.io.*;

public class Demo02BufferedInputStream {
    public static void main(String ...args) throws IOException {
        show();
    }
    public static void show() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/a.txt");
        FileInputStream fis = new FileInputStream(pathname);
        BufferedInputStream bis = new BufferedInputStream(fis);
//        int len = 0;
//        while((len = bis.read())!=-1){
//            System.out.println(len);//打印 int 字节
//        }
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));//打印文字
        }
        fis.close();
        bis.close();
    }
}

