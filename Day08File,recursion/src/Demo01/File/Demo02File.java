package Demo01.File;

import java.io.File;

public class Demo02File {
    public static void main(String ...args){
        show01();
        //show02();
    }
    public static void show01(){
        File f1 = new File("");
        String absolutePath = f1.getAbsolutePath();
        System.out.println("====>"+absolutePath);

        File f2 = new File(f1.getAbsolutePath());
        String f2Path = f2.getPath();
        System.out.println(f2Path);
        String path = new File(new File("").getAbsolutePath()).getPath();
        System.out.println(path);
    }
    public static void show02(){

        File f1 = new File("D:\\IdeaProjects\\day08-Advanced\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);
        File f2 = new File("D:\\IdeaProjects\\day08-Advanced\\sixstar");
        String name2 = f2.getName();
        System.out.println(name2);
    }
}
