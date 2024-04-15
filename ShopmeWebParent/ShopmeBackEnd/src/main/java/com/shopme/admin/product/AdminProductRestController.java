package com.shopme.admin.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopme.common.entity.product.Product;
import com.shopme.common.exception.ProductNotFoundException;

@RestController
public class AdminProductRestController {

	@Autowired
	private AdminProductService service;
	
	@PostMapping("/products/check_unique")
	public String checkUnique(@RequestParam("id") Integer id, @RequestParam("name") String name)
	{
		return service.checkUnique(id, name);
	}
	
	 @GetMapping("/products/get/{id}")
	public AdminProductDTO getProductInfo(@PathVariable("id") Integer id) 
			throws ProductNotFoundException {
		Product product = service.get(id);
		return new AdminProductDTO(product.getName(), product.getMainImagePath(), 
				product.getDiscountPrice(), product.getCost());
	}
	
}
