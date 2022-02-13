package com.creational.builder.Student;


public class BuilderPattern {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Sakshi", "sakshisubedi@gmail.com", 72)
                .setAge(24).build();
        System.out.println("Student Details - " + student);
    }
}
