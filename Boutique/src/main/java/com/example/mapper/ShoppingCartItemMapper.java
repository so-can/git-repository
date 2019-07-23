package com.example.mapper;

import com.example.unifyEntity.ShoppingCartItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartItemMapper {

    /*
    查询一个用户购物车里面的所有的商品
     */
    List<ShoppingCartItem> findByUid(int id);
    /*
    通过用户id删除改用户购物车里面的所有东西
     */
    void deleteByUId(int id);
    /*
    通过
     */
    void addShopItem(ShoppingCartItemMapper shoppingCartItemMapper);

}
