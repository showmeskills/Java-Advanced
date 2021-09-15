package Demo04.ObjectStream;

import java.io.*;

public class Demo01ObjectOutputStream {
    public static void main(String ...args) throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/object.txt");
        FileOutputStream fos = new FileOutputStream(pathname);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("小美女",18));
        oos.close();
    }
}
