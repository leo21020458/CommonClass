package hspedu.collection_.map;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","1.0");
        map.put("2","2.0");
        map.put("3","3.0");
        map.put("4","4.0");
        map.put("5","5.0");
        map.put("6","6.0");
        System.out.println(map);
        map.remove("1");
        System.out.println(map);
        Object o = map.get("2");
        System.out.println(o);
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("4"));
        map.clear();
        System.out.println(map);
    }
}
