package koreait.day8;

public class StringMethod1 {
	//charAt(), length() 메소드 지난 시간에 연습을 했습니다.
	
	public static void main(String[] args) {

		String msg = "hello, JAVA";
		String temp;
		
		//1. 대소문자 변환 메소드
		temp = msg.toUpperCase();		// "HELLO, JAVA" 변환된 문자열을 메모리에 저장. 주소값은 temp 저장합니다.
		System.out.println("대문자 변환 결과 : " + temp);
		System.out.println("원본 msg : " + msg);
		
		temp = msg.toLowerCase();
		System.out.println("소문자 변환 결과 : " + temp); 
		// "hello, java" 변환된 문자열을 메모리에 저장. 그 주소값은 temp 저장합니다.
		System.out.println("원본 msg : " + msg);
		
		msg = "  hi~  ";		//msg 변수값이 다른 문자열을 참조합니다.(새로운 문자열의 주소를 저장)
		System.out.println("원본 msg : " + msg);
		
		//예를 들면 아이디 입력할 때 포함된 공백은 제거할 수 있습니다.
		//2. 공백 제거
		temp = msg.trim();
		System.out.println("trim 결과 : " + temp);
		System.out.println("원본 msg : " + msg);
		
		//3. 특정문자열 포함 여부
		msg="koreait.2021@gmail.com";
		System.out.println("gmail 포함확인 -contains 메소드 : " + msg.contains("gmail"));	//참
		System.out.println("naver 포함확인 -contains 메소드 : " + msg.contains("naver"));	//거짓
		
		//4. 전체 문자열이 동일한지 비교 : 내용 비교.
		msg="momo";
		System.out.println("equals 비교 (Momo) : " + msg.equals("Momo"));
		System.out.println("equals 비교 (momo) : " + msg.equals("momo"));
		System.out.println("equals 비교 (momo ) : " + msg.equals("momo "));
		
		//5. 문자열 == 로 비교 결과 : 주소 비교입니다.
		String t1 = "test" , t2="java";
		String t3 = new String("test");		//String 객체를 생성하고 문자열은 "test"
		String t4 ="test";
		
		System.out.println("t1 == t2 : " + (t1==t2));		//각각 내용이 다른 문자열 비교->주소값이 다름.
		System.out.println("t1 == t3 : " + (t1==t3));		//t3은 new 연산으로 만들어진 객체를 참조
		System.out.println("t1 == t4 : " + (t1==t4));		//문자열 내용이 같으면 -> 한번만 메모리에 저장.
		
	}

}