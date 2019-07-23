package com.example.service;

import com.example.mapper.Shop_cartMapper;
import com.example.unifyEntity.Admin;
import com.example.unifyEntity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class Shop_cartService {

    @Autowired
    Shop_cartMapper shop_cartMapper;

    @Autowired
    HttpServletRequest request;

    public void addCartByUid(){

        ShoppingCart shoppingCart=new ShoppingCart();
        HttpSession session=request.getSession();
        Admin admin=(Admin) request.getAttribute("Admin");
        shoppingCart.setUserId(admin.getUserId());

//        ShoppingCart shoppingCart=new ShoppingCart();
//        shoppingCart.setUserId(3);

        shop_cartMapper.insertCart(shoppingCart);

    }

}
