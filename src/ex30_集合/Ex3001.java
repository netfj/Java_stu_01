package ex30_集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex3001 {
	public static void main(String[] args) {
		System.out.println("List 集合的遍历方法");
		test01();
		test02();
	}
	
	
	public static void test01() {
		System.out.println("\n -- test01() : List 集合的遍历方法");
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("!");
		
		System.out.println(list);
		
		System.out.println("\n # 方法一：for-each。 此方法要知道成员数据类型。");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("\n 方法二：链表变数组。 此方法不需要知道成员数据类型。");
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("\n # 方法三：迭代器。 此方法不需要知道成员数据类型。");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n # 方法四：get()。 此方法不需要知道成员数据类型。");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void test02() {
		System.out.println("\n -- test02() 遍历方法练习：混合成员类型遍历 -----");
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add("这是个字符串");
		arrayList.add(1982374);
		
		System.out.println(arrayList);
		
		System.out.println(" # 使用 get() 方法");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
	
}
