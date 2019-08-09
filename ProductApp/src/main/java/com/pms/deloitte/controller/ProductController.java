package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProducts", this.productService.getAllProducts());
		return "product";
	}
	
	
	@RequestMapping(value= "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p){
		System.out.println("product :"+p);
			this.productService.addProduct(p);
		return "redirect:/products";
	}
	
	
	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product p){
		System.out.println("product updating :"+p);
			this.productService.updateProduct(p);
		return "redirect:/products";
	}
	
	@RequestMapping("/remove/{id}")
    public String removeProduct(@PathVariable("id") int productId){
		
        this.productService.deleteProduct(productId);
        return "redirect:/products";
    }
 
    @RequestMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int productId, Model model){
        model.addAttribute("product", this.productService.getProductById(productId));
        model.addAttribute("listProducts", this.productService.getAllProducts());
        return "product";
    }
	
	
	
	
	
	
	
	
	@RequestMapping("/product")
	public String getProduct(Model model)
	{/*Product product= new Product(45, "Mouse",85,1400);
	model.addAttribute("product", product);*/
		model.addAttribute("product", new Product());
		return "product";
		
	}
	
	
	
	@RequestMapping("/getProduct/{pId}")
	public Product getProduct(@PathVariable("pId")Integer productId)
	{
		Product product=productService.getProductById(productId);
		return product;
	}

/*	@RequestMapping("/saveProduct")
	public String saveProduct()
	{
		Product product=new Product(159, "Bed",5,8500);
		productService.addProduct(product);
		return "Saving product";
		
		
	}
	*/
	
	
	@RequestMapping("/saveProduct")
	public String saveProduct(Model model)
	{
		model.addAttribute("product", new Product());
		return "product";
		
		
	}
	
	@RequestMapping("/saveProductRecord")
	public String saveProductRecord(Model model, Product product)
	{productService.addProduct(product);
	model.addAttribute("product", new Product());
		model.addAttribute("message", "product added successfully");
		return "product";
		
		
	}
	

	
@RequestMapping("/deleteProduct/{pId}")
	public String delete(@PathVariable("pId")Integer productId)
	{
	
		productService.deleteProduct(productId);
		return "Deleting product";
		
		
	}
@RequestMapping("/allProducts")
public List<Product> getAllProducts()
{

	List<Product> products=productService.getAllProducts();
	return products;
	
	
}

@RequestMapping("/productByName/{proName}")
public List<Product> getProductByName(@PathVariable("proName")String productName)
{

	List<Product> products=productService.findByName(productName);
	return products;
	
	
}

@RequestMapping("/productByPriceRange/{min}/{max}")
public List<Product> productByPriceRange(@PathVariable("min")Integer minimum, @PathVariable("max")Integer maximum)
{

	List<Product> products=productService.searchByPriceRange(minimum, maximum);
	return products;
	
}
	

@RequestMapping("/searchByQuantity/{value}")
public List<Product> searchByQuantity(@PathVariable("value")Integer quantity)
{

	List<Product> products=productService.searchByQuantity(quantity);
	return products;
	
}
	

	
}
