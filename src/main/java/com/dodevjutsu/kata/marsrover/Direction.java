package com.dodevjutsu.kata.marsrover;

public class Direction {

    private final char representation;

    private Direction(char representation) {
        this.representation = representation;
    }

    public static Direction facing(char representation) {
        return new Direction(representation);
    }
}
