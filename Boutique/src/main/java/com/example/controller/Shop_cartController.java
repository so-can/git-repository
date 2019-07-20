package com.example.controller;

import com.example.entity.Shop_cart;
import com.example.service.Shop_cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
public class Shop_cartController {

    @Autowired
    private Shop_cartService shop_cartService;

    @RequestMapping("/cart/{id}")
    public String getShop_cartOne(@PathVariable int id){
        return shop_cartService.getShop_cartById(id).toString();
    }
}
