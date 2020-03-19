package com.example.Hibernate2Assignment.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="pmode",discriminatorType = DiscriminatorType.STRING)//We have used String because we will be storing the values in the form of a String
public abstract class PaymentSingleTable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
