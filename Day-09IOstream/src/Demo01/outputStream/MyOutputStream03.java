package Demo01.outputStream;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyOutputStream03 {
    public static void main(String ...args){
        File file = new File(
                new File("").getAbsolutePath(),
                "src/b.txt"
        );
        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            byte[] content = "what the fuck".getBytes();
            byte[] content1 = "你妈死了".getBytes();
            for(int i = 0; i < 10; i++){
                fos.write(content);
                fos.write(content1);
                fos.write("\r".getBytes());
            }
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
