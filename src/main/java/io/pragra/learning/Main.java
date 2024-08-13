package io.pragra.learning;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ClassA objA = new ClassA();
        objA.methodA();

        //Streams
        //Intermidatroy
        //terminatory

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,66,55,44,66,77,88,99,88,77,66,55,66,77,88,99,88,77));
        Stream<Integer> integerStream = numbers.stream();
        numbers.stream().filter(x -> x%2==0).filter(x -> x%11==0);
        Map<Integer, String> collect = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x % 11 == 0)
                .distinct()

                .collect(Collectors.toMap(k -> k, v -> "Number: ".concat(String.valueOf(v))));
        System.out.println(collect);

        List<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        Employee.builder().empId(1).firstName("Divyesh").lastName("A").company("Banana").salary(120000).build(),
                        Employee.builder().empId(2).firstName("Pranshi").lastName("G").company("TD").salary(110000).build(),
                        Employee.builder().empId(3).firstName("Ankush").lastName("J").company("RBC").salary(100000).build(),
                        Employee.builder().empId(4).firstName("Navjot").lastName("S").company("Scotia").salary(125000).build(),
                        Employee.builder().empId(4).firstName("Sonal").lastName("S").company("Scotia").salary(125000).build(),
                        Employee.builder().empId(4).firstName("Madhumitha").lastName("S").company("Scotia").salary(125000).build(),
                        Employee.builder().empId(5).firstName("Bavneet").lastName("S").company("CIBC").salary(130000).build()
                )
        );

        Optional<Employee> optional = employees.stream().filter(e -> e.getSalary() == 125000).findAny();
        if(optional.isPresent()){
            System.out.println("emplpoyee exist");
        } else {
            System.out.println("emp doesnot exist");
        }


        Integer reduce = employees.stream().filter(e -> e.getSalary() < 125000).map(e -> {
            e.setSalary((int) (e.getSalary() * 1.05));
            return e;
        }).map(e -> e.getSalary())

                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce);






        Employee employee = Employee.builder().empId(2).firstName("Pranshi").lastName("G").company("TD").salary(110000).build();
        // any condition : constant always goes first
        String abc = "    ";
//         if(null !=  abc && StringUtils.isNotBlank(abc))
        if(employee.getFirstName() != null && Objects.nonNull(abc)){

        }




        MortgageCalculator mortgageCalculator = new MortgageCalculator();

        RBCMortgageRenewals RBCrenewals = new RBCMortgageRenewals();

        mortgageCalculator.mortgageRenewals(3,
                1.053,
                RBCMortgageRenewals::RBCRenewals
                );

        mortgageCalculator.mortgageRenewals(3,
                1.053,
                (a,b)-> b
                );


        //mortgageCalculator.mortgageRenewals(3, 1.053, (x,y) -> 8*x*y);

    }
}