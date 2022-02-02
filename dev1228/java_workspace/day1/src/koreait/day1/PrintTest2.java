package koreait.day1;        //koreait.day1은 패키지 이름 

public class PrintTest2 {     //PrintTest는 클래스 이름, 시작은 반드시 대문자로.
//설명 : 주석(comment)	

	public static void main(String[] args) {
		// day2 : 출력 메소드 종류
		
		System.out.print("Hi! Java~~ 안녕하니 자바야!");     //줄바꿈 없음.
		//syso 입력후 Ctrl + 스페이스바로 자동완성 하세요.
	    System.out.print("---------\t-------------\n");  // \n은 줄바꿈 문자, \t는 탭문자
	    System.out.printf("%s\n","End!");       //printf : format 적용(%기호 사용,s는 문자열)
	    System.out.printf("%-10s\n","End!");    //printf : format(서식) 적용
	    System.out.printf("%-10s %5s\n", "End!","**");   //printf : format 적용
	    
	    //데이텨 형식 : 문자열(문장), " " 기호 안에 작성, string

	}

}
//1. 클래스 : 대문자로 시작한다. 특정기능을 갖고 있다.-> 메소드로 제공한다. 예를 들면 System. String..
//2. 메소드 : 소문자로 시작한다. 예를 들면 println
//                      () 기호가 바로 뒤에 나온다.() 안에는 실행에 필요한 추가적인 데이터가 작성되기도 한댜.
// 형식은 클래스.메소드() 와 같습니다.
// 3. System.out.println 은 특별한 경우. 문법적인 설명은 이후 진도에서 자세히 설명하겠습니다.
//                  println 메소드 out (출력)에 속해 있습니다.