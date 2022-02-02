package koreait.day15;

import java.util.Scanner;

public class TryCatchTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		int sel;
		boolean run=true;
		while(run) {   //while(true) {
			try {
				for(int i=0;i<menu.length;i++)
					System.out.println("["+(i+1) +"]" + menu[i]);
				System.out.print("주문할 음식을 선택하세요 -> ");
				sel = Integer.parseInt(sc.nextLine());	//지금부터는 정수값 입력은 이렇게 하세요.
												//nextInt() 의 엔터문제가 해결됩니다.
				System.out.println("주문을 완료했습니다. 당신의 주문 음식은 " + menu[sel-1]+" 입니다.");
				run=false;  //break;
			}catch (NumberFormatException e1) {
				System.out.println("메뉴선택은 숫자로만 하세요.("+e1.getMessage() +")");
				continue;	//생략 가능
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("없는 메뉴 번호 입니다. (" + e2.getMessage() +")");
				continue;   //생략 가능
			}
						
		} //while end
		
	}  //반복문을 이용하여 catch 에 걸렸을 때 다시 입력받는 코딩을 해보세요.
	
//try~ catch 활용 : 예를 파일열기할때 없는 파일을 지정한다면 오류 발생. 자바 클래스들은 꼭 try~catch 를 하도록 합니다.

}