package com.lcampoverde.demo.client.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Blob;

@Entity
@Table(name="products")
@Getter
@Setter
public class Product implements Serializable {
    @Id
    @NaturalId
    @Column(name="productCode",length = 15)
    private String productCode;

    @Column(name="productName",length = 70)
    private String productName;
    @Column(name="productImage",length = 50)
    private String productImage;
    @Column(name="productLine",length = 50)
    private String productLine;
    @Column(name="productScale",length = 10)
    private String productScale;
    @Column(name="productVendor",length = 50)
    private String productVendor;
    @Column(name="productDescription")
    private Blob productDescription;
    @Column(name="quantityInStock")
    private Integer quantityInStock;
    @Column(name="buyPrice")
    private Double buyPrice;
    @Column(name="MSRP")
    private Double MSRP;
    @Column(name="ranking")
    private Integer ranking;
}
