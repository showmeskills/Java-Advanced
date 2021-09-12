package Demo01.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class MyOutputStream02 {
    public static void main(String ...args) throws IOException {
        /*
            public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
            一次写多个字节:
                如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
                如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
         */
        File file = new File(new File("").getAbsolutePath(),"src/b.txt");
//        byte[] content = {-65,-66,-67,68,69};
//        if(file.exists()){
//            FileOutputStream fos = new FileOutputStream(file);
//            fos.write(content);
//            fos.close();
//            System.out.println("content has written");
//        }else{
//            boolean result = file.createNewFile();
//            if(result){
//                System.out.println("file is created");
//            }
//        }
        /*
            public void write(byte[] b, int off, int len) ：把字节数组的一部分写入到文件中
                int off:数组的开始索引
                int len:写几个字节
         */
//        FileOutputStream fos = new FileOutputStream(file);
//        byte [] content = {65,66,67,68,69};//ABCDE
//        fos.write(content,1,3);//BCD
//        fos.close();

         /*
            写入字符的方法:可以使用String类中的方法把字符串,转换为字节数组
                byte[] getBytes()  把字符串转换为字节数组
         */
        FileOutputStream fos = new FileOutputStream(file);
        byte [] content = "我的妈呀".getBytes();
        byte [] content1 = "what the fuck you".getBytes();
        System.out.println(Arrays.toString(content1));//[119, 104, 97, 116, 32, 116, 104, 101, 32, 102, 117, 99, 107, 32, 121, 111, 117]
        fos.write(content1);
        fos.close();
    }
}
