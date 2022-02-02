package koreait.day14;

public class Cat extends Animal{

	static final String TYPE = "고양이";
	
	public Cat() {
    }
   
	public Cat(String name,String color) { 
    	super(name,color);
    }
	
	@Override
	public void sound() {  //인스턴스 메소드는 현재 객체의 인스턴스 필드값으로 처리를 합니다.
		//추상메소드 구현합니다.
        System.out.println("고양이는🐱🐱🐱 야옹야옹 대화합니다."); 
       
	}    
	
	
}


