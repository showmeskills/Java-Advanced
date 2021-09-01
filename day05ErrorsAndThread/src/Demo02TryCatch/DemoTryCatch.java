package Demo02TryCatch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTryCatch {
    public static void main(String[] args) {
        String path = "/c.txt";
        readFile(path);
    }
    public static void readFile(String path){
        try{
            String localpath = "/a.txt";
            if(!path.equals(localpath))
                throw new FileNotFoundException(path +"is not equal to"+ localpath) ;
            if(!path.endsWith(".java"))
                throw new FileNotFoundException(path +"is not a java");
        }catch(IOException e){
            System.out.println(e.getMessage());// /c.txt is not equal to/a.txt
            System.out.println(e.toString());// java.io.FileNotFoundException: /c.txtis not equal to/a.txt
        }finally{
            System.out.println("system is over");
        }
    }
}
