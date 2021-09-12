package Demo02.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String ...args) throws IOException {
//        try{
//            File file =new File(new File("").getAbsolutePath(),"src/b.txt");
//            FileInputStream fis = new FileInputStream(file);
//            int content = fis.read();
//            int content1 = fis.read();
//            int content2 = fis.read();
//            System.out.println(content);//119
//            System.out.println(content1);//104
//            System.out.println(content2);//97
//            fis.close();
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
        File file =new File(new File("").getAbsolutePath(),"src/b.txt");
        FileInputStream fis = new FileInputStream(file);
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
