package koreait.day11;

public class Triangle extends Shape {
	
	public Triangle(String shapeName, int width,int height) {

		super(shapeName,width,height);
	}
	
	public void print() {  //getShapeName() : Shape 클래스의 필드가 private 접근자입니다.
		System.out.println("도형이름 : " + getShapeName() 
		+ ",너비 : " + getWidth() + ",높이 : " + getHeight());
		System.out.println("특별한 변수 테스트 -(Triangle 메소드에서 출력)-----------------?");
		System.out.println("기타정보 : " + etc);  //private 이 아닌 부모 필드는 직접 접근합니다.(super.etc) 
		System.out.println("count : " + count);
	}
	
	public int getArea() {   //***** 부모클래스가 정의한 같은 형식의 메소드를 수정(변경)합니다. : 오버라이드*****
		return (getHeight() * getWidth())/2;
	}
	
	public double getAreaDouble() {		//같은이름의 서로 다른(형 메소드가 있으면 오류입니다.
		return (double)(getHeight() * getWidth())/2;
	}
	
}
