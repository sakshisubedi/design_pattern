package com.behavioral.templatemethod.employee;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        System.out.println("FireFighter");
        Worker firefighter = new FireFighter();
        firefighter.dailyRoutine();

        System.out.println("\nLumberjack");
        Worker lumberjack = new Lumberjack();
        lumberjack.dailyRoutine();

        System.out.println("\nManager");
        Worker manager = new Manager();
        manager.dailyRoutine();

        System.out.println("\nPostman");
        Worker postman = new Postman();
        postman.dailyRoutine();
    }
}
