package javaio;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class InputEx {

	public static void main(String[] args) throws Exception {
		/* 이름, 국어, 영어, 수학, 총점, 평균, 점수를
		 * score.txt 파일을 읽기
		 */
		String path = "C:\\Users\\Java\\Desktop\\score.txt";
		
		DataInputStream in 
			= new DataInputStream(
					new FileInputStream(path));
		
		String name = in.readUTF();
		int kor = in.readInt();
		int eng = in.readInt();
		int math = in.readInt();
		double total = in.readDouble();
		double avg = in.readDouble();
		
		in.close();
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}
