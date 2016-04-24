package com.dodevjutsu.kata.marsrover;

public class North extends Direction {

    protected North() {
        super("N");
    }

    @Override
    public Direction rotateRight() {
        return Direction.facing("E");
    }

    @Override
    public Direction rotateLeft() {
        return Direction.facing("W");
    }
}
