package com.compras.backend.domain.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @Column
    private String productCode;

    @Column
    private String productName;

    @Column
    private String productImage;

    @Column
    private String productLine;


    @Column
    private String productScale;

    @Column
    private String productVendor;

    @Column
    private String productDescription;

    @Column
    private Integer quantityInStock;

    @Column
    private Double buyPrice;

    @Column(name = "MSRP")
    private Double msrp;

    @Column
    private Double ranking;



}
