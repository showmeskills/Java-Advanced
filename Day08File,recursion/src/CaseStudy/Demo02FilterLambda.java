package CaseStudy;

import java.io.File;
import java.io.FileFilter;

public class Demo02FilterLambda {
    public static void main(String ...args){
        File dir = new File(new File("").getAbsolutePath(),"src");
        getAllFile(dir);
    }
    public static void getAllFile(File dir){
        File[] fileList = dir.listFiles((File pathname)->{
            if(pathname.isDirectory()){
                return true;
            }
            return pathname.getName().toLowerCase().endsWith(".java");
        });
        for(File file:fileList){
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                boolean result = file.getName().endsWith(".java");
                if(result){
                    System.out.println(file.getName());
                }
            }
        }
    }
}
