package koreait.day17;
import java.util.ArrayList;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		// 값의 비교 : 기본형 데이터 외에 객체 타입 비교를 인터페이스를 활용해 봅니다.
		
		List<Integer> list1= new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();		//문자열 String은 클래스
		
		list1.add(34);
		list1.add(67);
		list1.add(15);
		list1.add(56);
		list1.add(45);
		
		System.out.println("sort 이전 : " + list1);
		list1.sort(null);		//정렬은 값의 비교가 가능한 데이터 이어야 합니다.
		System.out.println("sort 이후 : " + list1);
		
		list2.add("사나");
		list2.add("모모");
		list2.add("나연");
		list2.add("쯔위");
		list2.add("다현");

		System.out.println("sort 이전 : " + list2);
		list2.sort(null);		//사전식 정렬(알파벳순서,가나다순서)
		System.out.println("sort 이후 : " + list2);
		
		List<Member> list3 = new ArrayList<>();
		
		list3.add(new Member("사나",23));			//23   15  29   33   12
		list3.add(new Member("가나",15));
		list3.add(new Member("나나",29));
		list3.add(new Member("미나",23));
		list3.add(new Member("쯔위",12));
		list3.add(new Member("다나",23));
		
		System.out.println("sort 이전 : " + list3);
	//	list3.sort(null);		//오류 : 비교가능한 객체가 아닙니다.
		list3.sort(new MemberAgeAscending());
		System.out.println("sort 이후(나이 오름차순) : " + list3);
		list3.sort(new MemberAgeDescending());
		System.out.println("sort 이후(나이 내림차순) : " + list3);
		list3.sort(new MemberNameAscending());
		System.out.println("sort 이후(이름 오름차순) : " + list3);
		list3.sort(new MemberNameDescending());
		System.out.println("sort 이후(이름 내림차순) : " + list3);
	}

}