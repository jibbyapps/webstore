package com.emusicstore.dao;

import com.emusicstore.model.Cart;
import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 23.04.16.
 */
public interface ProductDao {

//    void  addProduct(Product product);
//    void editProduct(Product product);
//
//  //Product getProductById(String id);
//  Product getProductById(int id);
//
//
//    List<Product> getAllProducts();
//
//    void deleteProduct(String id);


    List<Product> getProductList();


    Product getProductById(int Id);
    void addProduct(Product product);

    void editProduct(Product product);
    void deleteProduct(Product product);



}
