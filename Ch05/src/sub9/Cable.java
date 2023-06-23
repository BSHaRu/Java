package sub9;

public class Cable implements Socket{

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		// bulb �ʱ�ȭ...
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

	
	
}
