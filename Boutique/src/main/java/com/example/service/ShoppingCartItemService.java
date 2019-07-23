package com.example.service;

import com.example.mapper.ShoppingCartItemMapper;
import com.example.unifyEntity.Admin;
import com.example.unifyEntity.ShoppingCart;
import com.example.unifyEntity.ShoppingCartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShoppingCartItemService {

    @Autowired
    ShoppingCartItemMapper shoppingCartItemMapper;

    @Autowired
    HttpServletRequest request;

    /*
    通过用户id查到购物车里面的所有商品
     */
    public List<ShoppingCartItem> getShoppingCart(int id){

        List<ShoppingCartItem> shoppingCartItemList=new ArrayList();
        shoppingCartItemList=shoppingCartItemMapper.findByUid(id);
        return  shoppingCartItemList;

    }

    /*
    通过用户id删除用户购物车里面的所有内容
     */
    public void deleteShopItem(int id){
        shoppingCartItemMapper.deleteByUId(id);
    }

    /*
    通过用户id添加用户购物车里面的商品
     */
    public void addShopItem(int productid,int psid,int num){
        ShoppingCartItem shoppingCartItem=new ShoppingCartItem();
        //shoppingCartItem.set

//        HttpSession session=request.getSession();
//        Admin admin=(Admin)session.getAttribute("admin");
//
//        shoppingCartItem.setProductId(admin.getUserId());
//        shoppingCartItem.setEnterTime(new Date());
//        shoppingCartItem.setProductId(productid);
//        shoppingCartItem.setNumber(num);
//
//        BigDecimal price=request.getParameter("")
//        shoppingCartItem.setTotalPrice();

        shoppingCartItem.setProductId(3);
 //       shoppingCartItem.setProductSpecificationId(1);
        shoppingCartItem.setNumber(3);
        shoppingCartItem.setEnterTime(new Date());
        shoppingCartItem.setState(1);


        BigDecimal bigDecimal=new BigDecimal("100");
        shoppingCartItem.setTotalPrice(bigDecimal);

        BigDecimal b=new BigDecimal(0.8);
        BigDecimal bigDecimal1=b.multiply(bigDecimal) ;
        shoppingCartItem.setFinalPrice(bigDecimal1);
        HttpSession session=request.getSession();

        shoppingCartItem.setNumber(12);

        shoppingCartItemMapper.addShopItem(shoppingCartItem);









    }



}
