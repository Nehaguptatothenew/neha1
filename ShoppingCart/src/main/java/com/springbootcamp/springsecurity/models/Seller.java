package com.springbootcamp.springsecurity.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class Seller extends User
{
    private String GST;
    private Long COMPANY_CONTACT;
    private String COMPANY_NAME;
    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    private Set<Product> products;


    public String getGST() {
        return GST;
    }

    public void setGST(String GST) {
        this.GST = GST;
    }

    public Long getCOMPANY_CONTACT() {
        return COMPANY_CONTACT;
    }

    public void setCOMPANY_CONTACT(Long COMPANY_CONTACT) {
        this.COMPANY_CONTACT = COMPANY_CONTACT;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }


    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
