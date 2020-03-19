package com.example.Hibernate2Assignment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

public class CreditCardJoinedTable extends PaymentJoinedTable {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
