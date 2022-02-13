package com.creational.builder.Student;

import com.creational.builder.Student.model.Address;
import com.creational.builder.Student.model.Hostel;

public class Student {
    // Required properties
    private String name;
    private String email;
    private Integer rollNo;

    // Optional Properties
    private Hostel hostel;
    private Address address;
    private Integer age;

    // private constructor so that no can create student object directly
    private Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.rollNo = studentBuilder.rollNo;
        this.hostel = studentBuilder.hostel;
        this.address = studentBuilder.address;
        this.age = studentBuilder.age;
    }

    //All getter, and NO setter to provide immutability
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public Address getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNum=" + rollNo +
                ", hostel=" + hostel +
                ", homeAddress=" + address +
                ", age=" + age +
                ']';
    }

    // can be extracted to different class
    public static class StudentBuilder {
        // Required properties
        private String name;
        private String email;
        private Integer rollNo;

        // Optional Properties
        private Hostel hostel;
        private Address address;
        private Integer age;

        // required properties, therefore only 3 params constructor
        public StudentBuilder(String name, String email, Integer rollNo) {
            this.name = name;
            this.email = email;
            this.rollNo = rollNo;
        }

        public StudentBuilder setHostel(Hostel hostel) {
            this.hostel = hostel;
            return this;
        }

        public StudentBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        //Return the finally constructed Student object
        public Student build() {
            Student student =  new Student(this);
            // can do some validation in Student object if needed
            validateStudentObject(student);
            return  student;
        }

        private boolean validateStudentObject(Student student) {
            //Do some basic validations to check
            //if Student object does not break any assumption of system
            return true;
        }
    }
}
