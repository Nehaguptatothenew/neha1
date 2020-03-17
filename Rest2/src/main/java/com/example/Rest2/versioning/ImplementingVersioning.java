// 10. Create 2 API for showing user details. The first api should return only basic details of the user and the other API should return more/enhanced details of the user,
//Now apply versioning using the following methods:
//MimeType Versioning
//Request Parameter versioning
//URI versioning
//Custom Header Versioning
package com.example.Rest2.versioning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImplementingVersioning {

    public static void main(String[] args) {

        SpringApplication.run(ImplementingVersioning.class, args);
    }


}
