package com.creational.factory.transport;

import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) {
        System.out.println("Enter mode");
        Scanner scanner = new Scanner(System.in);
        String mode = scanner.nextLine();
        Transport transport;
        if(mode.equals("sea")) {
            transport = new SeaLogisticsFactory().createTransport();
        } else {
            transport = new RoadLogisticsFactory().createTransport();
        }
        transport.deliver();
//        new SeaLogisticsFactory().help();
    }
}
