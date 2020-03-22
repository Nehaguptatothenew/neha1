package com.example.Rest2.versioning;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

    //using URI versioning
    @GetMapping("/Employees/v1")
    public EmployeeV1 getEmployeesV1(){
        return new EmployeeV1(001, "neha", "ttn");
    }

    //using URI versioning
    @GetMapping("/Employees/v2")
    public EmployeeV2 getEmployeesV2(){
        return new EmployeeV2(001, "neha","neha.gupta@tothenew.com",  "ttn");
    }

    //using Request versioning
    @GetMapping(value = "/Employees/param", params="version=1")
    public EmployeeV1 paramV1(){
        return new EmployeeV1(001, "neha", "ttn");
    }

    //using Request versioning
    @GetMapping(value = "/Employees/param", params = "version=2")
    public EmployeeV2 paramV2(){
        return new EmployeeV2(001, "neha","neha.gupta@tothenew.com",  "ttn");
    }

    //using Header versioning
    @GetMapping(value = "/Employees/header", headers="hver=1")
    public EmployeeV1 headerV1(){
        return new EmployeeV1(001, "neha", "ttn");
    }

    //using Header versioning
    @GetMapping(value = "/Employees/header", headers = "hver=2")
    public EmployeeV2 headerV2(){
        return new EmployeeV2(001, "neha","neha.gupta@tothenew.com",  "ttn");
    }

    //using Producer versioning
    @GetMapping(value = "/Employees/param", produces="application/v1+json")
    public EmployeeV1 mimeV1(){
        return new EmployeeV1(001, "neha", "ttn");
    }

    //using Producer versioning
    @GetMapping(value = "/Employees/param", produces = "application/v2+json")
    public EmployeeV2 mimeV2(){
        return new EmployeeV2(001, "neha","neha.gupta@tothenew.com",  "ttn");
    }
}
