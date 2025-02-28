package org.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
    int id;
    String name;
    int age;
    int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Alex",18,15000));
        employees.add(new Employee(2,"Bob",22,5000));
        employees.add(new Employee(3,"Charlie",30,12000));
        employees.add(new Employee(4,"David",55,21000));

        //Traditional way

//        Collections.sort(employees,new SortEmployeesAsc());
//        System.out.println(employees);
//        Collections.sort(employees,new SortEmployeesDsc());
//        System.out.println(employees);


        //Using Lambda expression

//        Comparator<Employee>employeeComparator = (o1, o2)->o1.getSalary()-o2.getSalary(); ASC
//        Comparator<Employee>employeeComparator = (o1, o2)->o2.getSalary()-o1.getSalary(); DSC

        Collections.sort(employees,((o1, o2) -> o1.getSalary() - o2.getSalary()));
        System.out.println(employees);
        Collections.sort(employees,((o1, o2) -> o2.getSalary() - o1.getSalary()));
        System.out.println(employees);

    }
}

//Traditional way

class SortEmployeesAsc implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

class SortEmployeesDsc implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary() - o1.getSalary();
    }
}
