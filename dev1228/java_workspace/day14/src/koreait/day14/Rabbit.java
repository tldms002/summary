package koreait.day14;

public class Rabbit extends Animal{

	static final String TYPE = "토끼";
	
	public Rabbit() {
    }
    Rabbit(String name,String color) { 
    	super(name,color);
    }
	
	@Override
	public void sound() {
		//추상메소드 구현합니다.
        System.out.println("토끼는🐰🐰🐰 냠냠 먹을때만 소리 납니다.");
	}
	
	
	
}
