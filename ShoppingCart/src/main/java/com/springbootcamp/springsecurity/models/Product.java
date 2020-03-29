package com.springbootcamp.springsecurity.models;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product extends DomainBase {

    private String NAME;
    private String DESCRIPTION;
    private String BRAND;
    private Boolean IS_CANCELLABLE;
    private Boolean IS_RETURNABLE;
    private Boolean IS_ACTIVE;
    @ManyToOne
    @JoinColumn(name = "SELLER_USER_ID")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private Set<ProductReview> productReviews;


    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private Set<ProductVariation> productVariations;

    /*@ManyToOne(targetEntity = OrderStatus.class)
    private OrderStatus orderStatus;
*/

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public Boolean getIS_CANCELLABLE() {
        return IS_CANCELLABLE;
    }

    public void setIS_CANCELLABLE(Boolean IS_CANCELLABLE) {
        this.IS_CANCELLABLE = IS_CANCELLABLE;
    }

    public Boolean getIS_RETURNABLE() {
        return IS_RETURNABLE;
    }

    public void setIS_RETURNABLE(Boolean IS_RETURNABLE) {
        this.IS_RETURNABLE = IS_RETURNABLE;
    }

    public Boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<ProductReview> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(Set<ProductReview> productReviews) {
        this.productReviews = productReviews;
    }

    public Set<ProductVariation> getProductVariations() {
        return productVariations;
    }

    public void setProductVariations(Set<ProductVariation> productVariations) {
        this.productVariations = productVariations;
    }
}
