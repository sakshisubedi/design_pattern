package com.creational.prototype;

public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.loadData();

        System.out.println("Employee 1 " + emp1.toString());

        Employee emp2 = (Employee) emp1.clone();
        System.out.println("Employee 2 " + emp2.toString());
        emp2.remove(2);

        Employee emp3 = (Employee) emp1.clone();
        System.out.println("Employee 3 " + emp3.toString());
        emp3.add("XYZ");

        System.out.println("Employee 1 " + emp1.toString());
        System.out.println("Employee 2 " + emp2.toString());
        System.out.println("Employee 3 " + emp3.toString());
    }
}
