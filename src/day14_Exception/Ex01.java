package day14_Exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 예외상황 -
		 * 프로그램(개발자) 의도와 다르게 동작하는 것들
		 * 예외종류 -
		 * 강제예외 : throw
		 * 예외전가 : throws
		 * 예외처리 : try , catch
		 */
		
		Scanner scan = new Scanner(System.in);
		int x, y ,result;
		System.out.println("수 입력");
		x = scan.nextInt();
		y= scan.nextInt();
		try {
			result=x/y;
			System.out.println("x / y = " + result);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("0으로 못나눔");
			
		}

		
	
	
	
	
	
	
	
	
	
	
	}
}
