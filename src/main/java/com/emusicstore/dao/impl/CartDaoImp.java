package com.emusicstore.dao.impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitaliiromanchenko on 19.06.16.
 */

@Repository
public class CartDaoImp implements CartDao {

    private Map<String,Cart> listOfCarts;

    public CartDaoImp(){listOfCarts = new HashMap<String, Cart>();}



    public Cart create(Cart cart){
        if(listOfCarts.keySet().contains(cart.getCartId())){
            throw new IllegalArgumentException(String.format("Can not create a cart, a cart with the given id(%)"+
                    "already"+ "exists", cart.getCartId()));
        }

        listOfCarts.put(cart.getCartId(),cart);
        return cart;

    }

    public Cart read(String cartId){
        return listOfCarts.get(cartId);
    }

    public void update(String cartId,Cart cart){
        if (!listOfCarts.keySet().contains(cartId)){

            throw new IllegalArgumentException(String.format("Can not update a cart, a cart with the given id(%)"+
                    "doesn't"+ "exist", cart.getCartId()));

        }
        listOfCarts.put(cartId, cart);
    }

    public void delete(String cartId){
        if(!listOfCarts.keySet().contains(cartId)){

            throw new IllegalArgumentException(String.format("Can not delete a cart, a cart with the given id(%)"+
                    "doesn't"+ "exist", cartId));
        }
        listOfCarts.remove(cartId);

    }

}
