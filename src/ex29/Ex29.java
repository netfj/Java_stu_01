package ex29;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex29 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("123");
		list.add("123");
		list.add(456);
		list.add("abc");
		list.add("E01");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		
		System.out.println("-----------------");
		
		LinkedList lt = new LinkedList();
		lt.add(0,111);
		lt.add("abc");
		lt.add(2,"33abc");
		System.out.println(lt);
		
		lt.add(2,"Insert_2");
		System.out.println(lt);
		
		lt.addFirst("First");
		System.out.println(lt);
		System.out.println(lt.getFirst());
		System.out.println(lt.getLast());
		System.out.println(lt.get(0));
		
		//É¾³ı
		lt.remove(1);
		System.out.println(lt);
		
		lt.removeFirst();
		System.out.println(lt);
		
		lt.removeLast();
		System.out.println(lt);
		
		
		// ±éÀú
		ArrayList list2 = new ArrayList();
		list2.add("str1");
		list2.add("str2");
		list2.add("str3");
		list2.add("str4");
		System.out.println(list2);
		System.out.println(list2.iterator().hasNext());
		
		
		
		
		
		
		
	}
}
