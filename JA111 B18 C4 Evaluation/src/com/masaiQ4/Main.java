package com.masaiQ4;

import java.util.ArrayList;
import java.util.List;

import com.masaiQ1.Book;
import com.masaiQ1.Library;

public class Main {
	public static void main(String[] args) {
		List<Product> p1 = new ArrayList<>();

		
		p1.add(new Product("Shoes",2000,"Adidas",12));
		p1.add(new Product("Ipad",100000,"Apple",2));
		p1.add(new Product("Ipad",100000,"Apple",4));
		p1.add(new Product("Shoes",4000,"Nike",4));
		p1.add(new Product("Shoes",2000,"Adidas",8));
		
		
		Ecommerce e1 = new Ecommerce();
		
		for (int i = 0; i < p1.size(); i++) {
			
			e1.addProductToList(p1.get(i));
			
			
		}
		for (int i = 0; i < e1.productList.size(); i++) {
			
			
			Product pb = e1.productList.get(i);
			
			System.out.println(pb);
			
		}

	}

}
