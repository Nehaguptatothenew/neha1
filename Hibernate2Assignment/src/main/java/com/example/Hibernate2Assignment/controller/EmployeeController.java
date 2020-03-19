package com.example.Hibernate2Assignment.controller;

import com.example.Hibernate2Assignment.model.Employee;
import com.example.Hibernate2Assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeController
{

    @Autowired
    EmployeeRepository repository;
    List<Object[]> list;
    @GetMapping("/create")
    public void testCreateEmployee()
    {
        Employee employee1=new Employee();
        employee1.setFirstName("krishna");
        employee1.setLastName("singh");
        employee1.setAge(55);
        employee1.setSalary(19000);
        Employee employee2=new Employee();
        employee2.setFirstName("Matilda");
        employee2.setLastName("singh");
        employee2.setAge(55);
        employee2.setSalary(4000);
        Employee employee3=new Employee();
        employee3.setFirstName("Saurabh");
        employee3.setLastName("Kaushik");
        employee3.setAge(55);
        employee3.setSalary(25000);
        Employee employee4=new Employee();
        employee4.setFirstName("ameesha");
        employee4.setLastName("sharma");
        employee4.setAge(55);
        employee4.setSalary(10000);
        repository.save(employee1);
        repository.save(employee2);
        repository.save(employee3);
        repository.save(employee4);
    }



//Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @GetMapping("/jpql1")
    public List<Object[]> showDetails() {
        Sort sort = Sort.by(Sort.Order.asc("age"), Sort.Order.desc("salary"));
        List<Object[]> objects = repository.partialSelect(PageRequest.of(0, 2, sort));
        for (Object[] objects1 : objects) {
            System.out.print(objects1[0] + " ");
            System.out.print(objects1[1] + " ");
            System.out.println();
        }
        return objects;
    }
    //Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @GetMapping("jpql2")
    public void updateSalary()
    {
        repository.updateSalary(10000,repository.avgSalary());
    }
    //Delete all employees with minimum salary.
    @GetMapping("jpql3")
    public void deleteSalary()
    {
        repository.deleteSalary(repository.minSalary());
    }

    @GetMapping("/native1")
    public void findSingh(){
        List<Object[]> objects=repository.findSingh();
        for (Object[] objects1 : objects) {
            System.out.print("id: "+objects1[0] + " name: "+objects1[1] + " age: "+objects1[2]);
            System.out.println();
        }
    }
    @GetMapping("/native2")
    public void deleteOld()
    {
        repository.deleteOld(45);
    }




}
