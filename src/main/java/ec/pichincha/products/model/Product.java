/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.pichincha.products.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author erislan
 */
@Entity
@Table(name = "products")
@Data
public class Product implements Serializable{

    // tener en cuenta los maximos y los no null
    
    @Id
    private String productCode;
    private String productName;
    private String productImage = "https://loremflickr.com/640/360";
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private Short quantityInStock;
    private Double buyPrice;
    private Double MSRP;
    private Short ranking;

}
