//Write a program to demonstrate Loosely Coupled code.
package com.example.SpringAssignmentPractice;

public class LooselyCoupled
{
    public static void main(String[] args) {
        Journey journey = new Journey();
        Car car = new Car();
        journey.setVehicles(car);
        journey.showVehicles();
        Bike bike= new Bike();
        journey.setVehicles(bike);
        journey.showVehicles();

    }
}
class Journey
{
    Vehicles vehicles;
    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }
    public void showVehicles()
    {
        vehicles.display();
    }

}
interface Vehicles
{
    void display();

}
class Bike implements Vehicles
{
public void display()
{
    System.out.println("Bikes....");
}
}
class Car implements Vehicles
{
    public void display()
    {
        System.out.println("Cars....");
    }
}