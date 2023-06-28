package sub2;

import java.util.Stack;

/*
 * 날짜 : 2023.06.28
 * 내용 : Java 자료구조 Stack 실습
 * 
 * 스택(Stack)
 * 	- 스택은 데이터가 순서대로 쌓이는 자료구조(LIFO : 후입선출)
 * 	- 변수 선언과 메서드 실행에 사용
 */

public class StackTest {

	public static void main(String[] args) {
		// 제네릭에는 기본타입을 사용 할 수가 없음
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.println("stack pop : " + stack.pop());
		}
		
	}
}
