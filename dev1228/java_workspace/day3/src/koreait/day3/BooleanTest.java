package koreait.day3;

import java.util.Scanner;

public class BooleanTest {  //boolean 자료형을 연습합니다.
         //boolean 자료과 관련된 주요 연산은 관계연산(비교)입니다.
	     //->관계연산자 : > , < , >= , <= , == (같다) , ! =(같지 않다.)
	     //-> 관계 연산의 결과는 ? 맞다.(참, true) 또는 다르다.(거짓,false)
	
	public static void main(String[] args) {
		
		boolean result; //true 또는 false가 저장됩니다.
		
	    result = 10 > 5;
	    System.out.println("결과 : " + result);
	    
	    result = (10 != 10);
	    System.out.println("결과 : " + result);
	    
	    int data;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("비교할 값 입력 >>>");
	    data = sc.nextInt();
	    //boolean 출력은 %s
	    System.out.printf("비교 결과 data >= 50 : %s\n",data>=50);
	}

}
//응용 : 입력된 data값이 50보다 작으면 포인트를 50 적립해준다.
//            50보다 크거나 같으면 포인트 10을 적립해준다.
