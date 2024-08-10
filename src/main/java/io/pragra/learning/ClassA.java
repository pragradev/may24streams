package io.pragra.learning;

import java.util.Optional;

public class ClassA {
    public void methodA(){
        ClassB b = new ClassB();
        Optional<Employee> optionalemployee = b.methodB();


        Employee employee1 = optionalemployee.orElseThrow(() -> new RuntimeException("fdsfjsdfsd"));

        if(optionalemployee.isPresent()){
            Employee employee = optionalemployee.get();
            System.out.println(employee.getFirstName());

        }
    }
}
