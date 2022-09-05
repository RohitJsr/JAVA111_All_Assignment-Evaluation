package com.masaiQ4;

import java.util.ArrayList;
import java.util.List;



public class Ecommerce {
	List<Product> productList=new ArrayList<>();
	
	public void addProductToList(Product product) {
		
		if(!productList.contains(product)) {
			
			productList.add(product);
			
			
		}else {
			System.out.println("Duplicate Product");
		}
		
	}
	List<Product>showAllProduct() {
		return showAllProduct();
	}

	

	
	


}
