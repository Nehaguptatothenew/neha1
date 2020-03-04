package com.example.SpringAssignmentPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootCampApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BootCampApplication.class, args);
        ApplicationContext applicationContext=SpringApplication.run(BootCampApplication.class ,args);
        Trainee emp=applicationContext.getBean(Trainee.class);
        emp.setId(3999);
        emp.setName("neha");
        System.out.println(emp.toString());
        emp.showCompetency();


        Trainee emp1=new Trainee();
        emp1.setId(3999);
        emp1.setName("neha");
        System.out.println(emp1.toString());
        emp1.setCompetency1();
    }

}
