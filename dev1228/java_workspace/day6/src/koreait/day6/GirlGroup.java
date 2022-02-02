package koreait.day6;

public class GirlGroup {	//클래스 : 1) 데이터(필드) 저장      2) 데이터로 실행되는 동작(메소드) 정의. 
	//필드 : 데뷔년도, 영문팀이름, 한글팀이름, 멤버명수
	
	static final String GENDER ="female";		//상수
	int year;
	String team_eng;
	String team_kor;
	int numbers;
	
	//인스턴스 필드값 출력하는 메소드를 작성.
	void infoPrint() {
		System.out.println("팀이름 : " + team_eng + "(" + team_kor + ") , 데뷔년도 : " + year + ",멤버 수 : " + numbers);
	}
	
	//현재 년도 인자로 받아서  몇년차인지 계산하는 메소드  :  yearth
	int yearth(int now) {
		return (now-year+1);   //2022-2020+1 -> 3년차
	}



}
