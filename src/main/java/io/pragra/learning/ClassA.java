package io.pragra.learning;

import java.util.Optional;

public class ClassA {
    public Employee methodA(){
        ClassB b = new ClassB();
        Optional<Employee> optionalEmployee = b.retrieveEmployee();
// default emp/ empty employee

        // either provide actual employee or throw an error

        return optionalEmployee.orElseThrow(() -> new RuntimeException("Employee not existing"));

//        if(optionalEmployee.isPresent()){
//            return optionalEmployee.get();
//        }else {
//            throw new RuntimeException("Employee not existing");
//        }



        // employee that we retrieved we need to pass it to frontend



    }
}
