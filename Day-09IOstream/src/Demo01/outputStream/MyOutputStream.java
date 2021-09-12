package Demo01.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyOutputStream {
    public static void main(String ...args)throws IOException {
        File file = new File(new File("").getAbsolutePath(),"src/a.txt");
        byte content = 98;
        if(file.exists()){
            System.out.println(file.getName()+"is existed");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(content);
            System.out.println("write is completed");
            fos.close();
        }else{
            boolean isCreated = file.createNewFile();
            if(isCreated){
                System.out.println("a.txt is created");
            }else{
                System.out.println("a.txt is not created");
            }
        }
    }
}
