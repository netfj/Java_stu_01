package ex30_集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex3002 {
	public static void main(String[] args) {
//		test01();
//		test02();
		test03();
	}
	
	
	public static void test01() {
		System.out.println("-- test01(): Map 的遍历方法");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		
		System.out.println("\n# 方法一【推荐】无需知晓成员数据类型：先取得 key ，后遍历取值");
		for (String key: map.keySet()) {
			System.out.println("key= " + key + " | value= " + map.get(key));
		}
		
		System.out.println("\n# 方法二：迭代器");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("key= "+ entry.getKey() + " | value=" + entry.getValue());
		}
		
		System.out.println("\n# 方法三【大容量时推荐】：通过 Map.entrySet 遍历 key 和 value");
		for (Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " | value= " + entry.getValue());
		}
		
		System.out.println("\n# 方法四：通过Map.values()，只取值 value，不取值 key");
		for (String v : map.values()) {
			System.out.println("value= " + v);
		}
	}

	
	public static void test02() {
		
		System.out.println("== Object");
		Object[] obj = new Object[3];
		obj[0] = 1;
		obj[1] = "abc";
		obj[2] = true;
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		
		System.out.println("\n== ArrayList()");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("1a");
		arr1.add("2b");
		arr1.add("3c");
		System.out.println(arr1);
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		
		System.out.println("\n== Map()");
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "Tom");
		map.put("age", "33");
		map.put("man", "yes");
		System.out.println(map);
		System.out.println(map.get("name"));
		
		System.out.println("~~~~~~~~~~~~~``");
		Object[] obj2 = new Object[4];
		obj2[0]=obj;
		obj2[1]=arr;
		obj2[2]=arr1;
		obj2[3]=map;
		System.out.println(obj2);
		System.out.println(obj2[0]);
		System.out.println(obj2[1]);
		System.out.println(obj2[2]);
		System.out.println(obj2[3]);
		System.out.println("===");
		
		ArrayList <ArrayList> arrayList = new ArrayList<ArrayList>();
		arrayList.add(arr);
		arrayList.add(arr1);
		arrayList.add(arr1);
		System.out.println(arrayList);
		
		System.out.println((int) arrayList.get(0).get(0) + 109);
		System.out.println(arrayList.get(0).get(1));
		System.out.println(arrayList.get(0).get(2));
		
		int i =  (int) arrayList.get(0).get(0);
		
		String[] s1 = {"aaa","bbb","ccc"};
		System.out.println(s1);
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		
		int[] i1 = {11,22,33};
		System.out.println(i1);
		System.out.println(i1[0]);
		System.out.println(i1[1]);
		System.out.println(i1[2]);
		
		System.out.println("##############");
		ArrayList arr_2 = new ArrayList();
		arr_2.add(s1);
		arr_2.add(i1);
		System.out.println(arr_2);
		System.out.println(arr_2.get(0));
		
		System.out.println(arr_2.get(1));
		

		
	}

	public static void test03() {
		System.out.println("== s1 ==");
		String[] s1 = {"aaa","bbb","ccc"};
		System.out.println(s1);
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		
		System.out.println("== int2 ==");
		Integer[] int2 = {11,22,33};
		System.out.println(int2);
		System.out.println(int2[0]);
		System.out.println(int2[1]);
		System.out.println(int2[2]);
		
		System.out.println("== 二维数组 ==");
		String[][] w2 = new String[2][3];
		w2[0][0]="00";
		w2[0][1]="01";
		w2[0][2]="02";
		w2[1][0]="10";
		w2[1][1]="11";
		w2[1][2]="12";
		System.out.println(w2);
		System.out.println(w2.length);
		System.out.println(w2[0].length);
		
		System.out.println("== 二维数组演示2 ====");
		String[][] w3 = new String[2][];
		w3[0] = new String[2];
		w3[1] = new String[10];
		
		
	}
	
	
}
