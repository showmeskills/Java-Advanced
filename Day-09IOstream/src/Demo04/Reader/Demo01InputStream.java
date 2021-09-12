package Demo04.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String ...args){
        try{
            File file = new File(
                    new File("").getAbsolutePath(),
                    "src/c.txt"
            );
            FileInputStream fis = new FileInputStream(file);
            byte[] content = new byte[1024];
            int len = 0;
            while((len = fis.read(content))!= -1){
                System.out.println((char)len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
