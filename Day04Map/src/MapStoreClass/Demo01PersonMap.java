package MapStoreClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01PersonMap {
    public static void main (String ...args){
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("queen",18),"UK");
        map.put(new Person("king",20),"US");
        map.put(new Person("China",50),"CN");
        map.put(new Person("Japan",21),"Jp");

        Set<Map.Entry<Person,String>> set = map.entrySet();
        Iterator<Map.Entry<Person,String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Person,String> entry = it.next();
            Person person = entry.getKey();
            String country = entry.getValue();
            System.out.println(person + "=" + country);
        }


        for(Map.Entry<Person,String> entry : map.entrySet()){
            Person person = entry.getKey();
            String country = entry.getValue();
            System.out.println(person + "=" + country);
        }
        practise();
    }
    public static void practise(){
        HashMap<String,Person> hMap = new HashMap<>();
        hMap.put("UK",new Person("queen",18));
        hMap.put("US",new Person("King",20));
        hMap.put("CN",new Person("China",18));
        hMap.put("Jp",new Person("Japan",18));

        Set<Map.Entry<String,Person>> set = hMap.entrySet();
        Iterator<Map.Entry<String,Person>> it = set.iterator();
        for(Map.Entry<String,Person> entry:set){
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
