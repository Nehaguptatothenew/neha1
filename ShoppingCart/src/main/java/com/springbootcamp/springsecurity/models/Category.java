package com.springbootcamp.springsecurity.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Category extends DomainBase {

    private String NAME;
    private Long PARENT_ID;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Product> products;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Long getPARENT_ID() {
        return PARENT_ID;
    }

    public void setPARENT_ID(Long PARENT_ID) {
        this.PARENT_ID = PARENT_ID;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
