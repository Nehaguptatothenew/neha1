package com.example.Rest2.Question3_4_8_9;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoService service;

    @PostMapping("/employees")
   public EmployeeDetails newEmployee(@RequestBody EmployeeDetails newEmployee)
    {
        return service.save(newEmployee);
    }

   //It will post the data  of the user
       @PostMapping("/employeesUri")
    public ResponseEntity<Object> createUser(@Valid @RequestBody EmployeeDetails employeeDetails)//ResponseEntity will help to return a status along with the method  and the body
   {                                        //using valid keyword for providing validations in posting a user
        EmployeeDetails employeeDetails1=service.save(employeeDetails);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(employeeDetails.getId()).toUri();//This code will return the Uri of the new User created
        return ResponseEntity.created(location).build();

    }

    //Retrieving values after static filtering on the field password
    @GetMapping("/filtering")
    public EmployeeDetails filteringEmployeeDetails()
        {
            return new EmployeeDetails("neha",21,1,"hiiiiii");
        }

    //We are using dynamic filtering here on id and name
    @GetMapping("/dynamicFiltering")
    public MappingJacksonValue dynamicFilter1() {
        List<EmployeeDetails> list = EmployeeDaoService.findAll();
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("ignoring", filter);
        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);
        return mapping;
    }
    //We are using dynamic filtering here on id and location
    @GetMapping("/dynamicFiltering")
    public MappingJacksonValue dynamicFilter2() {
        List<EmployeeDetails> list = EmployeeDaoService.findAll();
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "location");
        FilterProvider filters = new SimpleFilterProvider().addFilter("ignoring", filter);
        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);
        return mapping;
    }

}