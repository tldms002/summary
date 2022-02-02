package koreait.day17;

public class MacBook extends SmartMachine {
	//SmartMachine 은 이미 RemoteControl, WebSearch인터페이스 구현했습니다.
	//이해를 위해서 아무것도 작성하지 않습니다.
	
	//인터페이스의 인스턴스 (default) 메소드를 재정의 할 수 있습니다.
	@Override
	public void setMute(boolean mute) {
		System.out.println("mute 기능 없습니다.");
	}
	
	
	@Override
	public void setBattery() {
		System.out.println("영구적인 배터리 사용합니다.");
	}
}