package koreait.day7;

import java.util.Scanner;

public class UpperLowerString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		String upper;
		String lower;
		char[] uppers = new char[20];
		char[] lowers = new char[20];
		System.out.print("문자열(영문자)을 입력하세요. ->");
		message = sc.nextLine();
		int k=0,j=0;
		
		for(int i=0;i<message.length();i++) {              
			char temp= message.charAt(i);
			if(temp>='A' && temp <='Z') {
				uppers[k]=temp;
				k++;
			}else if(temp>='a' && temp <='z') {	
				lowers[j]=temp;
				j++;		//다음 소문자 저장될 인덱스를 증가
			}	
		}
		
		upper = String.valueOf(uppers);
		lower = String.valueOf(lowers);
		
		System.out.print("\n[[결과]] ");
		System.out.println("대문자 문자열 ....." + upper);
		System.out.println("소문자 문자열 ....." + lower);

	}

}