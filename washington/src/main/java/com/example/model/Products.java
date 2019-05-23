package com.example.model;

@Entity
public class Products {
	
	@Id
	private String productCode;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productImage")
	private String productImage;
	@Column(name = "productLine")
	private String productLine;
	@Column(name = "productScale")
	private String productScale;
	@Column(name = "productVendor")
	private String productVendor;
	@Column(name = "productDescription")
	private String productDescription;
	@Column(name = "quantityInStock")
	private Double quantityInStock;
	@Column(name = "buyPrice")
	private Double buyPrice;
	@Column(name = "MSRP")
	private Double MSRP;
	@Column(name = "ranking")
	private Integer ranking;
	

	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getProductScale() {
		return productScale;
	}
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(Double quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public Double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Double getMSRP() {
		return MSRP;
	}
	public void setMSRP(Double mSRP) {
		MSRP = mSRP;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	
}
