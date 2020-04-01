package com.springbootcamp.springsecurity.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.ZonedDateTime;

@MappedSuperclass
public abstract class DomainBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(nullable = false, updatable = false, insertable = false)
    @CreationTimestamp
    private ZonedDateTime date_created;

    @Column(nullable = false, updatable = false, insertable = false)
    @UpdateTimestamp
    private ZonedDateTime last_updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
