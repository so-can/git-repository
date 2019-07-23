package com.example.mapper;

import com.example.unifyEntity.ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Shop_cartMapper {

    void insertCart(ShoppingCart shoppingCart);
}
