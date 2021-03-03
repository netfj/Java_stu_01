package ex31;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ex31 {
//	public static void main(String[] args) {
//		HashSet set = new HashSet();
//		set.add("Tom0");
//		set.add("Tom1");
//		set.add("Tom2");
//		set.add("Tom3");
//		set.add("Tom2");
//		System.out.println(set);
//		
//		for (Object object : set) {
//			System.out.println(object);
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jack1");
		map.put("2", "Jack2");
		map.put("3", "Jack3");
		map.put("4", "Jack4");
		map.put("5", "Jack5");
		
		
		System.out.println(map);
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		System.out.println(map.get("3"));
		System.out.println(map.get("4"));
		System.out.println(map.get("5"));
		
		System.out.println("-- 1 ---------");
		System.out.println(map.keySet());		
		Set k= map.keySet();
		System.out.println(k);		
		for (Object key : k) {
			System.out.println(map.get(key));
		}
		
		System.out.println("== 2 ====");
		for (Object object : map.values()) {
			System.out.println(object);
		}
		
		System.out.println(map);
		System.out.println(map.entrySet());
		
		
		System.out.println("-- 3 -----------");
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry ent = (Map.Entry) it.next();
			System.out.print(ent.getKey());
			System.out.print(":");
			System.out.println(ent.getValue());
		}
		
		
		System.out.println("== properties ====");
		Properties p = new Properties();
		p.setProperty("Backgroup-color", "red");
		p.setProperty("Front-color", "write");
		System.out.println(p);
		
		Enumeration  names = p.propertyNames();
		System.out.println(names);
		while (names.hasMoreElements()) {
			String key = (String) names.nextElement();
			System.out.print(key);
			System.out.print(" : ");
			System.out.println(p.getProperty(key));
			
		}
		
		
		
	}
}
