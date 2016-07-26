package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by vitaliiromanchenko on 12.04.16.
 */

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required=false)String error, @RequestParam(value = "logout",
            required = false)String logout, Model model)
    {
        if(error!=null){
            model.addAttribute("error", "invalid username and password");

        }

        if(logout!=null){
            model.addAttribute("msg", "You have beeb logged out successfully");

        }




        return "login";
    }




    //define product dao instance
    // private ProductDao productDao = new ProductDao();

//   private Path path;


    //------------------------

//    @Autowired
//    private ProductDao productDao;
//
//    @RequestMapping("/")
//    public String home(){return "home";}



    //------------------------

//    @RequestMapping("/productList")
//    public String getProducts(Model model){ //functioun with model parametr which will be attached when you use he list
//        List<Product> productList = productDao.getProductList(); //imported list package
//        Product product = productList.get(0); //getting our product from the list, we have only 1 so index=0
//        model.addAttribute(product);  //bind the product to the model, bind the data from the dao to the model to the view
//
//        return "productList";
//
//    }

//------------------------
//    @RequestMapping("/productList")
//    public String getProducts(Model model){ //functioun with model parametr which will be attached when you use he list
//       // List<Product> products = productDao.getProductList(); //imported list package
//        List<Product> products = productDao.getAllProducts();
//        model.addAttribute("products",products);  //bind the products to the model, give the name "products"
//
//        return "productList";
//
//    }
//
//
//    @RequestMapping("/contacts")
//    public String contacts(){
//        return "contacts";
//    }
//------------------------

//   @RequestMapping("/productList/viewProduct")
//    public String viewProduct() {
//       return "viewProduct";
//   }

    //------------------------
//    @RequestMapping("/productList/viewProduct/{productId}") // <- pass variable
//    public String viewProduct(@PathVariable String productId, Model model) throws IOException {  //@PathVariable grab value from the path {prId}
//        Product product = productDao.getProductById(productId); //using Dao to invoke the funt getPbyId to get Id
//        model.addAttribute(product);
//
//        return "viewProduct";
//    }

    //------------------------

}
