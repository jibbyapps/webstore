package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by vitaliiromanchenko on 19.06.16.
 */
public interface CartDao {
    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
    void delete(String cartId);
}
