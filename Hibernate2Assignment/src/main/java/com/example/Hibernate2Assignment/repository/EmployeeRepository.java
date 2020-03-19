//Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
//Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
//Delete all employees with minimum salary.

package com.example.Hibernate2Assignment.repository;

import com.example.Hibernate2Assignment.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {


    @Query("select firstName, lastName from Employee where salary >(select AVG(salary) from Employee)")
      List<Object[]> partialSelect(Pageable pageable);

    @Query("select AVG(salary) from Employee")
    int avgSalary();
    @Query("select MIN(salary) from Employee")
    int minSalary();

    @Transactional
    @Query("update Employee set salary=:newSalary where salary<:avg")
    @Modifying//This is used whenever we modify our data
    void updateSalary(@Param("newSalary") int newSalary,@Param("avg") int avg);


    @Transactional
    @Query("delete Employee  where salary=:minimumSalary")
    @Modifying//This is used whenever we modify our data
    void deleteSalary(@Param("minimumSalary") int minimumSalary);

//Display the id, first name, age of all employees where last name ends with "singh"

    @Query(value = "select emp_id,age,first_name from employee where last_name like '%singh'", nativeQuery = true)
    List<Object[]> findSingh();
    //Delete all employees with age greater than 45(Should be passed as a parameter)
    @Transactional
    @Query(value="delete from employee where age>:agelimit",nativeQuery = true)
    @Modifying
    void deleteOld(@Param("agelimit") int agelimit);

}
