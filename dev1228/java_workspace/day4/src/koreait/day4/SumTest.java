package koreait.day4;

public class SumTest {

	public static void main(String[] args) {	//for문을 이용하여 1부터 100까지 합계 
		
		int sum=0;	// 반드시 초기화가 필요합니다.
		
		for(int i=1;i<=100;i++) {
				sum+=i;
				System.out.println("i=" + i +", sum=" + sum);		//중간결과값
		}		
			//	sum=sum+i;   //i=i+3;   i+=3;
		
		System.out.println("sum =" + sum);		//최종값
		
		
	}

}