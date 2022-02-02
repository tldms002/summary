package koreait.test;

import java.util.Random;

public class Mathproblem {
     
	private int n1;
	private int n2;
	private char op; // 설명 : 연산자+,-,*,/
	private boolean correct;
	
	
	public Mathproblem(char op) { 
		public void setCorrect(boolean Correct) {
			this.correct = correct;
		}
		
		public boolean Correct() {	//getter
			return correct;
		}
		//*여기까지
		public void MathProblem(char op) {
			this.op = op;
		}
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
		n1=r.nextInt();
		n2=r.nextInt();
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
}
