package Demo04.ObjectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String ...args) throws IOException, ClassNotFoundException {
        File file = new File(new File("").getAbsolutePath(),"src/object.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
        Person person = (Person)obj;
        System.out.println(person.getAge()+person.getName());
    }
}
