package com.springbootcamp.springsecurity.models;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_PRODUCT")
public class OrderProduct extends DomainBase {
    //PRODUCT_VARIATION_METADATA
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "PRICE")
    private Long price;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @OneToOne
    @JoinColumn(name = "PRODUCT_VARIATION_ID")
    private ProductVariation productVariation;


    /*@OneToOne(mappedBy = "orderProduct", cascade = CascadeType.ALL)
    private OrderStatus orderStatus;
*/
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }

   /* public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }*/
}
