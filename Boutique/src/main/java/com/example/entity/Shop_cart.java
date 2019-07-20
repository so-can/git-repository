package com.example.entity;

public class Shop_cart {
    private Integer sc_id;
    private Integer u_id;
    private Integer t_num;

    public Integer getSc_id() {
        return sc_id;
    }

    public void setSc_id(Integer sc_id) {
        this.sc_id = sc_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getT_num() {
        return t_num;
    }

    public void setT_num(Integer t_num) {
        this.t_num = t_num;
    }

    @Override
    public String toString() {
        return "shop_cart{" +
                "sc_id=" + sc_id +
                ", u_id=" + u_id +
                ", t_num=" + t_num +
                '}';
    }
}
