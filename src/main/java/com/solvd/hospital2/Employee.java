package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Employee {

    private static final Logger LOGGER = LogManager.getLogger(Employee.class);

    private String name;
    private JobTitle position;
    private Integer age;

    public Employee(String name, JobTitle position, Integer age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitle getPosition() {
        return position;
    }

    public void setPosition(JobTitle position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Michael Madson", JobTitle.CHIEF_DOCTOR, 43),
                new Employee("Don Carleone", JobTitle.DOCTOR, 54),
                new Employee("Anna Brandt", JobTitle.NURSE, 18),
                new Employee("Victoria Silver", JobTitle.NURSE, 19),
                new Employee("Mark Henderson", JobTitle.LABORATORY_ASSISTANT, 22),
                new Employee("Carina James", JobTitle.DOCTOR, 36)
        ));

        List<String> nurseNames = employees.stream().filter(x -> x.position.equals(JobTitle.NURSE))
                .map(x -> x.name)
                .collect(Collectors.toList());
        LOGGER.info(nurseNames);

        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .peek(employee -> employee.setAge(18))
                .map(employee -> String.format("%s %s", employee.getName(), employee.getAge()))
                .forEach(LOGGER::info);

        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(LOGGER::info);

        IntStream intStream = IntStream.of(100, 200, 300, 400);
        intStream.reduce(Integer::sum).orElse(0);

        IntStream intStream1 = IntStream.of(100, 200, 300, 400);
        OptionalInt opt = intStream1.filter(x -> x > 200).findFirst();
        opt.orElseThrow(() -> new RuntimeException("No value"));
        LOGGER.info(opt.getAsInt());

    }
}

