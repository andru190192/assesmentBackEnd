package com.lcampoverde.demo.client.Service;

import com.lcampoverde.demo.client.dto.Product;

import java.util.List;

public interface ProductService {
    /**
     * Return all products.
     * @return
     */
    List<Product> findAllProducts();
}
