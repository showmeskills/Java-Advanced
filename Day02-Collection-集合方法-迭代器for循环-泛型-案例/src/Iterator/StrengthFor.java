package Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class StrengthFor {
    public static void main(String ...args){
        Collection<String> collection = new ArrayList<>();
        String[] strArr = new String[]{"Terry","Terrance","Erick"};
        for(String element : strArr){
            collection.add(element);
        }
        System.out.println(collection);

    }
}
