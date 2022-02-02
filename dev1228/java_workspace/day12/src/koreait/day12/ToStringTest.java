package koreait.day12;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		member.id=20220100;
		member.name="이모모";
		//member.print();  //지금까지 만들었던 메소드 : 필드 출력용도입니다.
		
		System.out.println("toString 결과 :" + member.toString());
		//결과 : toString 결과 : koreait.day12.Member@15db9742 (패키지명.클래스명@객체구별값16진수)
		//toString 재정의한 후 결과 : toString 결과:id:20220100, name:이모모
		
	    System.out.println("toString 생략 :");

	}

}
