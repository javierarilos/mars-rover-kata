package com.dodevjutsu.kata.marsrover;

public class East extends Direction {
    protected East() {
        super("E");
    }

    @Override
    public Direction rotateRight() {
        return Direction.facing("S");
    }

    @Override
    public Direction rotateLeft() {
        return Direction.facing("N");
    }
}
