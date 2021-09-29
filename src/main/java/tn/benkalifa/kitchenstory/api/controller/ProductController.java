package tn.benkalifa.kitchenstory.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.benkalifa.kitchenstory.api.controller.api.ProductApi;
import tn.benkalifa.kitchenstory.api.model.Product;
import tn.benkalifa.kitchenstory.api.services.ProductService;
@RestController
public class ProductController implements ProductApi {
	@Autowired
	private ProductService productService;

	public List<Product> findAll() {
		
		return productService.findAll();
	}

}
