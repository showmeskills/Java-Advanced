package Demo02.CopyFile;

import java.io.*;

public class Demo01CopyFile {
    public static void main(String ...args) throws IOException {
        show();
    }
    public static void show() throws IOException {
        long start = System.currentTimeMillis();
        File pathname = new File(new File("").getAbsolutePath(),"src/img/1.png");
        File distPathName = new File(new File("").getAbsolutePath(),"src/toImg/cp.png");
        FileInputStream fis = new FileInputStream(pathname);
        FileOutputStream fos = new FileOutputStream(distPathName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!= -1){
            bos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成一共耗时"+(end-start)+"ms");
    }
}
