package com.dodevjutsu.kata.marsrover;

public class East extends Direction {

    public Direction rotateRight() {
        return Direction.facing("S");
    }

    public Direction rotateLeft() {
        return Direction.facing("N");
    }
}