package com.springbootcamp.springsecurity.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Role extends DomainBase
{
  private String  AUTHORITY;

  @ManyToMany(mappedBy = "roles")
  private Set<User> users;

    public String getAUTHORITY() {
        return AUTHORITY;
    }

    public void setAUTHORITY(String AUTHORITY) {
        this.AUTHORITY = AUTHORITY;
    }
}
