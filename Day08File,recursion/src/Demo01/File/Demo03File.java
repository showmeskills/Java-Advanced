package Demo01.File;

import java.io.File;
import java.io.IOException;

public class Demo03File {
    public static void main(String ...args){
        //show();
        //show01();
        //show02();
        //show03();
        show04();
    }

    public static void show(){
        File file = new File(
                new File("").getAbsolutePath(),
                "src/a/a.txt"
        );
        if(file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }
    }
    public static void show01() {
        try{
            File file = new File(
                    new File("").getAbsolutePath(),
                    "src/a/b.txt");
            if(file.exists()){
                System.out.println(file);
            }else{
                boolean isCreated = file.createNewFile();
                System.out.println(isCreated);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void show02(){
        File file = new File(
                new File("").getAbsolutePath(),
                "src/b"
        );
        if(file.exists()){
            boolean delete = file.delete();
            String isDelete = delete == true ? "delete successfully" : "delete failed";
            System.out.println(isDelete);
        }else{
            boolean dir = file.mkdir();
            String result = dir == true? "create successfully" : "create failed";
            System.out.println(result);
        }

    }
    public static void show03(){
        File dir = new File(
                new File("").getAbsolutePath(),
                "src/b"
        );
        File file = new File(
                dir,
                "b.txt"
        );
        if(dir.exists()){
            System.out.println("File is existed");
        }else{
            try{
                boolean isDir = dir.mkdir();
                if(isDir){
                    System.out.println("dir b is created");
                }else{
                    System.out.println("dir b is failed");
                }
                Thread.sleep(1000);
                System.out.println("after 1s to create file");
                boolean isCreated = file.createNewFile();
                if(isCreated){
                    System.out.println("created b.txt successfully");
                }else{
                    System.out.println("created b.txt failed");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void show04(){
        File file = new File(
                new File("").getAbsolutePath(),
                "src/Demo01/File"
        );
        String[] list = file.list();
        for(String fileName:list){
            boolean isJava = fileName.endsWith(".java");
            System.out.println(isJava);
        }
    }
}
