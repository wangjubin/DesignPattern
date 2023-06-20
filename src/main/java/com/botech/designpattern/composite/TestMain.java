package com.botech.designpattern.composite;

/**
 * 测试主要
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class TestMain {

    private static final long ORGANIZATION_ROOT_ID = 1001;

    public static void main(String[] args) {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        Department department = new Department(1002);
        rootDepartment.addSubNode(department);
        department.addSubNode(new Employee(1, 1000L));
        department.addSubNode(new Employee(2, 2000L));
        System.out.println(rootDepartment);
        System.out.println(rootDepartment.calculateSalary());
    }
}
