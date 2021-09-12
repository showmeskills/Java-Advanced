package Demo02.InputStream;

import java.io.*;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String ...args) throws IOException {
//        File file =new File(new File("").getAbsolutePath(),"src/b.txt");
//        FileInputStream fis = new FileInputStream(file);
//        byte[] bytes = new byte[2];//2 代表 每秒以2个字节来读取;通常以1024
//        int len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(Arrays.toString(bytes));//[119, 104]
//        System.out.println(new String(bytes));//wh
//        fis.close();
        
        
        File file =new File(new File("").getAbsolutePath(),"src/b.txt");
        FileOutputStream fos = new FileOutputStream(file);
        byte[] content = "what the fuck is Terry".getBytes();
        for(int i = 0; i < 10; i++){
            fos.write(content);
            fos.write("\r".getBytes());
        }
//        File file =new File(new File("").getAbsolutePath(),"src/b.txt");
//        FileInputStream fis = new FileInputStream(file);
//        byte[] bytes = new byte[1024];//2 代表 每秒以2个字节来读取;通常以1024
//        int len = 0;
//        while((len = fis.read(bytes)) != -1){
//            //System.out.println(Arrays.toString(bytes));
//            System.out.println(new String(bytes,0,len));
//        }
        fos.close();
    }

}
