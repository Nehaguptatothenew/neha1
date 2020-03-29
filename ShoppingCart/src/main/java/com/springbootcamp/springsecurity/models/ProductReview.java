package com.springbootcamp.springsecurity.models;

import javax.persistence.*;

@Entity
public class ProductReview extends DomainBase
{

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_USER_ID")
    private Customer customer;

    private String REVIEW;
    private Integer RATING;

    public String getREVIEW() {
        return REVIEW;
    }

    public void setREVIEW(String REVIEW) {
        this.REVIEW = REVIEW;
    }

    public Integer getRATING() {
        return RATING;
    }

    public void setRATING(Integer RATING) {
        this.RATING = RATING;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
