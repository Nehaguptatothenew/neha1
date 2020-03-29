package com.springbootcamp.springsecurity.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderProduct extends DomainBase
{

    //PRODUCT_VARIATION_ID
    //PRODUCT_VARIATION_METADATA
    private Integer QUANTITY;
    private Long PRICE;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    public Integer getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(Integer QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public Long getPRICE() {
        return PRICE;
    }

    public void setPRICE(Long PRICE) {
        this.PRICE = PRICE;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


}
