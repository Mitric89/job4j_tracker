package ru.job4j.polymorphysm;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Макс. число пассажиров - " + count);
    }

    @Override
    public int refuel(int fuel) {
        int pricePerLiter = 80;
        return fuel * pricePerLiter;
    }
}