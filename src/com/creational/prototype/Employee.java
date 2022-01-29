package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
    private List<String> empList;

    public Employee() {
        empList = new ArrayList<>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    // from DB
    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Sunil");
        empList.add("Twisha");
        empList.add("Sakshi");
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void remove(int index) {
        if(index>=0 && index<empList.size()) {
            empList.remove(index);
        } else {
            System.out.println("Index out of bound");
        }
    }

    public void add(String emp) {
        empList.add(emp);
    }

    // Return type can also be Employee instead of object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // deep copy
        List<String> cloneEmp = new ArrayList<>();
        for(String emp: this.getEmpList()) {
            cloneEmp.add(emp);
        }
        return new Employee(cloneEmp);
    }

    @Override
    public String toString() {
        String employee = "";
        for(String emp: this.getEmpList()) {
            employee += emp + " ";
        }
        return employee;
    }
}
