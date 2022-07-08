package com.structural.composite.department;

/**
 * The Leaf is a basic element of a tree that doesn’t have sub-elements.
 * Usually, leaf components end up doing most of the real work, since they don’t have anyone to delegate the work to.
 * It implements the default behavior of the base component. It doesn't contain a reference to the other objects.
 */
public class SalesDepartment implements Department{

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
