package com.springbootcamp.springsecurity.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@Entity
public class ProductVariation extends DomainBase
{

           private Integer QUANTITY_AVAILABLE;
           private Long PRICE;
           private String PRIMARY_IMAGE_NAME;
           private String metadataJSON;

           @Convert(converter = HashMapConverter.class)
           private Map<String, Object> metadatas;


            @ManyToOne
            @JoinColumn(name = "PRODUCT_ID")
             private Product product;

            @OneToMany(mappedBy = "productVariation",cascade = CascadeType.ALL)
            private Set<Cart> carts;




    public Integer getQUANTITY_AVAILABLE() {
        return QUANTITY_AVAILABLE;
    }

    public void setQUANTITY_AVAILABLE(Integer QUANTITY_AVAILABLE) {
        this.QUANTITY_AVAILABLE = QUANTITY_AVAILABLE;
    }

    public Long getPRICE() {
        return PRICE;
    }

    public void setPRICE(Long PRICE) {
        this.PRICE = PRICE;
    }

    public String getPRIMARY_IMAGE_NAME() {
        return PRIMARY_IMAGE_NAME;
    }

    public void setPRIMARY_IMAGE_NAME(String PRIMARY_IMAGE_NAME) {
        this.PRIMARY_IMAGE_NAME = PRIMARY_IMAGE_NAME;
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product products) {
        this.product = products;
    }



   private static final ObjectMapper objectMapper = new ObjectMapper();

    public void serializeCustomerAttributes() throws JsonProcessingException {
        this.metadataJSON = objectMapper.writeValueAsString(metadatas);
    }

    public void deserializeCustomerAttributes() throws IOException {
        this.metadatas = objectMapper.readValue(metadataJSON, Map.class);
    }

}
