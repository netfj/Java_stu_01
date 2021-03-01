package ex16_字符串方法;

/*
 * 字符器函数
 */


public class Ex16 {
	public static void main(String[] args) {
		Test01 t01 = new Test01();
		t01.str01();
	}
}

class Test01 {
	public void str01() {

		// 指定位置的字符
		System.out.println("\n--- 返回指定位置的字符 -----");
		String s = "0123456789ABCDE";
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(10));

		System.out.println("\n================");
		String h = "零一二三四五六七八九十";
		System.out.println(h);
		System.out.println(h.charAt(0));
		System.out.println(h.charAt(1));
		System.out.println(h.charAt(5));
		System.out.println(h.charAt(9));

		System.out.println("\n~~~~ 字符串比较：相同等于0 ~~~~~");
		String str1 = "Strings";
		String str2 = "Strings";
		String str3 = "Strings123";

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);

		result = str3.compareTo(str1);
		System.out.println(result);

		System.out.println("\n~ 字符串比较：比较两个字符串，不考虑大小写，相同等于0 ~~~~~");
		String str31 = "STRINGS";
		String str32 = "Strings";

		result = str31.compareToIgnoreCase(str32);
		System.out.println(result);

		System.out.println("\n-- 数组转换为字符串 -----------");
		char[] Str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b' };
		String Str2 = "";

		Str2 = Str2.copyValueOf(Str1);
		System.out.println("返回结果：" + Str2);

		Str2 = Str2.copyValueOf(Str1, 2, 6);
		System.out.println("返回结果：" + Str2);

		System.out.println("\n-- 测试字符串是否以指定的后缀结束 -----------");
		String str41 = "www.baidu.com";
		System.out.println(str41.endsWith("baidu"));
		System.out.println(str41.endsWith("com"));
		
		
		System.out.println("\n-- 测试字符串是否 内容 相同 -- (注意不能用==,那是十分复杂的,参看资料吧)");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("abc123"));
		
		
		System.out.println("\n-- 字符串 第1次出现的位置 -----------");
		System.out.println("12345abcde".indexOf("1"));
		System.out.println("12345abcde".indexOf("a"));

		System.out.println("\n-- 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。----");
		System.out.println("0a23a567a9".indexOf("a",0));
		System.out.println("0a23a567a9".indexOf("a",1));
		System.out.println("0a23a567a9".indexOf("a",5));
		System.out.println("0a23a567a9".indexOf("a",50));
		
		System.out.println("\n-- 最后一次出现处 --");
		System.out.println("0ab3ab67ab0".lastIndexOf("a"));
		System.out.println("0ab3ab67a90".lastIndexOf("ab"));
		
		
		System.out.println("\n-- 字符串 拆分 --");
		String str01 = "Welcome-to-Runoob";
		for (String re : str01.split("-")){
			System.out.println(re);
		}
		
		
		
		
		
		
	}
}