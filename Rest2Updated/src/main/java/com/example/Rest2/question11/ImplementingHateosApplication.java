// Configure hateoas with your springboot application. Create an api which returns User Details along with url to show all topics.
package com.example.Rest2.question11;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ImplementingHateosApplication {

    public static void main(String[] args) {

        SpringApplication.run(ImplementingHateosApplication.class, args);
    }


}
