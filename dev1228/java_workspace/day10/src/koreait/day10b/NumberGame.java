package koreait.day10b;

import java.util.Random;

public class NumberGame {
		private String gamer;		//게임참가자 이름
		private int count; 			//시도횟수, 초기값 0
		private boolean isSuccess;	//맞추기 성공여부 , 초기값 false
		
		
		//커스텀 생성자 : gamer 초기값 설정
		public NumberGame(String gamer) {
				this.gamer=gamer;
		}
		
		//인스턴스 메소드
		public void print() {
			System.out.println("gamer : " + gamer + ", 시도횟수 : " + count + ",성공 : " + isSuccess);
		}
		
		//static - 클래스의 인스턴스 필드값을 사용하지 않는 경우.
		public static int makeNumber(int min, int max) {	//101~299 : 난수의 최소값,최대값 인자로 받고 난수 반환
			Random r = new Random();
			return r.nextInt(max-min+1)+min;    //r.nextInt(199)+101;  -> 0~198 + 101
		}// r.nextInt(100) : 0~99


		//getter 와 setter
		public String getGamer() {
			return gamer;
		}
		public void setGamer(String gamer) {
			this.gamer = gamer;
		}
		
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		public boolean isSuccess() {	//타입이 boolean 일때 isXXX (getXXX 아닙니다.)
			return isSuccess;
		}
		
		public void setSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
		
		
		
}
