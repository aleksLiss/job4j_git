package ru.job4j;

public class SystemPrinter implements Printer {

    @Override
    public void print(Person person) {
        System.out.println(person);
    }
}
