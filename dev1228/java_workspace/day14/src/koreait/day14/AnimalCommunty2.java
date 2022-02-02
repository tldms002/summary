package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunty2 {
	//작성자 : 김땡땡
	public static void main(String[] args) {
		// AnimalCoummunity 클래스 실행내용을 ArrayList 활용하여 구현합니다.
		
		ArrayList<Animal> animals = new ArrayList<>();
		//동물클래스는 고양이 객체, 강아지 객체, 토끼 객체... 등을 참조하도록 합니다.
		//분양가능한 동물객체를 생성해서 참조하기
		
		animals.add(new Puppy("브라우니", "Brown"));   //index 0 
		animals.add(new Cat());		//index 1
		animals.add(new Rabbit("바니바니", "White"));  //index 2
		animals.get(1).setColor("black");
		animals.get(1).setName("냥이");
		
		
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]");
		
		for(int i=0;i<animals.size();i++)		//list의 size()는 데이터갯수를 반환.
			System.out.println((i+1) + ":" + animals.get(i));
		
		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.");
		for(int i=0;i<animals.size();i++) {
			animals.get(i).sound();
		}
		Member sana = new Member("사나",15);
		Scanner sc = new Scanner(System.in);
		System.out.print("분야을 원하는 아이의 숫자를 선택해주세요. ->");
		int sel = sc.nextInt();
		
		System.out.print("선택하신" + animals.get(sel-1) + "는");
		if(sana.isAdopt(animals.get(sel-1))) {
			System.out.println("😄분양 가능합니다.");
		}else {
			System.out.println("😥아쉽지만 분양 하실수 없는 나이 입니다.");
		}

	}

}