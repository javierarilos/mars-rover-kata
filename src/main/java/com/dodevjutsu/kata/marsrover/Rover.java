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
            direction.rotateRight();
            if (direction.equals(Direction.facing("N"))) {
                this.direction = Direction.facing("E");
            } else if (direction.equals(Direction.facing("W"))) {
                this.direction = Direction.facing("N");
            } else if (direction.equals(Direction.facing("S"))) {
                this.direction = Direction.facing("W");
            } else if (direction.equals(Direction.facing("E"))) {
                this.direction = Direction.facing("S");
            }
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
