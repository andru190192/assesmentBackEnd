package com.lcampoverde.demo.ws;

import com.lcampoverde.demo.client.Service.ProductService;
import com.lcampoverde.demo.client.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all_products")
    public ResponseEntity<List<Product>> findAllProduct() {
        try {
            return ResponseEntity.ok(productService.findAllProducts());
        } catch (Exception ex) {
            return ResponseEntity.ok(null);
        }

    }


}
