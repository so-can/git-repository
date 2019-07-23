package com.example.mapper;

import com.example.unifyEntity.ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Shop_cartMapper {

    ShoppingCart SelectById(int id);
    List<ShoppingCart> findAll(int id);
    void DeleteById(int id);
}
