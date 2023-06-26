package sub1;

/*
 * ��¥ : 2023.06.26
 * ���� : Java Exception �ǽ�
 * 
 * ����ó��(Exception)
 * 	- ���ܴ� ���α׷� ���� �߿� �߻��ϴ� ��� ����
 * 	- ���� ��(Runtime) �߻��ϴ� ���ܿ� 
 * 		�Ϲ� ����(������ ��)�� �߻��ϴ� ���� ó��
 *  - �޼��� ���ο� �߻��ϴ� ���ܸ� ȣ���� ������ throws
 *  - ����ڰ� ������ ���ܸ� throw
 */

public class ExceptionEx {

	public static void main(String[] args) {

		// ���� ���� - ��Ÿ�� ���� ����
		
		// ���ܻ�Ȳ 1 : � ���� 0���� ���� �� �߻�
		int num1 = 1;
		int num2 = 0;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num1 * num2;
		int rs4 = 0;
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ� �ۼ�
			rs4 = num1 / num2;
		} catch (ArithmeticException e) {
			// ���ܰ� �߻����� �� ó���� �ڵ� �ۼ�
			e.printStackTrace();
		}
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		System.out.println("---------------------");
		
		// ���ܻ�Ȳ 2 : �迭�� �ε��� ������ ����� ��
		int arr[] = {1,2,3,4,5};
		
		try {
			for (int i=0; i<6; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		
		// ���ܻ�Ȳ 3 : ��ü ���� ���� ����(NullPointerException)
		Animal ani = null;
		
		try {
			ani.move();
			ani.hunt();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		
		// ���ܻ�Ȳ 4 : �߸��� ĳ����
		Animal a1 = new Tiger(); // ��ĳ����
		Animal a2 = new Eagle(); // ��ĳ����
		Animal a3 = new Shark(); // ��ĳ����
		
		try {
			Eagle eagle = (Eagle) a1; // �ٿ�ĳ���� - ����
			Shark shark = (Shark) a2; // �ٿ�ĳ���� - ����
			Tiger tiger = (Tiger) a3; // �ٿ�ĳ���� - ����
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------");
		
		System.out.println("��Ÿ�� ���� ����");
		
		
		// �Ϲ� ���� - ������ ���� ���� -> ������ �����ٷ� ǥ�õ�
		System.out.println("�Ϲ� ���� ����");
		
		try {
			Class animal = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			// ã�� �� ���� Ŭ���� ����
			e.printStackTrace();
		} finally {
			// ���ܰ� �ִ� ���� �ݵ�� ����Ǵ� �ڵ�
			System.out.println("������� ���� ���ɸ԰� �ʹ�..");
			// �޸� ���� (gc ������ ȣ���ؼ� �����ϴ°���)
			System.gc();
			System.out.println("finally ����");
		}
		
		System.out.println("----------------------");
		
		System.out.println("�Ϲ� ���� ����");
	}

}
