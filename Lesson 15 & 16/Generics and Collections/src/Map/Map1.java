package Map;

import java.util.HashMap;
import java.util.Map;
public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");

        for (Map.Entry map1 : map.entrySet()) {
            System.out.println(map1.getKey() + " - " + map1.getValue());
        }

    }
}
