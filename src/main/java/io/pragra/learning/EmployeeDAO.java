package io.pragra.learning;

import java.util.Optional;

public class EmployeeDAO {
    public Optional<Employee> getEmployeeById(){
        // gettting from DB - repo
        // use Optional
        Employee emp = Employee.builder().firstName("Summer").lastName("Macintosh").build();
        Optional<Employee> optionalEmployee = Optional.ofNullable(emp);
        return optionalEmployee;
    }
}
