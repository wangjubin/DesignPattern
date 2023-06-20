package com.botech.designpattern.composite;

/**
 * 员工
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", salary=" + salary +
               '}';
    }
}