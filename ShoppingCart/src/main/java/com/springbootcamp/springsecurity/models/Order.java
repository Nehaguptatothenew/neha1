package com.springbootcamp.springsecurity.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDER_TABLE")
public class Order extends DomainBase {
    @Column(name = "AMOUNT_PAID")
    private Long amount_paid;
    /*@Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREATED")
    private Date date_created;*/
    @Column(name = "PAYMENT_METHOD")
    private String payment_method;

    @ManyToOne
    @JoinColumn(name = "customer_user_id")
    private Customer customer;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private OrderProduct orderProduct;
    @Embedded
    private Address addresses;

    public Long getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(Long amount_paid) {
        this.amount_paid = amount_paid;
    }

    /*public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }*/

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderProduct getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProduct orderProduct) {
        this.orderProduct = orderProduct;
    }

   public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }


}
