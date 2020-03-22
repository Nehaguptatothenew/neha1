

package com.example.Rest2.question11;

public class Emp
{
    private String name;
    private int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
