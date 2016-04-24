package com.dodevjutsu.kata.marsrover;

public class Rover {
    private final int x;
    private final int y;
    private char direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void receive(String sequence) {
        if (sequence.equals("l")) {
            // smell: switch statement
            if (this.direction == 'N') {
                this.direction = 'W';
            } else if (this.direction == 'W') {
                this.direction = 'S';
            } else if (this.direction == 'S') {
                this.direction = 'E';
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
        return direction == rover.direction;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (int) direction;
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
