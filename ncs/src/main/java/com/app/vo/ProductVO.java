package com.app.vo;

import java.util.Objects;

public class ProductVO {
	private Long id;
	private String ncsProductName;
	private Integer ncsProductPrice;
	private String ncsProductSeller;
	
	public ProductVO() {;}
	public ProductVO(Long id, String ncsProductName, Integer ncsProductPrice, String ncsProductSeller) {
		this.id = id;
		this.ncsProductName = ncsProductName;
		this.ncsProductPrice = ncsProductPrice;
		this.ncsProductSeller = ncsProductSeller;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNcsProductName() {
		return ncsProductName;
	}
	public void setNcsProductName(String ncsProductName) {
		this.ncsProductName = ncsProductName;
	}
	public Integer getNcsProductPrice() {
		return ncsProductPrice;
	}
	public void setNcsProductPrice(Integer ncsProductPrice) {
		this.ncsProductPrice = ncsProductPrice;
	}
	public String getNcsProductSeller() {
		return ncsProductSeller;
	}
	public void setNcsProductSeller(String ncsProductSeller) {
		this.ncsProductSeller = ncsProductSeller;
	}
	
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", ncsProductName=" + ncsProductName + ", ncsProductPrice=" + ncsProductPrice
				+ ", ncsProductSeller=" + ncsProductSeller + "]";
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
		return Objects.equals(id, other.id);
	}
	
}
