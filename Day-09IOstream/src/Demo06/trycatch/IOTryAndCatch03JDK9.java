package Demo06.trycatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTryAndCatch03JDK9 {
    public static void main(String ...args)throws IOException{
        File pathname = new File(new File("").getAbsolutePath(),"src/img/1.png");
        File distPathname = new File(new File("").getAbsolutePath(),"src/copyImg/1.png");
        FileInputStream fis = new FileInputStream(pathname);
        FileOutputStream fos = new FileOutputStream(distPathname);
        try(fis;fos){
            int len = 0;
            while((len = fis.read()) != -1){
                fos.write(len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
