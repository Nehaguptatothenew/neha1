package com.springbootcamp.springsecurity.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Embeddable
public class Address extends DomainBase
{
    private String CITY;
    private String STATE;
    private String COUNTRY;
    private Integer ZIP_CODE;
    private String LABEL;
    private String ADDRESS_LINE;
    @ManyToOne
    @JoinColumn(name = "USER_ID")

    private User user;

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    public Integer getZIP_CODE() {
        return ZIP_CODE;
    }

    public void setZIP_CODE(Integer ZIP_CODE) {
        this.ZIP_CODE = ZIP_CODE;
    }

    public String getLABEL() {
        return LABEL;
    }

    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }

    public String getADDRESS_LINE() {
        return ADDRESS_LINE;
    }

    public void setADDRESS_LINE(String ADDRESS_LINE) {
        this.ADDRESS_LINE = ADDRESS_LINE;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
