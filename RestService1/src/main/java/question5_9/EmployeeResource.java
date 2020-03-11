package question5_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeDaoService service;

    @PostMapping("/employees")
   public EmployeeDetails newEmployee(@RequestBody EmployeeDetails newEmployee) {
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



    @GetMapping("/employees")//We can get the details of all the Employees created using post method by @GetMapping
    public List<EmployeeDetails> retrieveAllEmployee()
    {
        return service.findAll();
    }

}