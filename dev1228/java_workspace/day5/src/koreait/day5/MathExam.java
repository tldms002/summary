package koreait.day5;

import java.util.Scanner;

public class MathExam {
	//작성자 : 어민규. (2022/01/04)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		int cal=0;
		
		System.out.println("[[수학 공부 도우미]]");
		
		while(cal<4) {
		System.out.println("1. 덧셈\t2.뺄셈\t3.곱셈\t4.종료");
		
		System.out.print("\n연산을 선택하세요 -> ");
		cal = sc.nextInt();
		
		if(cal==1) {
			System.out.print("✏️  값 1 을 입력하세요. -> ");
			n1 = sc.nextInt();
			System.out.print("✏️  값 2 을 입력하세요. -> ");
			n2 = sc.nextInt();
			
			System.out.printf("정답 : %d + %d = %d 입니다.",n1,n2,n1+n2);
		}	
		else if(cal==2) {
				System.out.print("✏️  값 1 을 입력하세요. -> ");
			n1 = sc.nextInt();
			System.out.print("✏️  값 2 을 입력하세요. -> ");
			n2 = sc.nextInt();
			
			System.out.printf("정답 : %d - %d = %d 입니다.",n1,n2,n1-n2);
		}	
		else if(cal==3) {
			System.out.print("✏️  값 1 을 입력하세요. -> ");
			n1 = sc.nextInt();
			System.out.print("✏️  값 2 을 입력하세요. -> ");
			n2 = sc.nextInt();
					
			System.out.printf("정답 : %d x %d = %d 입니다.",n1,n2,n1*n2);
		}	
		else if(cal==4) {
			System.out.println("프로그램을 종료 합니다.Bye,,👍👍");
		}
				
				
		}
		
	sc.close();	
	}

}