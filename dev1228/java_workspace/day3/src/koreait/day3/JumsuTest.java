package koreait.day3;

import java.util.Scanner;

public class JumsuTest {

	public static void main(String[] args) {
		int korean,english,science,sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[성적 집계 : 평균과 총쩜 구하기]]");
	    System.out.println("성적 입력하세요.");
	    System.out.print("국어 ->");
	    korean = sc.nextInt(); //국어 정수값 입력
	    System.out.print("영어 ->");
	    english = sc.nextInt(); //영어 정수값 입력
	    System.out.print("과학 ->");
	    science = sc.nextInt(); //과학 정수값 입력
	    
	    System.out.println("\n>>처리되었습니다.");
	    sum = korean + english + science; //총점 계산식
	    System.out.printf("총점 : %d\n" , sum);
	    
	    System.out.printf("평균 : %d (%,2f) , 과목수 : %d\n", sum/3,(double)sum/3,3);
	    //두번쨰 수식은 강제 casting이 필요합니다.
	    //-> 나눗셈 결과 실수가 되려면 데이터 적어도 1개가 실수형식이여야 합니다.
	    
	    sc.close();
	    

	}

}
