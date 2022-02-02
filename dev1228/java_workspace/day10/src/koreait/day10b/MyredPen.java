package koreait.day10b;

import java.util.Random;
import java.util.Scanner;

public class MyredPen {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random r = new Random();
	    int[] x1= new int[10];
	    int[] x2= new int[10];
	    int[] no= new int[10];
	    
	    int n1,n2,ans;
	    int cnt=0;
		System.out.println("-----------------------------------");
	    System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
	    System.out.println("-----------------------------------");
	    System.out.println("시작합니다.");
	    for(int i=0;i<10;i++)  { //반복
	    	//이 위치 for문의 지역변수 선언해도 되는 변수는 ? n1,n2, ans
	    	n1 = r.nextInt(89)+11;    //nextInt(max-min+1)+min; 0~88
	    	n2 = r.nextInt(89)+11;    //nextInt(max-min+1)+min;
	    	System.out.print("문제"+i+". "+n1+"+"+n2+" = 답 입력 ->");
	    	ans = sc.nextInt(); 
	    	//if(ans ==n1+n2) cnt++;
	    	if(ans != n1+n2) {   //틀린문제를 cnt++
	    		 //3개 배열에 틀린문제 내용 저장하기.
	    		 x1[cnt]=n1;
	    	     x2[cnt]=n2;
	    	     no[cnt]=i+1;
	    	     cnt++;
	    	}//틀린갯수는 cnt, 맞은 갯수 10-cnt -> 문제 총10개 (cnt+10-cnt=10 문제갯수)
	    }
	    
	    sc.close();
	    System.out.println("------------------------------------");
	    //    System.out.println("채점 합니다. 맞은 개수 "+cnt+ "(" +(cnt*10)+" 점)");
	    System.out.println("채점 합니다. 맞을 개수 "+(10-cnt)+ " ( " + ((10-cnt)*10)+"점)");
	    //틀린문제에 대해 번호, 문제 정답 보여주기 입니다.
	    System.out.println("::::: 틀린문제 다시보기 ::::::");
	    for(int i=0;i<cnt;i++)
	    	System.out.println("문제"+no[i]+"."+x1[i]+"+x1[i]+"+x2[i]+"="+(x1[i]+x2[i]));
	    
	    
		 
	 }
	 
	 //발전방향 : x1,x2,no 배열 -> 2차원 배열(단순히 값만 저장) , 클래스(값저장 + 메소드)의 배열1
	 
	}
	
	
