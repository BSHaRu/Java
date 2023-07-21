package test8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Java\\Desktop\\test\\test.txt";
		
		File file = new File(path);
		FileWriter fw = new FileWriter(file);
		
		for(int x = 2; x <= 9; x++) {
			System.out.println(x + "단");
			fw.write(x + "단\n");
			
			for(int y = 1; y <= 9; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
				fw.write(x + " x " + y + " = " + z + "\n");
			}
		}
		fw.flush();
		fw.close();
		System.out.println("구구단 파일 생성 완료");
	} // main end
}
