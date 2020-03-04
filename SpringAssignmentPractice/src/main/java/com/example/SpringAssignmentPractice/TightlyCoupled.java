//Write a program to demonstrate Tightly Coupled code.
package com.example.SpringAssignmentPractice;

public class TightlyCoupled
{
    Cars cars= new Cars();
    void setVehicles()
    {
        cars.display();
    }
    public static void main(String[] args)
    {
    TightlyCoupled tightlyCoupled=new TightlyCoupled();
    tightlyCoupled.setVehicles();
    }
}
class Cars
{
    public void display()
    {
        System.out.println("Cars Class");
    }
}
class Bikes
{
    public void display()
    {
        System.out.println("Bikes Class ");
    }
}
