package com.creational.factory.polygon;

public class FactoryPattern {
    public static void main(String[] args) {
        PolygonFactory polygonFactory = new PolygonFactory();
        Polygon polygon = polygonFactory.getPolygon(3);
        polygon.print();

        polygon = polygonFactory.getPolygon(4);
        polygon.print();

        polygon = polygonFactory.getPolygon(5);
        polygon.print();
    }
}
