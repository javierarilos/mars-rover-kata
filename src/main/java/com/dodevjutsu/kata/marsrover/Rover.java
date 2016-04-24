package com.dodevjutsu.kata.marsrover;

public class Rover {
    private final int x;
    private final int y;
    private char direction;
    private Direction typedDirection;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.setDirection(direction);
    }

    public void receive(String sequence) {
        // smell: switch statement
        if (sequence.equals("l")) {
            if (this.getDirection() == 'N') {
                this.setDirection('W');
            } else if (this.getDirection() == 'W') {
                this.setDirection('S');
            } else if (this.getDirection() == 'S') {
                this.setDirection('E');
            } else if (this.getDirection() == 'E') {
                this.setDirection('N');
            }
        } else if (sequence.equals("r")) {
            if (this.getDirection() == 'N') {
                this.setDirection('E');
            } else if (this.getDirection() == 'W') {
                this.setDirection('N');
            } else if (this.getDirection() == 'S') {
                this.setDirection('W');
            } else if (this.getDirection() == 'E') {
                this.setDirection('S');
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
        return getDirection() == rover.getDirection();

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (int) getDirection();
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + getDirection() +
                '}';
    }

    private char getDirection() {
        return direction;
    }

    private void setDirection(char direction) {
        this.direction = direction;
        this.typedDirection = Direction.facing(direction);
    }
}
