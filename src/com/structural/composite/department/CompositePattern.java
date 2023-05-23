package com.structural.composite.department;

/**
 * The Client works with all elements through the component interface.
 * As a result, the client can work in the same way with both simple or complex elements of the tree.
 * It has access to the composition elements by using the base component (common interface) object.
 */
public class CompositePattern {
    public static void main(String[] args) {
        Department financialDepartment = new FinancialDepartment();
        Department salesDepartment = new SalesDepartment();
        HeadDepartment headDepartment = new HeadDepartment(3, "Head Department");

        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.printDepartmentName();
    }
}
