package com.productos.commerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {

	@Id
	@Column(name = "productcode")
	private String productcode;

	@Column(name = "productimage")
	private String productimage;

	@Column(name = "productname")
	private String productname;

	@Column(name = "productline")
	private String productline;

	@Column(name = "productscale")
	private String productscale;

	@Column(name = "productvendor")
	private String productvendor;

	@Column(name = "productdescription")
	private String productdescription;

	@Column(name = "quantityinstock")
	private Integer quantityinstock;

	@Column(name = "buyprice")
	private Integer buyprice;

	@Column(name = "msrp")
	private Integer msrp;

	@Column(name = "ranking")
	private Integer ranking;

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductimage() {
		return productimage;
	}

	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductline() {
		return productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getProductscale() {
		return productscale;
	}

	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}

	public String getProductvendor() {
		return productvendor;
	}

	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public Integer getQuantityinstock() {
		return quantityinstock;
	}

	public void setQuantityinstock(Integer quantityinstock) {
		this.quantityinstock = quantityinstock;
	}

	public Integer getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(Integer buyprice) {
		this.buyprice = buyprice;
	}

	public Integer getMsrp() {
		return msrp;
	}

	public void setMsrp(Integer msrp) {
		this.msrp = msrp;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

}
