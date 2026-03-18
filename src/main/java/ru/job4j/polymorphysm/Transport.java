package ru.job4j.polymorphysm;

public interface Transport {
    void move();

    void passengers(int count);

    int refuel(int fuel);
}