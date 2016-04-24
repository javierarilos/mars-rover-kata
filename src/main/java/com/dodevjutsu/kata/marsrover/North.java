package com.dodevjutsu.kata.marsrover;

public class North extends Direction {

    public Direction rotateRight() {
        return Direction.facing("E");
    }

    public Direction rotateLeft() {
        return Direction.facing("W");
    }
}
