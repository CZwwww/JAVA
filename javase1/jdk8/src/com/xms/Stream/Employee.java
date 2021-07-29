package com.xms.Stream;

/**
 * @author czw
 * @create 2021-06-28-下午 2:36
 */
enum Status{
    //空闲
    FREE,
    //繁忙
    BUSY,
    //休假
    VOCATION;
}
public class Employee {
    String name;
    double salary;
    Status status;
    public Employee(){}

    public Employee(String name, double salary, Status status) {
        this.name = name;
        this.salary = salary;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }
}
