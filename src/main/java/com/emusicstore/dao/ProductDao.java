package com.emusicstore.dao;

import com.emusicstore.model.Cart;
import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 23.04.16.
 */
public interface ProductDao {

    void  addProduct(Product product);
    void editProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);



}
