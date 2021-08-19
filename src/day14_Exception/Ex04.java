package day14_Exception;

import java.io.IOException;

class A{
	public void test()  {
		ProcessBuilder b = new ProcessBuilder("calcl");
		
		try {
			b.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void disp() {
		test();
	}
}
public class Ex04 {
	public static void main(String[] args)  {

		A a = new A();
		a.disp();
	
	System.out.println("다음 문장들");
	
	
	
	
	}
}
