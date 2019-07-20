package com.example.service;

import com.example.entity.Shop_cart;
import com.example.mapper.Shop_cartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Shop_cartService {

    @Autowired
    Shop_cartMapper shop_cartMapper;

    public Shop_cart getShop_cartById(int id){
        return shop_cartMapper.SelectById(id);
    }
}
