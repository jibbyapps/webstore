package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by vitaliiromanchenko on 30.07.16.
 */
public interface CartService {

    Cart getCartById(int cartId);
    void update(Cart cart);

}
