//Implement GET http request using path variable top get one employee
package com.example.Rest2.question11;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Resource;
//import org.springframework.core.io.Resource;
import org.springframework.hateoas.Resource;
//import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

//import org.springframework.hateoas.mvc.ControllerLinkBuilder;

//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
//import static ocom.example.Rest2.question11rg.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@RestController
public class EmpListResource {
    @Autowired
    private EmpListDaoService service;


    @GetMapping("/getEmployees")
    public List<Emp> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping(path = "/getOneEmployee/{id}")
    public Resource<Emp> retrieveEmployee(@PathVariable int id) {
        Emp emp = service.findOne(id);
        Resource<Emp> resource = new Resource<Emp>(emp);
        ControllerLinkBuilder linkTo = ControllerLinkBuilder.linkTo(methodOn(this.getClass()).retrieveAllUsers());
        resource.add(linkTo.withRel("all-users"));
        return resource;

    }
}