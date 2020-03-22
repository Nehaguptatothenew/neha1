//Implement GET http request using path variable top get one employee
package com.example.Rest2.question11;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

@ApiModel(description="Controller class.")
@RestController
public class EmpListResource {
    @Autowired
    private EmpListDaoService service;

    @ApiOperation(value = "to get all users.")
    @GetMapping("/getEmployees")
    public List<Emp> retrieveAllUsers() {
        return service.findAll();
    }

    @ApiOperation(value = "to get a user by its id.")
    @GetMapping(path = "/getOneEmployee/{id}")
    public Resource<Emp> retrieveEmployee(@PathVariable int id) {
        Emp emp = service.findOne(id);
        Resource<Emp> resource = new Resource<Emp>(emp);
        ControllerLinkBuilder linkTo = ControllerLinkBuilder.linkTo(methodOn(this.getClass()).retrieveAllUsers());
        resource.add(linkTo.withRel("all-users"));
        return resource;
    }

    @ApiOperation(value = "to post  user.")
    @PostMapping("/users")
    public void addUser(@RequestBody Emp emp)
    {
        Emp emp1 = EmpListDaoService.postEmployee(emp);
    }


    @ApiOperation(value = "to delete a user by its id")
    @DeleteMapping(path="/deleteOneEmployee/{id}")
    public Emp deleteUser(@PathVariable int id)  {
        Emp emp=service.deleteById(id);


        return emp;
    }


}