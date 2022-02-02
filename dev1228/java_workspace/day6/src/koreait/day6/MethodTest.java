package koreait.day6;

public class MethodTest {
	//클래스(또는 객체) 의 구성 : 필드, 메소드
	//-> 메소드를 이해하는 연습입니다. 단, 같은 클래스에서 사용되는 경우입니다.
	
	//static : 정적인 (고정된) ,static 성질끼리 서로 사용 가능.
	public static void main(String[] args) {	
		System.out.println();    // System은 클래스 , out은 (객체형)필드, println은 out의 메소드
		
		//메소드 실행 - 메소드 이름 호출합니다.
		testMethod1();   //main 메소드의 특징 : static , 실행할수 있는메소드는 static 만 가능합니다.
		testMethod1();   //-> static 은 static 성질을 갖는 요소들만 사용합니다.
		
//		testMethod2(123, 123);	//오류-> 두번째 인자의 형식이 틀림.
		testMethod2(123, "twice");
		testMethod2(456, "momo");
		testMethod2(9876, "쯔위");
		testMethod22(1.34,23,4.56);		//3개의 인자값을 더해서 출력하는 메소드입니다.
		testMethod22(23, 45, 1.8987);		//인자값 전달할때 자동변환 됩니다.
		int result = testMethod3();				//반환값(리턴값)이 있는 메소드는 변수를 사용하여 저장 또는 출력을 합니다.
		System.out.println(result);
		System.out.println("testMethod3 return = " + testMethod3());
		System.out.println("testMethod3 return 더하기 = " + (testMethod3()+11));	//리턴값 연산
		System.out.println(testMethod33());			//"수요일" 출력
		
		System.out.println("testMehod4 return = " + testMethod4(34, 67));
		//testMethod44 를 실행해서 리턴값을 변수 d_result 에 저장하고 출력하세요.
		double d_result = testMethod44(3.14, 8);
		System.out.println(d_result);
		
		System.out.println("\n요일 출력");
		System.out.println(dayOfWeek(4));		//반환받은 문자열의 참조값으로 내용(문자열)을 출력.
		
	}// main end
	
	//1.인자(args), 반환값이 없는(void) 메소드 입니다.
	static void testMethod1() {		//메소드 정의 연습1		//메소드와 함수는 성격이 유사합니다.
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}

	//2.인자 있고, 반환값이 없는 메소드 입니다.
//인자 개수는 제한이 없습니다. 변수 선언과 같은 방식으로 , 로 구분합니다.인자는 메소드 실행에 필요한 데이터입니다.
	static void testMethod2(int a, String name) {	//인자 2개
		//메소드를 실행할 때는 정수,문자열 순서에 맞게 값을 지정하고
		//그 값을 a는 정수값, name은 문자열의 참조값을 저장합니다.
		System.out.println("정수값="+a);
		System.out.println("name=" + name);
	}
	
	//연습 예제
	static void testMethod22(double a, int b, double c) {
		System.out.println("인자값 합계 =" +(a+b+c));			//실수값+정수값=실수값
	}
	
	//3.인자 없고, 반환값이 있는(***반환되는 데이터의 형식***) 메소드 입니다.
	static int testMethod3() {
		return 145;		//반환값이 있는 형식에서는 꼭 있어야하는 명령문 -> return
	}
	
	//연습 - "수요일"을 리턴하는 메소드
	static String testMethod33() {
		return "수요일";
	}
	
	//4.인자 있고, 반환값이 있는 메소드
	static int testMethod4(int a,int b) {
		return (a+b);
	}
	
	static double testMethod44(double a,int b) {
		double result=a+b;
		return result;
	}
	
	
	//정수값을 전달 받습니다.1이면 "월요일", 2이면 "화요일", 3이면 "수요일".....   , 7이면 "일요일"을 
	// 1~7 이외의 값은 "unknown" 리턴하는 메소드 -> 메소드 이름은 dayOfWeek
	// switch문, 리턴값은 문자열 변수 사용.
	static String dayOfWeek(int a) {
		String result="unknown";
		switch (a) {
		case 1:
			result="월요일"; 	break;
		case 2:
			result="화요일"; 	break;
		case 3:
			result="수요일"; 	break;
		case 4:
			result="목요일"; 	break;
		case 5:
			result="금요일"; 	break;
		case 6:
			result="토요일"; 	break;
		case 7:
			result="일요일"; 	break;

//		default:
//			result="unknown";
//			break;
		}
		
		return result;			//result 문자열의 참조값(메모리의 주소)를 반환합니다.
	}
	
	
}



