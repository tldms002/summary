package koreait.day12;

public class Member {
	int id;
	String name;
	
	public Member() {
	}
	
	public Member(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
	void print() {		//이제부터는 이 메소드 대신 toString() 재정의해서 사용합니다.
		System.out.println("id : " + id + ",name : " + name);
		
	}
	
	@Override
	public String toString() {   //최상위 클래스 Object 의 toString()메소드를 재정의.
//		return "Member [id=" + id + ", name=" + name + "]";
		return "id:" + id + ", name:" + name ;
	}

	
}