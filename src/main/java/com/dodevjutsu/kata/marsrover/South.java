package com.dodevjutsu.kata.marsrover;

public class South extends Direction {
    protected South() {
        super("S");
    }

    public Direction rotateRight() {
        return Direction.facing("W");
    }

    public Direction rotateLeft() {
        return Direction.facing("E");
    }
}
