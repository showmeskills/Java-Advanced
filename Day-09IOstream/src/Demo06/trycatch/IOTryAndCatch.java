package Demo06.trycatch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOTryAndCatch {
    public static void main(String ...args){
        FileWriter fw = null;
        File file = null;
        try{
            file = new File(new File("").getAbsolutePath(),"src/e.txt");
            fw = new FileWriter(file,false);
            for(int i=0; i < 100; i++){
                fw.write("what the fuck");
                fw.write("\r");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null){
                try{
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
