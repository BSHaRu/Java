package factoryMethod;

public class BeanFactory {

	private static BeanFactory instance = new BeanFactory();
	
	private BeanFactory() {}
	
	public static BeanFactory getInstance() {
		return instance;
	}
	
	public Bus getBus() {
		return new Bus();
	}
}
