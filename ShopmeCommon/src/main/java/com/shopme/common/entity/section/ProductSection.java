package com.shopme.common.entity.section;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.shopme.common.entity.IdBasedEntity;
import com.shopme.common.entity.product.Product;

@Entity
@Table(name = "sections_products")
public class ProductSection extends IdBasedEntity {

	@Column(name = "product_order")
	private int productOrder;

	@ManyToOne
	@JoinColumn(name = "product_id")	
	private Product product;

	public int getProductOrder() {
		return productOrder;
	}

	public void setProductOrder(int productOrder) {
		this.productOrder = productOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


}
