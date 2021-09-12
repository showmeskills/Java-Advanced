package Demo06.trycatch;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTryAndCatch02JDK7 {
    public static void main(String ...args){
        File pathname = new File(new File("").getAbsolutePath(),"src/img/1.png");
        File distPathname = new File(new File("").getAbsolutePath(),"src/copyImg/1.png");
        try(
                FileInputStream fis = new FileInputStream(pathname);
                FileOutputStream fos = new FileOutputStream(distPathname);
                )
        {
            byte[] content = new byte[1024];
            int len = 0;
            while((len = fis.read(content)) != -1){
                fos.write(content,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
