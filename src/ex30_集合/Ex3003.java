package ex30_¼¯ºÏ;

import java.util.HashMap;

public class Ex3003 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Item01", 1);
		map.put("Item02", "abc");
		
		
		String[] aStrings = {"x","y"};
		System.out.println(aStrings);
		map.put("Item03",aStrings);
		map.put("Item04", true);
		
		System.out.println(map);
		
		System.out.println(map.get("Item01"));
		System.out.println(map.get("Item02"));
		
		String[] bString = (String[]) map.get("Item03");
		System.out.println(map.get("Item03"));
		System.out.println( bString[0]);
		System.out.println( bString[1]);
		
		System.out.println(map.get("Item04"));
		
		
		System.out.println("-------------");
		String[] s1 = null;
		
		
	}
}
