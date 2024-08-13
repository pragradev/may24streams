package io.pragra.learning;

import java.util.Optional;

public class ClassB {
    public Optional<Employee> retrieveEmployee(){
        // Retriving employee from DB
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Optional<Employee> optionalEmployee = employeeDAO.getEmployeeById();
        return optionalEmployee;
    }
}
