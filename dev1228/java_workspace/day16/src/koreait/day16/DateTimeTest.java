package koreait.day16;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
	
	//날짜와 시간형식을 다루는 자바클래스를 연습합니다.
	//1)java.util.Date 클래스 2)java.util,Calendar 클래스
	//3) java 8버전 java.time.LocalData(날짜), LocalTime(시간) , LocalDataTime(날짜와 시간) 클래스 
    public static void main(String[] args) {
		
       LocalData currentData = LocalData.now();
       System.out.print("날짜 확인 : " + currentData);
       
       LocalTime currentTime = LocalTime.now();
       System.out.println("시간 확인 : " + currentTime);
       
       LocalDataTime current = LocalDataTime.now();
       System.out.println("날짜와 시간 확인 : " + current);
       
       //임의 날짜 또는 시간으로 객체를 생성합니다.
       LocalData mybirth = LocalData.of(1999,1,20);
       System.out.println("내 생일 날짜 확인 :" + mybirth);
       
       LocalData mybirth_time = LocalTime.of(17 , 20);
       System.out.println("내 탄생 시간 확인 : " + mybirth_time);
       
       //현재낳짜로부터 5일 후를 계산
       int day=5;
       System.out.println("오늘 날짜+ " + day + "일은 " + currentData.plusDays(5));
       
       //내가 테어난지 몇일이 지났는지.(날짜 사이의 간격 계산)
       Period between = Period.between(getYears() + "년");
       System.out.println("내가 태어난지" + between.getYears() + "년");
       System.out.println("내가 태어난지" + between.getMonths() "달(개)");
       System.out.println("내가 태어난지" + between.getDays() + "일");
       
       long Test = ChronoUnit.DAYS.between(mybirth,currentDay);
       System.out.print("test = " + test);
       
       test = ChronoUnit.YEARS.between(mybirth,currentDays);
       System.out.println("test = " + test);
       
       //Duration 클래스 : 시간간격 계산할때 
       

	}

}
