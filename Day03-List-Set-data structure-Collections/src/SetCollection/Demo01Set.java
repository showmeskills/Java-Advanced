package SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Demo01Set {
    public static void main(String ...args){
        Set<String> setList = new HashSet<>();
        setList.add("ab");
        setList.add("cb");
        setList.add("ef");
        setList.add("gh");
        setList.add("ik");
        Iterator<String> it = setList.iterator();
        while(it.hasNext()){
            String element = it.next();
            System.out.println(element);
        }
        for(String element:setList){
            System.out.print(element);
        }
    }
}
