package ru.job4j.polymorphysm;

public interface Store {
    void save(String data);

    String read();
}
