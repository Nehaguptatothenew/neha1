package com.springbootcamp.springsecurity.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "order_table")
public class Order extends DomainBase
{
     @Embedded
     private Set<Address> addresses;
     private Long AMOUNT_PAID;
     @Temporal(TemporalType.DATE)
     private Date DATE_CREATED;
     private String PAYMENT_METHOD;

   @ManyToOne//Mapping customer with order
   @JoinColumn(name="customer_user_id")
   private Customer customer;

   @OneToOne(mappedBy = "order",cascade = CascadeType.ALL)
   private OrderProduct orderProduct;



    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }


    public Long getAMOUNT_PAID() {
        return AMOUNT_PAID;
    }

    public void setAMOUNT_PAID(Long AMOUNT_PAID) {
        this.AMOUNT_PAID = AMOUNT_PAID;
    }

    public Date getDATE_CREATED() {
        return DATE_CREATED;
    }

    public void setDATE_CREATED(Date DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }

    public String getPAYMENT_METHOD() {
        return PAYMENT_METHOD;
    }

    public void setPAYMENT_METHOD(String PAYMENT_METHOD) {
        this.PAYMENT_METHOD = PAYMENT_METHOD;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
