package com.dodevjutsu.kata.marsrover;

public class Vector {
    private final Point point;
    private final Direction direction;

    public Vector(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Vector rotateLeft() {
        return new Vector(point, direction.rotateLeft());
    }

    public Vector rotateRight() {
        return new Vector(point, direction.rotateRight());
    }

    public Vector moveForward() {
        return new Vector(direction.moveForward(point), direction);
    }

    public Vector moveBackwards() {
        return new Vector(direction.moveBackwards(point), direction);
    }
}
