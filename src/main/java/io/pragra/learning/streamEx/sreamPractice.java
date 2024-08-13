package io.pragra.learning.streamEx;

import io.pragra.learning.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sreamPractice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        Student.builder().studentId(1L).firstName("Tom").lastName("Ford").courses(List.of("Core Java","Math","Hibernate")).build(),
                        Student.builder().studentId(2L).firstName("Marc").lastName("Jacob").courses(List.of("Science","Math","Hibernate","Technology","Astronomy")).build(),
                        Student.builder().studentId(3L).firstName("Sachin").lastName("T").courses(List.of("Python","Math","Hibernate","Data brick","Snowflake")).build()
               )
        );
        // concat "ABC" string to all student's courses and print those
        // flatmap -> to flatten the stream (List<List<String>>)
        students.stream().flatMap( student -> student.getCourses().stream()).sorted( (s1,s2) -> s2.compareTo(s1) ).distinct().forEach(course -> System.out.println(course));

        //s1.compareTo(s2) -> +ve , -ve
        // a = 5 b=11 b-a +ve ||  a =11 b=5 b-a -ve flip the eliment
        // comparator : int
        //students.stream().map(student -> student.getFirstName().concat("ABC")).forEach(firstname -> System.out.println(firstname));
    }
}
