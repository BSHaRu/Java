package test8;

import java.util.ArrayList;
import java.util.List;

class Products{
	List<Product> list = new ArrayList<>();
	
	public void SetProduct(String item, int price) {
		Product prod = new Product();
		prod.setItem(this, item, price);
	}
	
	public void showList() {
		for(Product p : list) {
			System.out.printf("상품 : %s, 가격 : %,d\n", 
					p.getItem(), p.getPrice());
		}
	}

	private class Product{
		private String item;
		private int price;
		
		public void setItem(Products products, String item, int price) {
			this.item = item;
			this.price = price;
			
			products.list.add(this);
		}
		
		public String getItem() {
			return item;
		}

		public int getPrice() {
			return price;
		}
	}
}


public class Test04 {

	public static void main(String[] args) {
		Products prods = new Products();
		prods.SetProduct("신발", 30000);
		prods.SetProduct("셔츠", 20000);
		prods.SetProduct("바지", 15000);
		
		prods.showList();
	}
}
