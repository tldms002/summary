package koreait.day2;

public class ShapeTest {

	public static void main(String[] args) {
		// 작성자 : 이시은
		
		//변수
		//사각형
		int height = 23;   //선언하면서 초기값도 동시에 저장하는 방식
		int width=19;
		int area;
		area = height * width;
		System.out.println("[[사각형 도형의 넓이 구하기]]");
	    System.out.println("가로 : "+height+" cm ");
	    System.out.println("세로 : "+width+" cm");
	    System.out.println("넓이를 구했습니다. ->" + area + " ㎠ ");
	    
	    //원 : 결과 출력할떄 소수점 이하 3자리로 출력하세.
	    double radius=23;  //int 형 데이터가 double 형으로 자동변환.
	    double round;
	    double c_area;
	    c_area = radius*radius*3.14;
	    round = 2*radius*3.14;
	    System.out.println("\n[[원 도형의 넓이와 둘레 구하기]]");
	    System.out.printf("반지름 : %.1f cm\n", radius);  //%d 는 정수데이터 서식 ,radius는 double 이므로 %f
	    System.out.printf("둘레를 구했습니다. -> %.3f ㎠\n" , c_area);
	    System.out.printf("넓이를 구했습니다. -> %.3f ㎠\n" , round);

	}

}
