package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String ...args){
        Collection<String> list = new ArrayList<>();
        list.add("Terry");
        list.add("Terrance");
        list.add("Erick");
        list.add("ShaBi");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String element = it.next();
            System.out.println(element);
        }
    }
}
