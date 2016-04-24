package com.dodevjutsu.kata.marsrover;

public class South extends Direction {

    public Direction rotateRight() {
        return Direction.facing("W");
    }

    public Direction rotateLeft() {
        return Direction.facing("E");
    }

    @Override
    public Point moveForward(Point point) {
        return point.incrementY(-1);
    }
}
