package com.springbootcamp.springsecurity.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User extends DomainBase
{
   private String EMAIL;
    private String FIRST_NAME;
   private String MIDDLE_NAME;
    private String LAST_NAME;
    private String PASSWORD;
     private Boolean IS_DELETED;
     private Boolean IS_ACTIVE;

     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(name = "user_role",
             joinColumns=@JoinColumn(name = "user_id",referencedColumnName = "id"),
             inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
     private Set<Role> roles;

     @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
     private Set<Address> addresses;

     @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
     private Cart cart;



    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getMIDDLE_NAME() {
        return MIDDLE_NAME;
    }

    public void setMIDDLE_NAME(String MIDDLE_NAME) {
        this.MIDDLE_NAME = MIDDLE_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Boolean IS_DELETED() {
        return IS_DELETED;
    }

    public void IS_DELETED(Boolean IS_DELETED) {
        this.IS_DELETED = IS_DELETED;
    }

    public Boolean IS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void IS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }
}

