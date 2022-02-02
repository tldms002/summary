package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();    //선택된 숫자 저장
		ArrayList<Integer> balls = new ArrayList<>();	 //공 45개 저장하는 리스트 ->44개 -> 43개...
		
		//1. balls리스트에 1~45 숫자를 추가한다.
		for(int i=0;i<45;i++) {		//인덱스 범위 : 0 ~ 44
			balls.add(i+1);
		}
		//확인: 출력해보기
		System.out.println("balls 리스트 값-----------------------------------");
		System.out.println(balls);
		System.out.println("---------------------------------------------------");
		//2 .  공(숫자)을 6개 뽑는 반복문.
		int k;
		Random r = new Random();
		for(int cnt=0;cnt<6;cnt++) {
			
			k=r.nextInt(45-cnt);   //경계값을 45(0~44),44(0~43),43(0~42),42(0~41),41(0~40),40(0~39) 
			
			int temp = balls.get(k);   lotto.add(temp);    //lotto.add(balls.get(k)); 
			
			balls.remove(k);
			System.out.println("뽑힌 숫자 : "+lotto);
			System.out.println("현재 공 값들 : "+balls);
		}	
		
		//2-0. balls 리스트에서 뽑을 인덱스를 난수 0~44 -> 0~43 -> 0~42 .... -> 0~39 범위에서 반복합니다.
		//2-1 . 난수인덱스에 해당하는 요소를 lotto 리스트에 추가합니다.
		//2-2 . 뽑힌 난수 인덱스의 요소는 삭제(제거) 합니다.
		
		//3. 최종 lotto 변수가 참조하는 값을 정렬하여 출력합니다.
		lotto.sort(null);
		System.out.println("오늘의 번호들 ..." + lotto);
	}
	//ArrayList의 중요 메소드 : size() , add() , get() , remove()
}