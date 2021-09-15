package Demo03.ReverseStream;

import java.io.*;

/*
    FileReader可以读取IDE默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中文GBK)会产生乱码���
 */
public class Demo01FileReader {
    public static void main(String ...args) throws IOException {
        //write();
        read();
    }
    public static void write() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/c.txt");
        FileWriter fw = new FileWriter(pathname,false);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i<10;i++){
            bw.write("这个是中文的");
            bw.newLine();
        }
        bw.close();
    }
    public static void read() throws IOException{
        File pathname = new File(new File("").getAbsolutePath(),"src/c.txt");
        FileReader fr = new FileReader(pathname);
        int len = 0;
        while((len = fr.read()) != -1){
            System.out.println((char)len);
        }
    }
}
