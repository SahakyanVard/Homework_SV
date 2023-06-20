package myMap;

import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.prefs.BackingStoreException;

public class Map {
    public static void main(String[] args) {
        /**Map <key, value>  is Interface
         * Hashtable: LinkedHashMap: HashMap: TreeMap
         **/
        HashMap<Integer,Worker> hashMap=new HashMap<>();
        hashMap.put(1,new Worker("Davit","Davtyan",25));
        hashMap.put(2,new Worker("Sedrak","Sedrakyan",42));
        hashMap.put(3,new Worker("Ani","Ananyan",54));
        hashMap.put(4,new Worker("Gohar","Gasparyan",28));
        hashMap.put(null,new Worker("Nane","Aramyan",37));
        System.out.println(hashMap);
        System.out.println(hashMap.get(null));
        System.out.println(hashMap.get(4));
        HashMap<Integer,Character> hm=new HashMap<>();
        hm.put(7,'&');
        hm.put(2,'@');
        hm.put(4,'$');
        System.out.println(hm.get(7));

        Set<Entry<Integer, Character>> entries = hm.entrySet();
        System.out.println(entries);
        System.out.println("-------");
        for (Entry<Integer,Character> e:entries) {
            System.out.println(e.getKey()+","+e.getValue());
        }
    }

}
