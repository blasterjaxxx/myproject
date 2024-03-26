package com.example.LearningProject.Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadPoolExecutor;

@Component
public class MyComponent {

    @Autowired
    FirstTableRepo firstTableRepo;

    public String myFunctionValidate(){
        System.out.print("inside myFunctionValidate");
        return "hello";
    }

    public Boolean setValuesInDb(){
        String name = "Sparsh";
        String fullName = "Sparsh Duggal";

        FirstTable firstTable = new FirstTable();
        firstTable.setName(name);
        firstTable.setFullName(fullName);

        firstTableRepo.save(firstTable);
        return true;
    }


    public String getFullNameFromName(){
        String name = firstTableRepo.findByName("Sparsh").getFullName();
        return name;
    }
}
