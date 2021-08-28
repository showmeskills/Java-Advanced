package MapFor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01MapFor {
    public static void main(String ...args){
        methodOne();
    }
    public static void methodOne(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Terrance",199);
        map.put("Erick",200);
        map.put("Terry",180);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key +"="+value);
        }

        for(String key:set){
            Integer value = map.get(key);
            System.out.println(key + "=" +value);
        }

        for(String key: map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "=" +value);
        }
    }
}
