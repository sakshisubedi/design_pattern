package com.structural.composite.department;

/**
 * The Component interface describes operations that are common to both simple and complex elements of the tree.
 * It is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.
 */
public interface Department {
    void printDepartmentName();
}
