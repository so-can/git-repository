package com.example.service;

import com.example.mapper.Shop_cartMapper;
import com.example.unifyEntity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Shop_cartService {

    @Autowired
    Shop_cartMapper shop_cartMapper;

    public ShoppingCart getShop_cartById(int id){

        return shop_cartMapper.SelectById(id);
    }
    public List<ShoppingCart> getShop_cart(int id){
        List<ShoppingCart> listshop_cart=new ArrayList(id);
        listshop_cart=shop_cartMapper.findAll(id);
        System.out.println("ser============"+listshop_cart);
        return listshop_cart;
    }


    public void delShop_cartById(int id){

        shop_cartMapper.DeleteById(id);
    }

}
