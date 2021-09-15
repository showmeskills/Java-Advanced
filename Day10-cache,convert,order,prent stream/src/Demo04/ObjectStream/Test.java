package Demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String ...args) throws IOException, InterruptedException, ClassNotFoundException {
        demo();
    }
    public static void demo() throws IOException, InterruptedException, ClassNotFoundException {
        String[] name = {"Terry","Erick","Terrance"};
        int[] age = {20,21,25};
        ArrayList<Person> personList = new ArrayList<>();
        for(int i=0; i < name.length;i++){
            personList.add(new Person(name[i],age[i]));
        }
        File writer = new File(new File("").getAbsolutePath(),"src/personlist.txt");
        File reader = new File(new File("").getAbsolutePath(),"src/personlist.txt");
        FileOutputStream fos = new FileOutputStream(writer);
        FileInputStream fis = new FileInputStream(reader);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ObjectInputStream ois = new ObjectInputStream(fis);

        oos.writeObject(personList);

        Thread.sleep(2000);
        Object person=ois.readObject();
        System.out.println(person);

        ArrayList<Person> list = (ArrayList<Person>) person;
        for(Person p : list){
            System.out.println(p);
        }
        ois.close();
        oos.close();
    }
}
