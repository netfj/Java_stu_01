package ex30_����;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex3001 {
	public static void main(String[] args) {
		System.out.println("List ���ϵı�������");
		test01();
		test02();
	}
	
	
	public static void test01() {
		System.out.println("\n -- test01() : List ���ϵı�������");
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("!");
		
		System.out.println(list);
		
		System.out.println("\n # ����һ��for-each�� �˷���Ҫ֪����Ա�������͡�");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("\n ����������������顣 �˷�������Ҫ֪����Ա�������͡�");
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("\n # ���������������� �˷�������Ҫ֪����Ա�������͡�");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n # �����ģ�get()�� �˷�������Ҫ֪����Ա�������͡�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void test02() {
		System.out.println("\n -- test02() ����������ϰ����ϳ�Ա���ͱ��� -----");
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add("���Ǹ��ַ���");
		arrayList.add(1982374);
		
		System.out.println(arrayList);
		
		System.out.println(" # ʹ�� get() ����");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
	
}
