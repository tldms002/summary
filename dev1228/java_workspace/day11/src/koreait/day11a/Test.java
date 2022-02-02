package koreait.day11a;

public class Test {

	public static void main(String[] args) {
		Triangle2 tri = new Triangle2("삼각", 12, 23);
		//System.out.println("count : " + tri.count);   
		//오류: protected 접근자 필드 count는  자식클래스만 사용할 수 있습니다.

	}

}