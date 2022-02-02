package koreait.day7;

import java.util.Scanner;

public class CypherTest {
	//연습 예제
	//내용 : 모모가 쯔위에게 메시지를 전달하는데 비밀 메시지로 암호화를 합니다.
	//	    모모와 쯔위는 암호를 푸는(해독,복호화) key 값으로 7 이라는 숫자를 정했습니다.
	//고대 암호 : 문자하나+key = ? 새로운문자  -> 이 방법으로 메시지를 암호화 해봅니다.
	
	public static void main(String[] args) {
		//원본메시지 : 키보드 입력
		//암호메시지 : cypherString 를 출력합니다.
		Scanner sc = new Scanner(System.in); 
		int key = 7;
		String message;
		String cypherString;	//암호메시지
		char[] temp;	//초기값선언과 배열크기 선언도 없이 할수 있습니다.
		
		System.out.print("보내고 싶은 원본 메시지 입력하세요. -> ");
		message = sc.nextLine();
		
		//**message를 temp로 변환하여 참조합니다.
		temp = message.toCharArray();    //리턴된 char[] 배열의 주소값을 temp저장합니다.
		
		//문자하나+key 결과값은 temp 배열에 저장합니다.
		for(int i=0;i<temp.length;i++) {
	//		temp[i]=temp[i]+key;
			temp[i]+=key;		//축약 연산자는 강제캐스팅 안하고 대입.
		}
		
		System.out.println(temp);
		
		//추가 기능 : temp 문자배열을 문자열로 변환 참조.
		cypherString = String.valueOf(temp);  //String.valueOf 메소드는 여러타입 데이터를 문자열로 변환.
		System.out.println("암호 메시지 : " + cypherString);   //p'sprl'qh}h
		
	}

}

