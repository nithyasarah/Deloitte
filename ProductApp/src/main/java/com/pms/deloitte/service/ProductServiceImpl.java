package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService  {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	@Transactional
	public void addProduct(Product product) {
	productDAO.save(product);
		
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		Product product=new Product();
		product.setProductId(productId);
		
		productDAO.delete(product);
		
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		productDAO.save(product);
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
	return(List<Product>)productDAO.findAll();

	}

	@Override
	public Product getProductById(int productId) {
		Optional<Product> product= productDAO.findById(productId);
		if(product.isPresent())
		{
			return product.get();
		}
		else
		
		return null;
	}

	
	@Override
	public List<Product> findByName(String productName) {
		return(List<Product>)productDAO.findByProductName(productName);
	
	}

	@Override
	public List<Product> searchByPriceRange(int minimum, int maximum) {
		return(List<Product>)productDAO.findByPriceBetween(minimum, maximum);
				
	}

	@Override
	public List<Product> searchByQuantity(int quantity) {
		return(List<Product>)productDAO.findByQuantityGreaterThan(quantity);
		
	}

	
	
}
