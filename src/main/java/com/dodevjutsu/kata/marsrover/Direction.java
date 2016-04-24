package com.dodevjutsu.kata.marsrover;

public class Direction {

    private final char representation;

    private Direction(char representation) {
        this.representation = representation;
    }

    public static Direction facing(char representation) {
        return new Direction(representation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return representation == direction.representation;

    }

    @Override
    public int hashCode() {
        return (int) representation;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "representation=" + representation +
                '}';
    }
}
