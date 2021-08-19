package day14_Exception;

class BBB {
	public int aaa;
}

class AAA extends BBB {
	public void catch1(Object a) {
		System.out.println(a);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		Object ss = "test";
		
		a.catch1(1);
		a.catch1("aaaa");
		a.catch1(1.1233);
		a.catch1('b');
		a.catch1(true);
		

	}
}
