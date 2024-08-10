package io.pragra.learning;

import java.util.Optional;

public class ClassB {
    public Optional<Employee> methodB(){
        Optional<Employee> optionalEmployee = Optional.ofNullable(Employee.builder().firstName("Atin").build());
        // getting Employee object from database
        return optionalEmployee;
    }
}
