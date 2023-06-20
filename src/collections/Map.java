package collections;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.prefs.BackingStoreException;

public class Map {
    public static void main(String[] args) {
        /**Map <key, value>  is Interface
         * Hashtable: LinkedHashMap: HashMap: TreeMap
        **/
//        HashMap<String,Worker> hashMap=new HashMap<>();
//        hashMap.put("mankavarj",new Worker("D","D",25));
//        hashMap.put("varord",new Worker("S","SS",42));
//        hashMap.put("varord",new Worker("S777","SS",42));
//        hashMap.put("mankavarj_1",new Worker("D","D",25));
//        hashMap.put(null,new Worker("Dhhhhh","Dkkkk",258));
//        System.out.println(hashMap);
//        System.out.println(hashMap.get(null));
//        System.out.println(hashMap.get("varord"));
        HashMap<Integer,Character> hm=new HashMap<>();
        hm.put(7,'&');
        hm.put(2,'@');
        hm.put(4,'$');
        System.out.println(hm.get(7));

        Set<Entry<Integer, Character>> entries = hm.entrySet();
        System.out.println(entries);
//        System.out.println("-------");
//        for (Entry<Integer,Character> e:entries) {
//            System.out.println(e.getKey()+","+e.getValue());
//        }

        
    }

}
