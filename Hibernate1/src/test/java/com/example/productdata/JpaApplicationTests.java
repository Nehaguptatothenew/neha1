package com.example.productdata;

import com.example.productdata.entities.Employee;
import com.example.productdata.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {//Thos will Load all the configuration files

	}

	//Perform Create Operation on Entity using Spring Data JPA
	@Test
	public void testCreate() {
		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("Neha");
		employee.setAge(28);
		employee.setLocation("Noida");
		repository.save(employee);

	}
	// Perform Update Operation on Entity using Spring Data JPA
	@Test
	public void testUpdate()
	{
		Optional<Employee> employee=repository.findById(2);
		employee.get().setAge(35);
		repository.save(employee.get());

	}
	// Perform Delete Operation on Entity using Spring Data JPA
	@Test
	public void testDelete()
	{
		if(repository.existsById(1));
		System.out.println("Deleting");
		repository.deleteById(1);

	}
	//Perform Read Operation on Entity using Spring Data JPA
	@Test
	public void testRead()
	{
		Optional<Employee> employee=repository.findById(1);
		assertNotNull(employee);
		assertEquals("Neha",employee.get().getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>"+employee.get().getLocation());
	}
	//Get the total count of the number of Employees
	@Test
	public void testCount()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+repository.count());
	}
	//Implement Pagination and Sorting on the bases of Employee Age
	@Test
	public void testFindAllPagingAndSorting()
	{
		Pageable pageable= PageRequest.of(0,3, Sort.Direction.ASC,"name");
		repository.findAll(pageable).forEach(p-> System.out.println(p.getName()));
	}

	
	// Create and use finder to find Employee by Name
	@Test
	public void testFindByName()
	{
		List<Employee> employee=repository.findByName("Neha");
		employee.forEach(p-> System.out.println(p.getAge()));
	}

	// Create and use finder to find Employees starting with A character
	@Test
	 public void testFindNameLike()
	{
		List<Employee> employee=repository.findByNameLike("A%");
		employee.forEach(p-> System.out.println(p.getName()));
	}
	//Create and use finder to find Employees Between the age of 28 to 32
	@Test
	public void testFindAgeBetween()
	{
		List<Employee> employee=repository.findByAgeBetween(28,32);
		employee.forEach(p-> System.out.println(p.getName()));
	}


}









