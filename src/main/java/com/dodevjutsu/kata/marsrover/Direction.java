package com.dodevjutsu.kata.marsrover;

public class Direction {

    private final String representation;

    private Direction(String representation) {
        this.representation = representation;
    }

    public void rotateLeft() {
    }

    public static Direction facing(String representation) {
        return new Direction(representation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return representation != null ? representation.equals(direction.representation) : direction.representation == null;

    }

    @Override
    public int hashCode() {
        return representation != null ? representation.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "representation=" + representation +
                '}';
    }
}
