package Demo01Expection;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {
    public static void main(String[] args)throws Exception {
        readFile("/a.txt");
    }
    public static void readFile(String fileName)throws FileNotFoundException, IOException {
        String path = "/a.txt";
        if(!fileName.equals(path)){
            throw new FileNotFoundException(fileName +"is not "+path);
        }
        if(!fileName.endsWith(".java")){
            throw new FileNotFoundException("file is not .java");
        }
        System.out.println("everything good");
    }
}
