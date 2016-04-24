package com.dodevjutsu.kata.marsrover;

public class West extends Direction {

    public Direction rotateRight() {
        return Direction.facing("N");
    }

    public Direction rotateLeft() {
        return Direction.facing("S");
    }

    @Override
    public Point moveForward(Point point, int movement) {
        return point;
    }
}
