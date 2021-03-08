package ex40;

/*
 * 引入其它类的方法
 */

import ex37_File.Ex37;


public class Ex40 {
	public static void main(String[] args) {
		System.out.println("==========");
		new Ex37().test00("test");
		Ex37 e = new Ex37();
		e.test00("###########");
	}
}
