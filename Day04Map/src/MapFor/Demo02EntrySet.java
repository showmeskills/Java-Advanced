package MapFor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02EntrySet {
    public static void main(String ...args){
        mapEntrySet();
    }
    public static void mapEntrySet(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Terrance",199);
        map.put("Erick",200);
        map.put("Terry",180);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +"="+ value);
        }

        for(Map.Entry<String,Integer> entry : set){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +"="+ value);
        }
    }
}
