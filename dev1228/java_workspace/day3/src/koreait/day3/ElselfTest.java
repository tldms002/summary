package koreait.day3;

import java.util.Scanner;

public class ElselfTest {

	public static void main(String[] args) {
		 int point;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("포인트를 입력하세요. -> ");
		 point = sc.nextInt();
		 
		 //if문 형식2 : if(조건관계식1) (...A...) //조건 관계식1이 참일때
		 //            else if(조건관계식2)
		 //           {...B...}      //조걵관계식1은 거짓, 조건관계식 2는 참일떄
		 //            else
		 //           {...C...}      //조건관계식1은 갸짓, 조건관계식 2는 거짓일떄
		 //
		 
		 //응용 : point가 150 이상이면 사과세트를, 100~149 이면 귤세트,
		 //         50~59 이면 과자세트를 , 0~49이면 5000원 상품권.
		 
		 System.out.println("설날 증정선물 : ");
		 
		 if(point >= 150)
			 System.out.println("사과 선물세트");
		 else if(point >=100)  //150보다 작은경우에 두번쨰 조건식 검사
			 System.out.println("귤 선물세트");      //100-149
		 else if(point >=50)   // 100보다 작은 경우 세번쨰 조건식 검사
			 System.out.println(" 과자 선물세트");
		 else // 50보다 작은 모든 값
			 System.out.println("모바일 5000원 상품권");
		 
		 sc.close();
	}

}
