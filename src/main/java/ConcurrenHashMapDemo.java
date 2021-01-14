import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> integerStringConcurrentHashMap = new ConcurrentHashMap<>();
        integerStringConcurrentHashMap.put(100,"P");
        integerStringConcurrentHashMap.put(101,"K");
        integerStringConcurrentHashMap.put(102,"P");
        integerStringConcurrentHashMap.putIfAbsent(101,"P");
        integerStringConcurrentHashMap.remove(101);
        System.out.println(integerStringConcurrentHashMap.get(100));

        System.out.println(integerStringConcurrentHashMap);

        Iterator<Map.Entry<Integer,String>> itr= integerStringConcurrentHashMap.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
}
