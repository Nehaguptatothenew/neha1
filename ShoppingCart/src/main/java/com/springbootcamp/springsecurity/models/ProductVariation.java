package com.springbootcamp.springsecurity.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.util.Map;

@Entity
@Table(name = "PRODUCT_VARIATION")
public class ProductVariation extends DomainBase {

    @Column(name = "QUANTITY_AVAILABLE")
    private Integer quantity_available;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "PRIMARY_IMAGE_NAME")
    private String primary_image_name;
    private String metadataJSON;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> metadatas;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void serializeCustomerAttributes() throws JsonProcessingException {
        this.metadataJSON = objectMapper.writeValueAsString(metadatas);
    }

    public void deserializeCustomerAttributes() throws IOException {
        this.metadatas = objectMapper.readValue(metadataJSON, Map.class);
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;


    @OneToOne(mappedBy = "productVariation", cascade = CascadeType.ALL)
    private Cart cart;
    @OneToOne(mappedBy = "productVariation", cascade = CascadeType.ALL)
    private OrderProduct orderProduct;

    public Integer getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(Integer quantity_available) {
        this.quantity_available = quantity_available;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getPrimary_image_name() {
        return primary_image_name;
    }

    public void setPrimary_image_name(String primary_image_name) {
        this.primary_image_name = primary_image_name;
    }

    public String getMetadataJSON() {
        return metadataJSON;
    }

    public void setMetadataJSON(String metadataJSON) {
        this.metadataJSON = metadataJSON;
    }

    public Map<String, Object> getMetadatas() {
        return metadatas;
    }

    public void setMetadatas(Map<String, Object> metadatas) {
        this.metadatas = metadatas;
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public OrderProduct getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProduct orderProduct) {
        this.orderProduct = orderProduct;
    }
}
