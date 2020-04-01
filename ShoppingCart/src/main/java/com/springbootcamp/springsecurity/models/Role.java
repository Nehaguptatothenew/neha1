package com.springbootcamp.springsecurity.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "ROLE")
public class Role extends DomainBase implements GrantedAuthority {
    @Column(name = "AUTHORITY")
    private String authority;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public String getAuthorrity() {
        return authority;
    }

    public void setAuthorrity(String authorrity) {
        this.authority = authorrity;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
