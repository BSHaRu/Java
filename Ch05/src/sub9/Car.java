package sub9;

public interface Car {
	
	public abstract void speedUp(int speed);
	
	public abstract void speedDown(int speed);

	// 인터페이스에서는 abstract 생략 가능
	public void show(); 
}
