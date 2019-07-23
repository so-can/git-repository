package com.example.controller;

import com.example.service.Shop_cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cart")
public class Shop_cartController {

    @Autowired
    Shop_cartService shopp_cartService;



    @RequestMapping("/user")
    public String getShopCartByUid(){

        shopp_cartService.addCartByUid();
       return "ok";

    }
}
