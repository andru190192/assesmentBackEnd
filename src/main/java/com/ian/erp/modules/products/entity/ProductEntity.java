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

	@Column(name = "productname", nullable = false)
	private String productName;

	@Column(name = "productimage", nullable = false)
	private String productImage;

	@Column(name = "productline", nullable = false)
	private String productLine;

	@Column(name = "productscale", nullable = false)
	private String productScale;

	@Column(name = "productvendor", nullable = false)
	private String productVendor;

	@Column(name = "productdescription", nullable = false)
	private String productDescription; // text NOT NULL,

	@Column(name = "quantityinstock", nullable = false)
	private String quantitynStock;

	@Column(name = "buyprice", nullable = false)
	private Long buyPrice;

	@Column(name = "msrp", nullable = false)
	private Long MSRP;

	@Column(name = "ranking", nullable = false)
	private String ranking;
}
