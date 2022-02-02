package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest3 {
	//int 값 저장하는 배열을 활용하는 연습입니다.-(2)
	public static void main(String[] args) {

		//배열의 크기는 20 -> 메모리 할당
		int[] scores = new int[20];
		
		//배열의 값은 난수 1~100 범위값 저장
		Random r1 = new Random(System.currentTimeMillis());  //난수 발생에 필요한 seed 값 설정
		
		for(int i=0;i<scores.length;i++) {
			scores[i]=r1.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(scores));	//배열값 출력합니다.
		//**) 값의 분포 개수를 90~100 , 80~89  , 70~79 , 70 미만 범위로 출력합니다.
		//카운트 변수 4개 초기화
		int cntA=0;		//90~100 
		int cntB=0;		//80~89 개수
		int cntC=0;		//70~79
		int cntD=0;		//70 미만 
		
		for(int i=0;i<scores.length;i++) {
			//scores[0] ,scores[1],scores[2], scores[3],......scores[19]
			int temp = scores[i];
			if(temp>=90 ) cntA++;
			else if(temp>=80) cntB++;
			else if(temp>=70) cntC++;
			else  cntD++;
			
		}
		
		//결과 출력
		System.out.println("점수 분포 요약--------");
		System.out.println("90~100  : " + cntA);
		System.out.println("80~89   : " + cntB);
		System.out.println("70~79   : " + cntC);
		System.out.println("70 미만 : " + cntD);
	}

}