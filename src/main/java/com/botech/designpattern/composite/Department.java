package com.botech.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class Department extends HumanResource {
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (HumanResource hr : subNodes) {
            totalSalary += hr.calculateSalary();
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNode(HumanResource hr) {
        subNodes.add(hr);
    }

    @Override
    public String toString() {
        return "Department{" +
               "subNodes=" + subNodes +
               ", id=" + id +
               ", salary=" + salary +
               '}';
    }
}