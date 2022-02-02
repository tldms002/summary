package koreait.day5;

import java.util.Scanner;

public class MathExamV3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sel = 0;
		char op = ' ';
		System.out.println("[[수학 공부 도우미]]");
		System.out.println("1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료\n");

		while (sel != 4) {
			int n1, n2, result = 0;
			System.out.print("연산을 선택하세요. -> ");
			sel = sc.nextInt();

			if(sel==4) {
				System.out.println("프로그램을 종료 합니다.Bye,,👍👍");
				break;
			}else if(sel <1 || sel >3) {
				System.out.println("✔잘못된 연산값입니다.다시 선택하세요.");
				continue;
			}
			
			System.out.print("✏  값 1 을 입력하세요. ->  ");
			n1 = sc.nextInt();
			System.out.print("✏  값 2 을 입력하세요. ->  ");
			n2 = sc.nextInt();

			switch (sel) {
				case 1:
					op = '+';
					result = n1 + n2;
					break;
				case 2:
					op = '-';
					result = n1 - n2;
					break;
				case 3:
					op = '*';
					result = n1 * n2;
					break;
			}
			
			System.out.print("정답  : " + n1 + op + n2 + "=" + result + " 입니다.\n\n");

		}

		sc.close();

	}

}