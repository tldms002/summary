package koreait.day15;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류 입니다.(발생가능성을 고려해서 프로그래밍해야합니다.)
		//     -> 원인에 따라 다른이름 XXXXException 이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.
		//     -> Exception 이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됩니다. 
		//         따라서, Exception 을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
		
		//Exception 예시4 : 
		//Wrapper 클래스(Short,Integer,Double,Long...)에는 **문자열을 기본형타입으로*** 변환하는 메소드가 있습니다.
//		int b = Integer.parseInt("abc");   //Integer.parseInt("123"); -> 정상적으로 실행
				//정수로 변환할수 없는 문자열은  NumberFormatException 이 발생합니다.
//		System.out.println("b=" + b);
		
		double c = Double.parseDouble("123,456,000.123");// Double.parseDouble("1234.567"); -> 정상적으로 실행
		System.out.println("c=" +c);
		
		//Exception 예시3
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();			//키보드입력을 정수로 변환해서 변수에 저장합니다.
					//사용자 입력한 문자에 숫자외에 것이 있을때 InputMismatchException 이 발생합니다.
		
		//Exception 예시2
		int[] nums = new int[5];		//배열선언 : 요소 5개입니다.
		nums[5] =100;		//실행했을 때 ArrayIndexOutOfBoundsException 이 발생합니다.->인덱스0~4

		//Exception 예시1
		String message = null;
		
		char temp = message.charAt(0);     //message 문자열에서 첫번째(0) 글자 1개 가져옵니다. 
		//실행했을 때 NullPointerException 이 발생합니다. -> 이유 : message 참조객체 null이기 때문입니다.
		
		
		
	}

}