package com.dodevjutsu.kata.marsrover;

public class East extends Direction {
    protected East() {
        super("E");
    }

    public Direction rotateRight() {
        return Direction.facing("S");
    }

    public Direction rotateLeft() {
        return Direction.facing("N");
    }
}
