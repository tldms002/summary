package koreait.day11;

public class Shape {		//상위클래스 -> 상속받은 클래스는 Triangle, Square
	
	static final int MAX_WIDTH=100;		//변하지 않는값. 모든 객체가 같은 값 사용(static). -> 상수
	static final int MAX_HEIGHT = 200;
	
	private String shapeName;		//도형이름
	private int width;			//도형의 크기 중 너비
	private int height;			//          높이
	String etc="연습용";		//기타 정보 - 기본접근자 (패키자 같은 클래스에 사용할수 있습니다.)
	protected int count=12;		//자식클래스이면 어느 패키지 이던지 사용할 수 있다.
	
	//필드 초기화 생성자 : 필드값은 생성자로만 초기화합니다. (예시 : 요구조건은 초기화된 필드값은 변경 X)
	public Shape(String shapeName, int width, int height) {
		this.shapeName = shapeName;
		this.width = width;
		this.height = height;
	}
	
	//기본생성자를 사용할수 없는 클래스입니다.
	
	
	//getter 메소드만 허용하도록 합니다. (setter 허용 안합니다.)  :예시.요구조건은 초기화된 필드값은 변경 X
	public int getHeight() {
		return height;
	}
	
	public String getShapeName() {
		return shapeName;
	}
	
	public int getWidth() {
		return width;
	}
	
	//넓이(면적) 를 구해서 반환하는 메소드 : getArea 가로*세로
	public int getArea() {
		return width*height;
	}
	
}
