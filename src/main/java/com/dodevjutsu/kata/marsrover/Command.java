package com.dodevjutsu.kata.marsrover;

public class Command {
    private String value;

    private Command(String value) {
        this.value = value;
    }

    public static Command create(String value) {
        return new Command(value);
    }
}
