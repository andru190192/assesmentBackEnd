/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.pichincha.products.rest;

import ec.pichincha.products.model.Product;
import ec.pichincha.products.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erislan
 */
@RestController
public class ProductRest {
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping(value = "/products")
    public ResponseEntity<List<Product>> getTasks() {        ;
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    
}
