package com.springbootcamp.springsecurity.models;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

enum FROM_STATUS
{
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
    REFUND_COMPLETED
}
enum TO_STATUS
{
    CANCELLED,
    ORDER_CONFIRMED,
    ORDER_REJECTED,
    REFUND_INITIATED,
    CLOSED,
    ORDER_SHIPPED,
    DELIVERED,
    RETURN_REQUESTED,
    RETURN_REJECTED,
    RETURN_APPROVE,
    PICK_UP_INITIATED,
    PICK_UP_COMPLETED,

    REFUND_COMPLETED,

}

public class OrderStatus extends DomainBase
{

    //ORDER_PRODUCT_ID
   /* @ManyToOne
    @JoinColumn(name = "ORDER_PRODUCT_ID")
    private Set<Product>products;
*/
      private String TRANSITION_NOTES_COMMENTS;

    public String getTRANSITION_NOTES_COMMENTS() {
        return TRANSITION_NOTES_COMMENTS;
    }

    public void setTRANSITION_NOTES_COMMENTS(String TRANSITION_NOTES_COMMENTS) {
        this.TRANSITION_NOTES_COMMENTS = TRANSITION_NOTES_COMMENTS;
    }
}
