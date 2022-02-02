package koreait.day10;

import java.util.Random;
import java.util.Scanner;

public class NumberGame1 {
//정세은  : day9 복습문제를 do ~ while
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[] triallst = new int[10];
		String trialstr;

		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너, 휴먼은 맞춰보세요. (101 ~ 299)");
		int numComputer = r.nextInt(199) + 101;
		int numHuman;
		int i = 0;

		do {
			System.out.print("생각한 숫자 입력 (기회 : " + (10 - i) + ") -> ");
			numHuman = sc.nextInt();
			if (numComputer > numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 큰 값입니다.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 작은 값입니다.");
			}

			if (i == 10) 	break;
			
		} while (numComputer != numHuman);
		
		if (i >= 10) {
			trialstr = TrialStr(triallst);
			System.out.println("주어진 기회를 다 쓰셨습니다. 다시 시작해주세요. 지금까지 시도한 값 : " + trialstr);
		}
		else {
			triallst[i] = numHuman;
			trialstr = TrialStr(triallst);
			System.out.println("딩동댕~ 맞추셨습니다. " + (i + 1) + "번만에 맞추셨습니다. 지금까지 시도한 값 : " + trialstr);
		}
	}
	
	static String TrialStr(int[] lst) {
		String trials = "";
		
		for (int l = 0; l < lst.length; l++) {
			if (l == lst.length - 1) {
				trials += lst[l];
				break;
			} else	trials += lst[l] + ", ";
		}
		
		return trials;
	}

}