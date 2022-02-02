package koreait.day6;

import java.util.Scanner;

public class StudentScore {
	//필드는 이것만 선언하세요.
	int num;
	String name;
	int korean;
	int english;
	int science;
	
	//추가로 키보드 입력을 받는 메소드를 만들면 좋겠습니다.
	void inputData() {
		Scanner sc = new Scanner(System.in);
		//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
		//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
		System.out.print("이름 ->  " );  		this.name = sc.nextLine();
		System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
		System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
		System.out.print("영어 ->  " );		this.english = sc.nextInt();
		System.out.print("과학 ->  " );		this.science = sc.nextInt();
		//sc.close();
	}
	
	void printScore() {
		System.out.println("번호 : " + num +"  이름 : " + name + "  국어 : " + korean
				+ "  영어 : " + english + "  과학 : " + science);
	}
	
	int sum() {
		return (korean+english+science);	//return 값 계산식 이용하세요.
	}
	
	double avg() {
		return (double)sum()/3;     //return 값 계산식에 sum() 메소드와 캐스팅을 활용하세요.
	}
	
	
}