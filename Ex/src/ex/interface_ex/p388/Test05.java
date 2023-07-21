package ex.interface_ex.p388;

interface Remocon{
	public void powerOn();
}

public class Test05 implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new Test05();
		r.powerOn();
	}

}
