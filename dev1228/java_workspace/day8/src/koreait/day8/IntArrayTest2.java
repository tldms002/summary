package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest2 {
	// IntArrayTest 첫번째 예제는 day7 프로젝트에 있습니다.
	//int 값 저장하는 배열을 활용하는 연습입니다.-(1)
	public static void main(String[] args) {

		//배열의 크기는 20 -> 메모리 할당
		int[] scores = new int[20];
		
		//배열의 값은 난수 1~100 범위값 저장
		Random r1 = new Random();
		for(int i=0;i<scores.length;i++) {
			scores[i]=r1.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(scores));	//배열값 출력합니다.
		
		int cnt=0;		//카운트변수 : 조건에 맞는 경우 +1 증가합니다.
		
		//20개 배열의 값 중에서 70 이상의 값을 검색 - 인덱스와 값 출력
		for(int i=0;i<scores.length;i++) {
			//scores[0] ,scores[1],scores[2], scores[3],......scores[19]
			if(scores[i]>=70) {
				System.out.println("i=" + i + "\t점수 = " + scores[i]);
				cnt++;
			}	
		}
		
		//70이상인 값의 개수를 출력하려면???
		System.out.println("70이상 값의 갯수 : " + cnt);
	}

}