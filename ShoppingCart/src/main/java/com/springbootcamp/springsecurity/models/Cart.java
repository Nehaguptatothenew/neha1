package com.springbootcamp.springsecurity.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart extends DomainBase {

    @OneToOne
    @JoinColumn(name = "CUSTOMER_USER_ID")
    private User user;
      private Integer QUANTITY;
    private  Boolean IS_WISHLIST_ITEM;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_VARIATION_ID")
    private ProductVariation productVariation;




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(Integer QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public Boolean IS_WISHLIST_ITEM() {
        return IS_WISHLIST_ITEM;
    }

    public void IS_WISHLIST_ITEM(Boolean IS_WISHLIST_ITEM) {
        this.IS_WISHLIST_ITEM = IS_WISHLIST_ITEM;
    }
}
