package com.emusicstore.service;

import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;

/**
 * Created by vitaliiromanchenko on 30.07.16.
 */
public interface CartItemService {
 void addCartItem(CartItem cartItem);
 void removeCartItem(CartItem cartItem);
 void removeAllCartItems(Cart cart);

 CartItem getCartItemByProductId(int productId);

}
