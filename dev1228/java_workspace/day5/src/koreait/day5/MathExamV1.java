package koreait.day5;

import java.util.Scanner;

public class MathExamV1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sel=0;
		char op=' ';
		System.out.println("[[수학 공부 도우미]]");
		System.out.println("1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료\n");
		//잘못된 선택 출력 안합니다.ver1.0
		while(true) {
			int n1,n2,result=0;
			System.out.print("연산을 선택하세요. -> ");
			sel = sc.nextInt();
			
			if(sel==4) {
				System.out.println("프로그램을 종료 합니다.Bye,,👍👍");
				break;
			}
			
			System.out.print("✏  값 1 을 입력하세요. ->  ");
			n1=sc.nextInt();
			System.out.print("✏  값 2 을 입력하세요. ->  ");
			n2=sc.nextInt();
			
			if(sel==1) {
				op='+'; result=n1+n2; 
			}
			if(sel==2) {
				op='-'; result=n1-n2; 
			}
			if(sel==3) {
				op='*'; result=n1*n2; 
			}
			
			System.out.print("정답  : "+n1 +op+n2+"=" + result +" 입니다.\n\n");
			
		}
		
		sc.close();
		
	}

}