package com.dodevjutsu.kata.marsrover;

public class Vector {
    private final Point point;
    private final Direction direction;

    public Vector(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Vector rotateLeft() {
        return this;
    }

    public Vector rotateRight() {
        return this;
    }

    public Vector moveForward() {
        return this;
    }

    public Vector moveBackwards() {
        return this;
    }
}
