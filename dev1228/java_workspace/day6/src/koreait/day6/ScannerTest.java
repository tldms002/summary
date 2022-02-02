package koreait.day6;

import java.util.Scanner;

public class ScannerTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int a = sc.nextInt();
		System.out.println(a);
//		sc.close();			//1)	
		testA();
	}

	static void testA() {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);	
//1)에서 close() 메소드로 해제된 표준 입력 System.in을 다시 사용할 수 없습니다.전역변수로 선언해서 사용합니다.

		int c = sc.nextInt();
		System.out.println(c);
//		sc.close();
	}
	
	@Override
	protected void finalize() throws Throwable {//객체가 소멸(제거)될 때 실행하는 메소드
		sc.close();
	}
}