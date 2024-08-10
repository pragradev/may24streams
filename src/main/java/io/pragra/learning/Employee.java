package io.pragra.learning;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private Integer empId;
    private String firstName;
    private String lastName;
    private Integer salary;
    private String company;
}
