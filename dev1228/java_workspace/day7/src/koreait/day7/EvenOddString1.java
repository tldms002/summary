package koreait.day7;

import java.util.Scanner;

public class EvenOddString1 {

	public static void main(String[] args) {
		//입력문자열 과 결과문자열 모두 char[] 이용하여 처리합니다.  .... 별로 의미 없음.
		
		Scanner sc = new Scanner(System.in);
		String src_string;
		String even_string;
		String odd_string;
		char[] src;
		char[] even = new char[30];   
		char[] odd = new char[30];   
		
		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요. ->");
		src_string = sc.nextLine();
		
		src = src_string.toCharArray();
		for(int i=0;i<src.length;i++) {               //src_string.length()와 src.length는 같은 값입니다.
			if(i%2==0) even[i/2]=src[i];
			else odd[i/2]=src[i];
		}
		
		even_string = String.valueOf(even);
		odd_string = String.valueOf(odd);
		
		System.out.print("\n[[결과]] ");
		System.out.println("짝수 문자열 ....." + even_string);
		System.out.println("홀수 문자열 ....." + odd_string);
		
	}

}