package com.springbootcamp.springsecurity.models;

import javax.persistence.*;

enum status {
    ORDER_PLACED,
    CANCELLED,
    ORDER_REJECTED,
    ORDER_CONFIRMED,
    ORDER_SHIPPED,
    DELIVERED,
    RETURN_REQUESTED,
    RETURN_REJECTED,
    RETURN_APPROVED,
    PICK_UP_INITIATED,
    PICK_UP_COMPLETED,
    REFUND_INITIATED,
    REFUND_COMPLETED,
}

@Entity
@Table(name = "ORDER_STATUS")
public class OrderStatus extends DomainBase {

    @Column(name = "FROM_STATUS")
    private status from_status;
    @Column(name = "TO_STATUS")
    private status to_status;
    /*@OneToOne
    @JoinColumn(name = "ORDER_PRODUCT_ID")
    private OrderProduct order_product;
*/
    @Column(name = "TRANSITION_NOTES_COMMENTS")
    private String transition_notes_comments;

    public status getFrom_status() {
        return from_status;
    }

    public void setFrom_status(status from_status) {
        this.from_status = from_status;
    }

    public status getTo_status() {
        return to_status;
    }

    public void setTo_status(status to_status) {
        this.to_status = to_status;
    }

    /*public OrderProduct getOrder_product() {
        return order_product;
    }

    public void setOrder_product(OrderProduct order_product) {
        this.order_product = order_product;
    }*/

    public String getTransition_notes_comments() {
        return transition_notes_comments;
    }

    public void setTransition_notes_comments(String transition_notes_comments) {
        this.transition_notes_comments = transition_notes_comments;
    }
}
