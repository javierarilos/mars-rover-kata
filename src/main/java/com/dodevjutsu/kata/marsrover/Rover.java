package com.dodevjutsu.kata.marsrover;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = Direction.facing(direction);
    }

    public void receive(String sequence) {
        if (sequence.equals("l")) {
            this.direction = direction.rotateLeft();
        } else if (sequence.equals("r")) {
            this.direction = direction.rotateRight();
        } else if (sequence.equals("f")) {
            if (this.direction.equals(Direction.facing("N"))) {
                this.y += 1;
            } else if (this.direction.equals(Direction.facing("W"))) {
                this.x -= 1;
            } else if (this.direction.equals(Direction.facing("S"))) {
                this.y -= 1;
            } else {
                this.x += 1;
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
