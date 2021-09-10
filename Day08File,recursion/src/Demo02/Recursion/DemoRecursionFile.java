package Demo02.Recursion;

import java.io.File;

public class DemoRecursionFile {
    public static void main(String ...args){
        File file = new File(new File("").getAbsolutePath(),"src");
        getAllFiles(file);
    }
    public static void getAllFiles(File dir){
        if(dir.exists()){
            File[] fileList = dir.listFiles();
            for(File file:fileList){
                if(file.isDirectory()){
                    getAllFiles(file);
                }else{
                    boolean result = file.getName().endsWith(".java");
                    if (result) {
                        System.out.println(file.getName());
                    }
                }
            }
        }else{
            System.out.println("dir is not existed");
            return;
        }
    }
}
