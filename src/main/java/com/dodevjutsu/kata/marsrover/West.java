package com.dodevjutsu.kata.marsrover;

public class West extends Direction {

    protected West() {
        super("W");
    }

    public Direction rotateRight() {
        return Direction.facing("N");
    }

    public Direction rotateLeft() {
        return Direction.facing("S");
    }
}
