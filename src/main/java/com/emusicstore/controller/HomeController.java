package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 12.04.16.
 */

@Controller
public class HomeController {

    //define product dao instance

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(){return "home";}

    @RequestMapping("/productList")
    public String getProducts(Model model){ //functioun with model parametr which will be attached when you use he list
        List<Product> productList = productDao.getProductList(); //imported list package
        Product product = productList.get(0); //getting our product from the list, we have only 1 so index=0
        model.addAttribute(product);  //bind the product to the model, bind the data from the dao to the model to the view

        return "productList";

    }



}
