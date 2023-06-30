package javaio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class OutputEx {

	public static void main(String[] args) throws Exception {
		/* 이름, 국어, 영어, 수학, 총점, 평균, 점수를
		 * score.txt 파일에 저장하기
		 */
		
		String path = "C:\\Users\\Java\\Desktop\\score.txt";
		
		String name = "kim";
		int kor = 90;
		int eng = 50;
		int math = 70;
		double total = kor + eng + math;
		double avg = total / 3.0;
		
		DataOutputStream out 
			= new DataOutputStream(
					new FileOutputStream(path));
		
		out.writeUTF(name);
		out.writeInt(kor);
		out.writeInt(eng);
		out.writeInt(math);
		out.writeDouble(total);
		out.writeDouble(avg);
		
		out.close();
		
	}

}
