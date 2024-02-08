package src.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Lab199 {
	public static void main(String[] args) {
		
		//Map<String,Integer> map1 = new HashMap<>();
		//Map<String,Integer> map1 = new LinkedHashMap<>();
		Map<String,Integer> map1 = new TreeMap<>();
		map1.put("id",1);
		map1.put("id2",2);
		map1.put("id3",3);
		map1.put("id4",4);
		System.out.println(map1);
		System.out.println(map1.isEmpty());
		System.out.println(map1.size());
		System.out.println(map1.containsKey("id2"));
		System.out.println(map1.containsValue(2));
		System.out.println(map1.get("id3"));
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		
		for(Map.Entry<String, Integer> item:map1.entrySet()) {
			System.out.println(item.getKey()+ "-->" + item.getValue());
		}
		
	}

}
