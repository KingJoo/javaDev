package test;

class Tv{
	String color = "검정색";
	boolean power;
	int channel;
	
	void setPower() {
		power=!power;
		System.out.println("- 전원버튼 누름!");
	}
	void channelUp() {
		channel++;
		System.out.println("- 채널 업!!");
	}
	void channelDown() {
		channel--;
		System.out.println("- 채널 다운!!");
	}
	void channelChange(int n) {
		channel=n;
		System.out.println("- 채널을 "+n+"으로 바꿈!!");
	}
	void state() {
		System.out.println("============status============");
		if(this.power)	System.out.println("Tv On");
		else System.out.println("Tv Off");
		System.out.println("채널번호 : " + channel);
		System.out.println("==============================");
	}
}

public class Tv0628 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.setPower();
		t.state();
		t.channelUp();
		t.state();
		t.channelChange(3230);
		t.state();
	}
}
