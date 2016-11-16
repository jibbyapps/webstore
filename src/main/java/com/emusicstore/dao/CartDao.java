package com.emusicstore.dao;

import com.emusicstore.model.Cart;

import java.io.IOException;

/**
 * Created by vitaliiromanchenko on 19.06.16.
 */
public interface CartDao {

    Cart getCartById(int cartId);
    Cart validate(int cartId) throws IOException;

    void update(Cart cart);

//    Cart create(Cart cart);
//    Cart read(String cartId);
//    void update(String cartId, Cart cart);
//    void delete(String cartId);
}
