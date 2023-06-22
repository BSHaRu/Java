package sub7;

/*
 *  ��¥ : 2023.06.22
 *  ���� : Java ������ �ǽ�
 *  
 *  ������(Polymorphism)
 * 	- ��Ӱ��迡�� �θ� Ŭ������ ����� �ڽ� Ŭ�������� �پ��� ������� ���ϴ� Ư��
 * 	- ��ü�� Ÿ�Լ����� �θ� Ŭ���� Ÿ������ ����
 * 	- �������� Ȱ���ؼ� ���α׷����� �ߺ��� ���̰� �������� ����
 */

public class PolyTest {
	public static void main(String[] args) {
		
		// �������� ������ ��ü ����(��ĳ����)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		System.out.println("---------------");
		
		a2.move();
		a2.hunt();
		
		System.out.println("---------------");
		
		a3.move();
		a3.hunt();
		
		System.out.println("----��ĳ���� ��-----");
		
		// �ٿ�ĳ����
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		System.out.println("---------------");
		
		eagle.move();
		eagle.hunt();
		
		System.out.println("---------------");
		
		shark.move();
		shark.hunt();
		
		System.out.println("----�ٿ�ĳ���� ��-----");
		
		// ��ü Ÿ�� �񱳿���
		// A instanceof B : A�� �ν��Ͻ��� BŸ���̶� ������ ���ϴ� ģ��
		if(a1 instanceof Tiger) {
			System.out.println("a1�� Tiger");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1�� Eagle");
		}else if(a1 instanceof Shark) {
			System.out.println("a1�� Shark");
		}
		
		System.out.println("-----------------");
		
		// �������� Ȱ���� ��ü�迭
		Animal arr[] = {tiger, eagle, shark};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
	}
}
