package com.creational.factory.transport;

import java.util.Scanner;

/**
 * Concrete Creators override the base factory method so it returns a different type of product.
 *
 * Note that the factory method doesn’t have to create new instances all the time.
 * It can also return existing objects from a cache, an object pool, or another source.
 */
public class RoadLogisticsFactory extends LogisticsFactory {
    @Override
    Transport createTransport() {
        System.out.println("Select Choice");
        System.out.println("1. Truck");
        System.out.println("2. Train");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        if(type == 1) {
            return new Truck();
        }
        return new Train();
    }
}
