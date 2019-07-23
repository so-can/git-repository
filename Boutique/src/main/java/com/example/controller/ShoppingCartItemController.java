package com.example.controller;

import com.example.service.ShoppingCartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shop")
public class ShoppingCartItemController {

    @Autowired
    ShoppingCartItemService shoppingCartItemService;

    /**
     *通过用户id查询购物车里面所有的商品
     */
    @ResponseBody
    @RequestMapping("/get/{id}")
    public String getShop(@PathVariable int id){
        return shoppingCartItemService.getShoppingCart(id).toString();
    }

    /**
     * 通过用户id删购物车里面所有的商品
     * @param id
     * @return
     */
    @RequestMapping("/del/{id}")
    public String delShop(@PathVariable int id){
        shoppingCartItemService.deleteShopItem(id);
        return "index";
    }

    @RequestMapping("/add/{productid}/{psid}/{num}")
    public String addShop(@PathVariable int productid,@PathVariable int psid,@PathVariable int num){
        shoppingCartItemService.addShopItem(productid,psid,num);
        return "index";
    }
}
