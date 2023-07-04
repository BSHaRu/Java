package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			// 자기 ip 확인
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println(ia.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			// 도메인 ip 확인
			InetAddress[] iaArray 
				= InetAddress.getAllByName("www.naver.com");
			for(InetAddress ia : iaArray) {
				System.out.println("네이버 ip : " + ia.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
