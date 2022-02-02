package koreait.day7;

import java.util.Scanner;

public class DecipherTest {

	public static void main(String[] args) {
//내용 : 쯔위가 모모가 보낸 암호 메시지를 받고 해독해서 확인합니다.key 약속된 7값을 알고 있습니다.
		Scanner sc = new Scanner(System.in);
		int key =7;
		String cypherString;
		String message="";	
		char[] temp;		//char[] 배열 사용안하고 하는 방법 있습니다.
		
		System.out.print("전달받은 암호 메시지 입력하세요. -> ");
		cypherString = sc.nextLine();

		temp = cypherString.toCharArray();
		for(int i=0;i<temp.length;i++)
			temp[i]-=key;			//cyperString.charAt(i) + key
									//   message += (cyperString.charAt(i) + key)
									//    "" + 'i' + ' ' + 'l'  
				
		message = String.valueOf(temp);
		System.out.println("모모의 메시지 : " + message);
		
	}

	//이 예제의 결론 :   String  을   char[] 배열로 변환        -   문자열.toCharArray()
	//				 char[] 배열을   String 으로 변환       -   String.valueOf(문자배열)
	
}