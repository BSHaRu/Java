package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2023.06.29
 * 내용 : Java Properties 실습
 * 
 * 프로퍼티(Properties)
 * 	- 문자열 데이터만 취급하는 Key-Value 자료구조 클래스
 * 	- 직렬화를 통해서 Property를 파일화 해서 환경설정을 함
 * 		-> 프로그램 환경설정 값을 저장할 때 사용
 * 	- 입출력스트림으로 데이터 입출력하는 자료구조 클래스
 */

public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 생성
		// -> Map이랑 비슷한 친구인데 Key, Value값이 모두 String타입
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 확장자가 매우 중요
		String path = "C:\\Users\\Java\\Desktop\\Fruit.properties";
		
		// 프로퍼티 파일 저장
		try {
			FileOutputStream fos = new FileOutputStream(path);
			// store(os, null) : OutputStream 한 걸 저장하는 작업
			// -> null에는 코맨트 달아주는건데 그냥 null 하면 된다네
			prop.store(fos, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 프로퍼티 파일 읽기
		String target = "C:\\Users\\Java\\Desktop\\Cities.properties";
		
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(propCities);
		System.out.println("한국 : " + propCities.getProperty("kor"));
		System.out.println("미국 : " + propCities.getProperty("usa"));
		System.out.println("일본 : " + propCities.getProperty("jp"));
		System.out.println("중국 : " + propCities.getProperty("ch"));
		
		System.out.println("프로퍼티 읽고 쓰기 끝");
	}

}
