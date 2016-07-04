package com.emusicstore.controller;

import com.emusicstore.dao.CartDao;
import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;
import com.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by vitaliiromanchenko on 23.06.16.
 */

@Controller
@RequestMapping("/rest/cart")
public class CartController {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;



    @RequestMapping(value = "/{cartId}",method = RequestMethod.GET)
    public @ResponseBody Cart read (@PathVariable(value = "cartId") String cartId){
        return cartDao.read(cartId);
    }
//it will add cart item in the jason format and sent it in response body



    @RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value = "/cartId") String cartId, @RequestBody Cart cart){
        cartDao.update(cartId, cart);
    }


    @RequestMapping(value = "/{cartId)", method=RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "/cartId") String cartId){
        cartDao.delete(cartId);
    }

    @RequestMapping(value = "/add/{productId}",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable(value = "productId") String productId, HttpServletRequest request){
        String sessionId = request.getSession(true).getId();
        Cart cart =cartDao.read(sessionId);
        if(cart == null){
            cart =cartDao.create(new Cart(sessionId));
        }

        Product product =productDao.getProductById(productId);
        if(product ==null){
            throw new IllegalArgumentException(new Exception());
        }

        cart.addCartItem(new CartItem(product));

        cartDao.update(sessionId,cart);
    }


    @RequestMapping(value = "/remove/{productId}",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String productId, HttpServletRequest request){

        String sessionId = request.getSession(true).getId();
        Cart cart =cartDao.read(sessionId);
        if(cart == null){
            cart = cartDao.create(new Cart(sessionId));
        }

        Product product =productDao.getProductById(productId);
        if(product ==null){
            throw new IllegalArgumentException(new Exception());
        }

        cart.removeCartItem(new CartItem(product));

        cartDao.update(sessionId,cart);

    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "illigal request,please verify your payload ")
    public void handleClientErrors(Exception e){}

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "illigal request,please verify your payload ")
    public void handleServerError(Exception e){}






}
