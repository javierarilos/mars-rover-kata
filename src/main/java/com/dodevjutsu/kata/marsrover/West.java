package com.dodevjutsu.kata.marsrover;

public class West extends Direction {

    protected West() {
        super("W");
    }

    @Override
    public Direction rotateRight() {
        return Direction.facing("N");
    }

    @Override
    public Direction rotateLeft() {
        return Direction.facing("S");
    }
}
