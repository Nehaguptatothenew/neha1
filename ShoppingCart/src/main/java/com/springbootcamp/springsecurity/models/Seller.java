package com.springbootcamp.springsecurity.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "SELLER")
public class Seller extends User {
    @Column(name = "GST")
    private String gst;
    @Column(name = "COMPANY_CONTACT")
    private Long company_contact;
    @Column(name = "COMPANY_NAME")
    private String company_name;
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private Set<Product> products;

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public Long getCompany_contact() {
        return company_contact;
    }

    public void setCompany_contact(Long company_contact) {
        this.company_contact = company_contact;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
