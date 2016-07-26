package com.emusicstore.service;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 13.07.16.
 */
public interface ProductService {

    List<Product> getProductList();


    Product getProductById(int Id);
    void addProduct(Product product);

    void editProduct(Product product);
    void deleteProduct(Product product);






}
