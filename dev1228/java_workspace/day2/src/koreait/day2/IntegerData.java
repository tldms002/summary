package koreait.day2;

public class IntegerData {

	public static void main(String[] args) {
// 정수 데이터 연습합니다.(byte : 1바이트에 저장하는 정수, short, integer, long)
// *Byte, Short, Integer, Long 클래스는 정수 데이터 형식을 다룹니다.(Wrapper 래퍼 클래스 종류)
		
	     System.out.println("::: 1바이트에 저장하는 Byte 정수 확인 :::");
	     System.out.println("Byte 정수의 크기 : " + Byte.BYTES); //메모리의 할당크기
	     System.out.println("Byte 정수의 최소값 : " + Byte.MIN_VALUE);
	     System.out.println("Byte 정수의 최대값 : " + Byte.MAX_VALUE);
	     //Byte 클래스의 필드(특정 값을 저장) : BYTES, MIN_VALUE, MAX_VALUE
	     //     필드는 클래스에 속하며
	     //  필드 중에서 변하지 않는값(상수)은 일반적으로 모두 대문자로 표기합니다.
	     
	     System.out.println("::: 2바이트에 저장하는 Short 정수 확인 :::");
	     System.out.println("Short 정수의 크기 : " + Short.BYTES);
	     System.out.println("Short 정수의 최소값 : " + Short.MIN_VALUE);
	     System.out.println("Short 정수의 최대값 : " + Short.MAX_VALUE);
	     
	     System.out.println("::: 4바이트에 저장하는 Integer 정수 확인 :::");
	     System.out.println("Integer 정수의 크기 : " + Integer.BYTES);
	     System.out.println("Integer 정수의 최소값 : " + Integer.MIN_VALUE);
	     System.out.println("Integer 정수의 최값 : " + Integer.MAX_VALUE);
	     
	     System.out.println("::: 8바이트에 저장하는 Long 정수 확인 :::");
	     System.out.println("Long 정수의 크기 : " + Long.BYTES);
	     System.out.println("Long 정수의 최소값 : " + Long.MIN_VALUE);
	     System.out.println("Long 정수의 최대값 : " + Long.MAX_VALUE);

	}
// 이동 : Alt + 위/아래 방향
}
