package Demo03.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopeFile {
    public static void main(String ...args){
        long start = System.currentTimeMillis();
        File file = new File(
                new File("").getAbsolutePath(),
                "src/b.txt"
        );
        File newFile = new File(
                new File("").getAbsolutePath(),
                "src/c.txt"
        );
        boolean isFile = newFile.exists();

        try{
            if(!isFile){
                newFile.createNewFile();
            }
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(newFile);
            byte[] content = new byte[2048];
            int len = 0;
            while((len = fis.read(content))!= -1){
                String copyContent = new String(content,0,len);
                if(copyContent !=null){
                    fos.write(copyContent.getBytes());
                }
            }
            fis.close();
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            long end = System.currentTimeMillis();
            System.out.println("running time: "+(end-start)+"ms");
        }
    }
}
