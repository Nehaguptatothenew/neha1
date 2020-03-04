package com.example.SpringAssignmentPractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
class Jvm implements Competency{
    public void getCompetency(){
        System.out.println("This is JVM group");
    }
}
