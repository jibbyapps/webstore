package com.emusicstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vitaliiromanchenko on 19.06.16.
 */

@Entity
public class CartItem implements Serializable {


    private static final long serialVersionUID = -904360230041854157L;



    @Id
    @GeneratedValue
    private int cartItemId;



    @ManyToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;



    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    private int quantity;
    private double totalPrice;

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

//    private Product product;
//    private int quantity;
//    private double totalPrice;
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public CartItem(){}


    //first version that was here
//    public CartItem(Product product, int quantity, double totalPrice) {
//        this.product = product;
//        this.quantity = quantity;
//        this.totalPrice = totalPrice;
//    }

    //part of second version

//    public CartItem(Product product) {
//        this.product = product;
//        this.quantity = 1;
//        this.totalPrice = product.getProductPrice();
//    }




}
