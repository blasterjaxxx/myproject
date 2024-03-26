package com.example.LearningProject.Code;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyComponent myComponent;

    @GetMapping("validate")
    public String myFunctionValidate(){
        System.out.print("inside myFunctionValidate");
        String output = myComponent.myFunctionValidate();
        return output;
    }

    @PostMapping("set")
    public Boolean setValuesInTable(){
        boolean resp = myComponent.setValuesInDb();
        return resp;
    }

    @GetMapping("result")
    public String getFullNameFromName(){
        String fullName = myComponent.getFullNameFromName();
        return fullName;
    }

}
