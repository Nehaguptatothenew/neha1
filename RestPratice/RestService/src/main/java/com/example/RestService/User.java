package com.example.RestService;

import java.util.Date;

public class User {
    private String name;
    private Integer id;
    private Date date;

    public User(String name, Integer id, Date date) {
        this.name = name;
        this.id = id;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", date=" + date +
                '}';
    }
}
