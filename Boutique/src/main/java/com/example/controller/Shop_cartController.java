package com.example.controller;

import com.example.service.Shop_cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cart")
public class Shop_cartController {

    @Autowired
    private Shop_cartService shop_cartService;


    @RequestMapping("/get/{id}")
    public String getShop_cartOne(@PathVariable int id){

        return shop_cartService.getShop_cartById(id).toString();
       // return "index";
    }

    @RequestMapping("/del/{id}")
    public String delShop_cart(@PathVariable int id){
        shop_cartService.delShop_cartById(id);
        return "index";
    }

    @RequestMapping("/findall/{id}")
    public String findAllShop_cart(@PathVariable int id){
        System.out.println("--------"+shop_cartService.getShop_cart(id).toString());
        return shop_cartService.getShop_cart(id).toString();
    }

}
