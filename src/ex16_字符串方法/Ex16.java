package ex16_�ַ�������;

/*
 * �ַ�������
 */


public class Ex16 {
	public static void main(String[] args) {
		Test01 t01 = new Test01();
		t01.str01();
	}
}

class Test01 {
	public void str01() {

		// ָ��λ�õ��ַ�
		System.out.println("\n--- ����ָ��λ�õ��ַ� -----");
		String s = "0123456789ABCDE";
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(10));

		System.out.println("\n================");
		String h = "��һ�����������߰˾�ʮ";
		System.out.println(h);
		System.out.println(h.charAt(0));
		System.out.println(h.charAt(1));
		System.out.println(h.charAt(5));
		System.out.println(h.charAt(9));

		System.out.println("\n~~~~ �ַ����Ƚϣ���ͬ����0 ~~~~~");
		String str1 = "Strings";
		String str2 = "Strings";
		String str3 = "Strings123";

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);

		result = str3.compareTo(str1);
		System.out.println(result);

		System.out.println("\n~ �ַ����Ƚϣ��Ƚ������ַ����������Ǵ�Сд����ͬ����0 ~~~~~");
		String str31 = "STRINGS";
		String str32 = "Strings";

		result = str31.compareToIgnoreCase(str32);
		System.out.println(result);

		System.out.println("\n-- ����ת��Ϊ�ַ��� -----------");
		char[] Str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b' };
		String Str2 = "";

		Str2 = Str2.copyValueOf(Str1);
		System.out.println("���ؽ����" + Str2);

		Str2 = Str2.copyValueOf(Str1, 2, 6);
		System.out.println("���ؽ����" + Str2);

		System.out.println("\n-- �����ַ����Ƿ���ָ���ĺ�׺���� -----------");
		String str41 = "www.baidu.com";
		System.out.println(str41.endsWith("baidu"));
		System.out.println(str41.endsWith("com"));
		
		
		System.out.println("\n-- �����ַ����Ƿ� ���� ��ͬ -- (ע�ⲻ����==,����ʮ�ָ��ӵ�,�ο����ϰ�)");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("abc123"));
		
		
		System.out.println("\n-- �ַ��� ��1�γ��ֵ�λ�� -----------");
		System.out.println("12345abcde".indexOf("1"));
		System.out.println("12345abcde".indexOf("a"));

		System.out.println("\n-- �����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ������----");
		System.out.println("0a23a567a9".indexOf("a",0));
		System.out.println("0a23a567a9".indexOf("a",1));
		System.out.println("0a23a567a9".indexOf("a",5));
		System.out.println("0a23a567a9".indexOf("a",50));
		
		System.out.println("\n-- ���һ�γ��ִ� --");
		System.out.println("0ab3ab67ab0".lastIndexOf("a"));
		System.out.println("0ab3ab67a90".lastIndexOf("ab"));
		
		
		System.out.println("\n-- �ַ��� ��� --");
		String str01 = "Welcome-to-Runoob";
		for (String re : str01.split("-")){
			System.out.println(re);
		}
		
		
		
		
		
		
	}
}