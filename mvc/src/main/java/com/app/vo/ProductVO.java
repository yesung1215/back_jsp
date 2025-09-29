package com.app.vo;

import java.util.Objects;

public class ProductVO {
	private Long id;
	private String productName;
	private int productPrice;
	private int productStock;
	
	public ProductVO() {;}
	public ProductVO(Long id, String productName, int productPrice, int productStock) {
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	
	@Override
	public String toString() {
		return "ProductVo [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		return id == other.id;
	}
	

}
