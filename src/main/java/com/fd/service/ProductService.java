package com.fd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fd.model.Product;

@Service
public class ProductService {
	 private List<Product> products = new ArrayList<>();
		
	    public ProductService() {
	        products.add(new Product(100, "Laptop", 9000.0));
	        products.add(new Product(101, "Smart TV", 60000.0));
	        products.add(new Product(102, "Mobile", 9000.0));
	    }
	
	    // GET: Retrieve all products
	    public List<Product> findAllProducts() {
	        return products;
	    }
	    public Product saveProduct(Product product) {
	        products.add(product);
	        return product;
	    }
	    public Product updateProduct(Product product) {
	        for (int i = 0; i < products.size(); i++) {
	            if (products.get(i).getId() == product.getId()) {
	                products.set(i, product);
	                return product;
	            }
	        }

	        throw new RuntimeException(
	            "Product not found with ID: " + product.getId()
	        );
	    }

	    public void deleteProduct(int id) {
	        for (int i = 0; i < products.size(); i++) {
	            if (products.get(i).getId() == id) {
	                products.remove(i);
	                return ;
	            }
	        }

	        throw new RuntimeException(
	            "Product not found with ID: " + id
	        );
	    }
}
