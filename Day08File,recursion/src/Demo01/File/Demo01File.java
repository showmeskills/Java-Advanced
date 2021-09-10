package Demo01.File;

import java.io.File;

public class Demo01File {
    public static void main(String[] args){
//        char pathSeparator = File.separatorChar;
//        System.out.println(pathSeparator);
//        char separator = File.separatorChar;
//        System.out.println(separator);

        //show01();
        //show02("/a.txt","/a.txt");
        show03();
    }
    public static void show01(){
        File f1= new File("/a.txt");
        System.out.println(f1);
        File f2 = new File("/Users/yantinglong/Library/Application Support/Code/User/workspaceStorage/76711ac4dacbbc1fff9ab02e70dc0b8b/redhat.java/jdt_ws/JavaDay29File类_8d98724b/bin/a.txt");
        System.out.println(f2);
    }
    public static void show02(String parent,String child){
        File f1 = new File(parent,child);
        System.out.println(f1);
    }
    public static void show03(){
        File parent = new File("/user");
        String child = "hello.java";
        File f1 = new File(parent,child);
        System.out.println(f1);
    }
}
