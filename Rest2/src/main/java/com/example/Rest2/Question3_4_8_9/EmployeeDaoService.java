package com.example.Rest2.Question3_4_8_9;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoService {
    private static List<EmployeeDetails> employees = new ArrayList<>();
    private static int employeecount=0;
    static {
        employees.add(new EmployeeDetails("Neha",21,1,"ttn"));
        employees.add(new EmployeeDetails("Ameesha",21,2,"ttn"));
        employees.add(new EmployeeDetails("Ishika",21,3,"ttn"));
        employees.add(new EmployeeDetails("Apurva",24,4,"ttn"));

    }

   public static List<EmployeeDetails> findAll()

    {
        return employees;
    }
   public EmployeeDetails save(EmployeeDetails employee)
    {
    if(employee.getId()==null)
        employee.setId(++employeecount);

    employees.add(employee);
    return employee;
    }




}
