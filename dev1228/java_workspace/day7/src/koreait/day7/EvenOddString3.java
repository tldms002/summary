package koreait.day7;

import java.util.Scanner;

public class EvenOddString3 {
	//처리할 입력문자열은  char[]로 변환 , 결과문자열은 문자열 연결 연산자 이용하여 처리합니다. -> 별로  의미 없음.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String src_string;
		String even_string="";
		String odd_string="";
		char[] src;
		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요. ->");
		src_string = sc.nextLine();
		
		src = src_string.toCharArray();   
		for(int i=0;i<src.length;i++) {               
			if(i%2==0) even_string +=src[i];
			else odd_string +=src[i];
		}
		
		System.out.print("\n[[결과]] ");
		System.out.println("짝수 문자열 ....." + even_string);
		System.out.println("홀수 문자열 ....." + odd_string);
		
	}

}