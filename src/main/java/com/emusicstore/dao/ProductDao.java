package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliiromanchenko on 13.04.16.
 */
public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("this is fender strat!");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");



        Product product2 = new Product();
        product2.setProductName("record");
        product2.setProductCategory("music album");
        product2.setProductDescription("blink 182");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(200);
        product2.setProductManufacturer("EMI");

        Product product3 = new Product();
        product3.setProductName("speaker");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("model 123");
        product3.setProductPrice(200);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(100);
        product3.setProductManufacturer("Shure");


        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);




        return productList;
    }
}
