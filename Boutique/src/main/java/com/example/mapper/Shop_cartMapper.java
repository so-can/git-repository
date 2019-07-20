package com.example.mapper;

import com.example.entity.Shop_cart;
import org.springframework.stereotype.Repository;

@Repository
public interface Shop_cartMapper {

    Shop_cart SelectById(int id);
}
