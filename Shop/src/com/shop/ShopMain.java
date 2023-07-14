package com.shop;

import java.util.List;
import java.util.Scanner;
/*
 * 날짜 : 2023.07.13
 * 내용 : Shop CRUD 실습
 */

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

public class ShopMain {

	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO	orderDAO	= OrderDAO.getInstance();
		ProductDAO	productDAO	= ProductDAO.getInstance();
		
		CustomerVO loginChecked = null;
				
		while(true) {
			if(loginChecked == null){
				System.out.println("종료: 0 | 로그인: 1 | 회원가입: 2 | 상품목록: 3 | 구매하기: 4");
			}else{
				System.out.println("종료: 0 | 로그아웃: 1 | 주문현황: 2 | 상품목록: 3 | 구매하기: 4");
			}
			System.out.print("선택 : ");
			
			int num = sc.nextInt();
			
			if(num == 0) {
				// 종료
				break;
			}else if(num == 1) {
				if(loginChecked == null) {
					// 로그인
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginChecked = customerDAO.selectCustomer(custId);
					
					if(loginChecked != null) 
						System.out.println(loginChecked.getName()+"님 어서오세요");
					else
						System.out.println("일치하는 회원이 없습니다.");
				}else {
					// 로그아웃
					System.err.println(loginChecked.getName() + "님이 로그아웃 하였습니다.");
					loginChecked = null;
				}
			}else if(num == 2) {
				// 회원가입
				if(loginChecked == null) {
					CustomerVO vo = new CustomerVO();
					System.out.print("아이디 입력 : ");
					vo.setCustId(sc.next());
					
					System.out.print("이름 입력 : ");
					vo.setName(sc.next());
					
					System.out.print("연락처 입력 : ");
					vo.setHp(sc.next());
					
					System.out.print("주소 입력 : ");
					vo.setAddr(sc.next());
					
					int result = customerDAO.insertCustomer(vo);
					
					if(result > 0)
						System.out.println("회원가입 축하합니다.");
					else
						System.out.println("이미 사용중인 아이디 입니다.");
				}else {
					// 주문 현황
					String orderId = loginChecked.getCustId();
					List<OrderVO> myOrders = orderDAO.selectOrders(orderId);
					
					for(OrderVO myOrder : myOrders) {
						System.out.println(myOrder);
					}
				}
				
			}else if (num == 3) {
				// 상품 목록
				List<ProductVO> prods = productDAO.selectProducts();
				
				System.out.println("==========================상품 목록============================");
				for(ProductVO prod : prods) {
					System.out.println(prod);
				}
			}else if (num == 4) {
				// 주문하기
				// 로그인 체크				
				if(loginChecked == null) {
					System.out.println("로그인부터 하세요");
					continue;
				}
				OrderVO orderVo = new OrderVO();
				
				System.out.print("주문할 상품 번호를 입력하세요 > ");
				int prodNo = sc.nextInt();
				orderVo.setOrderProduct(prodNo);
				
				System.out.print("주문 수량 입력 : " );
				int prodCount = sc.nextInt();
				orderVo.setOrderCount(prodCount);
				
				// 주문자 아이디
				orderVo.setOrderId(loginChecked.getCustId());
				
				// 주문 처리
				int result = orderDAO.insertOrder(orderVo);
				
				// 주문 후 상품 재고 수정
				productDAO.updateProductStock(prodNo, prodCount);
				
				if(result > 0)
					System.out.println("상품 주문이 완료 되었습니다.");
				else
					System.out.println("해당 상품이 없습니다.");
			}else {
				System.out.println("번호를 다시 선택 해 주세요");
				continue;
			}
			
		}//while end
		sc.close();
		System.out.println("프로그램 종료");
	}
}
