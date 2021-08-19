package day14_Exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x, y ,result;
		System.out.println("수 입력");
		try {
			x = scan.nextInt();
			y= scan.nextInt();
			result=x/y;
			System.out.println("x / y = " + result);
		}catch(Exception e) {
			e.printStackTrace();
//			System.out.println("0으로 못나눔");
		}finally {
			System.out.println("마지막 수행 내용");
			
		}

		
	
	
	
	
	
	
	
	
	
	}
}
