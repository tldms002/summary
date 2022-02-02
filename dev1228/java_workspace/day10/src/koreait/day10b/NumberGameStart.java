package koreait.day10b;

import java.util.Scanner;

public class NumberGameStart {
//NumberGame 실행 - 게임 기록 저장
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5];		//게임기록 저장 최대 5번.
		int k=0;		//result 배열의 인덱스 변수
		
		
		System.out.println("숫자 맞추기 게임입니다.");
		System.out.print("게임을 시작하려면 너 휴먼의 이름을 쓰시오 -> ");
		String gamer = sc.nextLine();
		
		do {
			NumberGame ng = new NumberGame(gamer);		//게임기록을 저장하는 클래스
			int[] numbers = new int[10];		//사용자 시도 숫자값 저장 배열(최대 10개)
			
			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			int random = NumberGame.makeNumber(101, 200);	//숫자의 범위 101~200 -> 최소값,최대값 인자로 전달
			
			System.out.println("너 휴먼 맞춰보세요.(101~200) ");
			int i = 0;		//numbers 배열(-사용자 입력숫자 저장)의  인덱스
			do {
				System.out.print("생각한 숫자 입력 (기회 : " + (10 - i) + ") -> ");
				numbers[i] = sc.nextInt();
				
				if (random > numbers[i]) {
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (random < numbers[i]) {
					System.out.println("아닙니다. 더 작은 값입니다.");
				}else {   //random 과 numbers[i] 같을 때 -> 정답일때
					ng.setSuccess(true);
				}
				i++;

				if (i == 10) 	break;
				
			} while (!ng.isSuccess());
			
			//위의 반복을 어떻게 종료한것이냐?
			ng.setCount(i);
			if(ng.isSuccess()) {
				System.out.print("👍딩동댕~ 맞추셨습니다. 지금까지 시도한 숫자 ");
				for(int j=0;j<i;j++) {
					System.out.print(numbers[j]);
					System.out.print((j!=(i-1)? ",":" "));
				}
				
				System.out.println(".." + ng.getCount() + "만에 정답입니다." );
			}else {
				System.out.print("실패🤣. 모든기회를 다 사용했습니다.");
				System.out.println("정답은 " + random + " 입니다.");
			}
			
			result[k]=ng;
			k++;		//게임 기록 저장 result 배열 인덱스 증가
			if(k==5) break;
			System.out.print("게임을 계속 하시겠습니까? 계속하려면 0 입력하세요. -> ");
		}while(sc.nextInt()==0);
		//게임기록 result 배열 값 출력.
		System.out.println(":::::: 게임스코어 :::::");
		for(int j=0;j<k;j++)
			result[j].print();
		
		System.out.println("::::: Game End :::::");
		
	}

}