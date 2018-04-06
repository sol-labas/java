
package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author angela
 */
public class HashMapExaple {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String> ();
        
        hm.put(111, "Jonh");
        hm.put(112, "Mike");
        hm.put(113, "Alex");
        hm.put(123, "Jordan");
        
        String var = hm.get(112); 
        System.out.println("Value at key 112 " + var);
        
        
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            Map.Entry mapEntry= (Map.Entry) itr.next();
            System.out.println("Key: " + mapEntry.getKey() + "\tValue" + mapEntry.getValue());
        }
        
    }
}
