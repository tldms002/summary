package koreait.day12;

import java.util.Random;

public class MathProblem {
	private int n1;
	private int n2;
	private char op; // 연산자 + , - ,x ,÷
	//추가*
	private boolean isCorrect;

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	public boolean isCorrect() {	//getter
		return isCorrect;
	}
	//*여기까지
	public MathProblem(char op) {
		this.op = op;
	}

	public void makeProb() { // 사칙연산 종류별로 적절한 난수 생성하기->문제를 만들어 줍니다.

		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11;
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11;
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11;
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11;
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1;
		n2=r.nextInt(max2-min2+1)+min2;
	}

	public int showAnswer() {		//n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result=0;
	
		switch (op) {
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		}
		
		return result;
	}
	
	
	
	public void print() {
		System.out.println(n1 + " " + op + " " + n2 + " = ");
	}
	
	@Override
	public String toString() {
		
		return n1 + " " + op + " " + n2 + " = ";
	}

	// getter 메소드만 작성합니다.
	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

}
