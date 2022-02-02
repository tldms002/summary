package koreait.day7;

public class EvenOddNumber {

	public static void main(String[] args) {
		//나머지 연산자 : %   , 짝수는 2로 나눈 나머지 0   홀수는 2로 나눈 나머지 1
		int e1 = 34,  o1 = 17;
		
		if(e1%2==0) System.out.println("e1 =34 . 짝수입니다. ");
		if(e1%2==1) System.out.println("e1 =34 . 홀수입니다. ");
		
		if(o1%2==0) System.out.println("o1 =17 . 짝수입니다. ");
		if(o1%2==1) System.out.println("o1 =17 . 홀수입니다. ");
		
		
	}

}