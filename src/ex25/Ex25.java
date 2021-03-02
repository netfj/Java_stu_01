package ex25;

import java.io.IOException;

public class Ex25 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Cpu: " + rt.availableProcessors() + "processors");
		System.out.println("Mem: " + rt.freeMemory()/1024/1024 + "M");
		System.out.println("Mem Max: " + rt.maxMemory()/1024/1024 + "M");
		
//		rt.exec("notepad.exe");

		Process process =   rt.exec("notepad.exe");
		Thread.sleep(3000);
		process.destroy();
		
	}
	
}
