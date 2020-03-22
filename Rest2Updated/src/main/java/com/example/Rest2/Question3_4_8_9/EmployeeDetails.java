
package com.example.Rest2.Question3_4_8_9;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonFilter("ignoring")
public class EmployeeDetails {
    @Size(min=2, max=30,message = "name should be atleast of two characters")//Adding validations
    private String name;//Employee details

    @NotNull
    @Min(18) @Max(100)
    private int age;
     private Integer id;
     @JsonIgnore  //Doing static filtering with password
     private String password;

    public EmployeeDetails( String name, int age, Integer id, String password) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
