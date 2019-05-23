/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.pichincha.products.service;

import ec.pichincha.products.model.Product;
import java.util.List;

/**
 *
 * @author erislan
 */
public interface ProductService {

    List<Product> findAll();    
    
}
