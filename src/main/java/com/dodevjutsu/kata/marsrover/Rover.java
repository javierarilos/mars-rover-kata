package com.dodevjutsu.kata.marsrover;

public class Rover {
    private final int x;
    private final int y;
    private Direction direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = Direction.facing(direction);
    }

    public void receive(String sequence) {
        // smell: switch statement
        if (sequence.equals("l")) {
            this.direction = direction.rotateLeft();
        } else if (sequence.equals("r")) {
            this.direction = direction.rotateRight();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (x != rover.x) return false;
        if (y != rover.y) return false;
        return direction.equals(rover.direction);

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
