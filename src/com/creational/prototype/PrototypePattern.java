package com.creational.prototype;

/**
 * The Client can produce a copy of any object that follows the prototype interface.
 */
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.loadData();
        System.out.println("Employee 1 " + emp1);

        //Cloning emp1 in emp2
        Employee emp2 = (Employee) emp1.clone();
        System.out.println("Employee 2 " + emp2);
        // removing employee from emp2
        emp2.remove(2);

        //Cloning emp1 in emp3
        Employee emp3 = (Employee) emp1.clone();
        System.out.println("Employee 3 " + emp3);
        // adding employee from emp3
        emp3.add("XYZ");

        System.out.println("Employee 1 " + emp1);
        System.out.println("Employee 2 " + emp2);
        System.out.println("Employee 3 " + emp3);
    }
}
