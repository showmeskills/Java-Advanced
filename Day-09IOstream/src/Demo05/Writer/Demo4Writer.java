package Demo05.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class Demo4Writer {
    public static File file = new File(
            new File("").getAbsolutePath(),
            "src/e.txt"
    );
    public static void createFile()throws IOException {

        if (!file.exists()) {
            System.out.println("file is existed");
        }else{
            boolean createFile = file.createNewFile();
            if(createFile){
                System.out.println("e.txt has been successfully created");
            }else{
                System.out.println("e.txt has been fail created");
            }
        }
    }
    public static void write(boolean isCover) throws IOException {
        FileWriter fw = new FileWriter(file,isCover);
        for(int i=0; i < 1000; i++){
            fw.write("this is a test demo in filewriter");
            fw.write("\r");
        }
        fw.close();
        System.out.println("write is completed");
    }
    public static void calc() throws InterruptedException{
        int time = 0;
        boolean isStart = true;
        while(isStart){
            time++;
            Thread.sleep(1000);
            System.out.println(time+"s");
            if(time == 5){
                isStart = false;
            }
        }

    }
    public static void main(String ...args){
        long start = System.currentTimeMillis();
        try{
            createFile();
            System.out.println("after 5s to start writing new content in the e.txt");
            calc();
            System.out.println("writing start");
            write(false);
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("total time is"+ ((end-start)/1000) + "s");
    }
}
