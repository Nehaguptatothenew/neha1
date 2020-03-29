package com.springbootcamp.springsecurity.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public  class Customer extends User
{
    private Long CONTACT;

    @OneToMany(mappedBy = "customer" ,cascade = CascadeType.ALL)
    private Set<Order> orders;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<ProductReview> productReviews;

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Long getCONTACT() {
        return CONTACT;
    }

    public void setCONTACT(Long CONTACT) {
        this.CONTACT = CONTACT;
    }
}
