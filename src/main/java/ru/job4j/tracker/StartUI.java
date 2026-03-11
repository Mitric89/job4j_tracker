package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime createdItem = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = createdItem.format(formatter);
        System.out.println(currentDateTimeFormat);

        Item item1 = new Item("name");
        System.out.println(item1);
    }

}

