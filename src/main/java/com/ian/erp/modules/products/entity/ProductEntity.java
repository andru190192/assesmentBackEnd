/**
 * 
 */
package com.ian.erp.modules.products.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Ian
 *
 */
@Getter
@Setter
@Entity(name = "products")
public class ProductEntity {

	@Id
	@Column(name = "productcode")
	private String productCode;

	@Column(name = "productname")
	private String productName;

	@Column(name = "productimage")
	private String productImage;

	@Column(name = "productline")
	private String productLine;

	@Column(name = "productscale")
	private String productScale;

	@Column(name = "productvendor")
	private String productVendor;

	@Column(name = "productdescription")
	private String productDescription; // text NOT NULL,

	@Column(name = "quantityinstock")
	private String quantitynStock;

	@Column(name = "buyprice")
	private Long buyPrice;

	@Column(name = "msrp")
	private Long MSRP;

	@Column(name = "ranking")
	private String ranking;
}
