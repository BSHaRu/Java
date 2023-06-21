package sub4;

import sub3.Calc;
import sub3.Car;

/*
 * ��¥ : 2023/06/20
 * ���� : �ڹ� Ŭ���� �޼���, Ŭ���� ���� �ǽ�
 * 
 * Ŭ���� ����, Ŭ���� �޼���(���� ����, ���� �޼���)
 * 	- static�� ������ ����, �޼���� Method Area�� ����.
 * 	- ������ ��ü����(new)�� ���� �ʰ� Ŭ���� Ÿ������ �����Ѵ�.
 *  - ��ü(�ν��Ͻ�)�� ���� ���� �������� Ŭ���� ����, Ŭ���� �޼��� ����Ѵ�.
 * 
 * �̱��� ��ü(singleton)
 *  - static�� Ȱ���� �̱��� ��ü�� ���� �ϳ��� �ν��Ͻ��� �޸𸮻� ���� �Ѵ�.
 *  - �̱��� ��ü�� ����ؼ� �޸� ����� ���� ����� ����Ѵ�.
 *  	-> �� �ѹ��� new�� �ν��Ͻ� ������ �� ��� �� �� ����
 *  - ���������� �����ؼ� �ٸ� Ŭ�������� ���Ǳ� ����
 *  
 */
public class StaticTest {

	public static void main(String[] args) {

		// Car �ǽ�
		Car sonata = new Car("�ҳ�Ÿ", "���", 10);
		Car avante = new Car("�ƹ���", "����", 20);
		Car grande = new Car("�׷���", "����", 30);

		// show()�� instance method, 
		// instance method�� �ݵ�� �ν��Ͻ��� ���ؼ� ȣ�� �ؾ� �Ѵ�. 
		// Car.show()�� �Ұ��� -> show()�� class method�� ������ ȣ�Ⱑ��
		sonata.show();
		System.out.println();
		avante.show();
		System.out.println();
		grande.show();
		System.out.println();

		// Ŭ���� ���� ����
		System.out.println("��ü ������: " + Car.count); 
		System.out.println();
		// Ŭ���� �޼��� ȣ��
		System.out.println("���� ������: " + Car.getCount()); 
		System.out.println();

		// �̱��� ��ü �ǽ�
		// Calc c1 = new Calc(); 
		// The constructor Calc() is not visible ���� �̱������� ����
		// private�� ĸ��ȭ �������� �翬�� Calc()�޼��� ȣ���� �Ұ��ϴ�.

		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();

		int result1 = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

	}
}
