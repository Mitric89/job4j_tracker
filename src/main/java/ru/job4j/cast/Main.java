package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus1 = new Bus();
        Vehicle plane1 = new Plane();

        Vehicle[] vehicles = new Vehicle[]{
                bus, bus1, plane, plane1, train
        };
        for (Vehicle obj : vehicles) {
            obj.move();
        }
    }
}
