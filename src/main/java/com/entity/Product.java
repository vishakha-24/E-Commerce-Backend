package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Product_E")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;

	@Column(length = 20)
    private String productName;
	@Column(length = 15)
    private String category;
	@Column(length = 40)
    private String description;
	@Column(length = 8)
    private double price;
	@Column(length = 20)
    private String companyName;
    
	public Product(Long productId, String productName, String category, String description, double price,
			String companyName) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.price = price;
		this.companyName = companyName;
	}

	public Product() {
		
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", description=" + description + ", price=" + price + ", companyName=" + companyName + "]";
	}

}
