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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (point != null ? !point.equals(vector.point) : vector.point != null) return false;
        return direction != null ? direction.equals(vector.direction) : vector.direction == null;

    }

    @Override
    public int hashCode() {
        int result = point != null ? point.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "point=" + point +
                ", direction=" + direction +
                '}';
    }
}
