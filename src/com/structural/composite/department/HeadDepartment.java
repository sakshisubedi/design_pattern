package com.structural.composite.department;

import java.util.ArrayList;
import java.util.List;

/**
 * The Container (aka composite) is an element that has sub-elements: leaves or other containers.
 * A container doesn’t know the concrete classes of its children.
 * It works with all sub-elements only via the component interface.
 *
 * Upon receiving a request, a container delegates the work to its sub-elements,
 * processes intermediate results and then returns the final result to the client.
 *
 * It has leaf elements. It implements the base component methods and defines the child-related operations.
 */
public class HeadDepartment implements Department{
    private int id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        for (Department department: childDepartments) {
            department.printDepartmentName();
        }
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
