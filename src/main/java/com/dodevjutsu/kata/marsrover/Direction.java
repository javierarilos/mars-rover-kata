package com.dodevjutsu.kata.marsrover;

public abstract class Direction {

    public abstract Direction rotateLeft();

    public abstract Direction rotateRight();

    public Point moveForward(Point point, int movement) {
        return point;
    }

    public static Direction facing(String representation) {
        if (representation.equals("N")) {
            return new North();
        } else if (representation.equals("W")) {
            return new West();
        } else if (representation.equals("S")) {
            return new South();
        }

        return new East();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
