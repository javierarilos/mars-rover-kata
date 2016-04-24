package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Direction direction;
    private Point point;

    public Rover(int x, int y, String direction) {
        this.point = new Point(x, y);
        this.direction = Direction.facing(direction);
    }

    public void receive(String sequence) {
        if (sequence.equals("l")) {
            this.direction = direction.rotateLeft();
        } else if (sequence.equals("r")) {
            this.direction = direction.rotateRight();
        } else if (sequence.equals("f")) {
            if (this.direction.equals(Direction.facing("N"))) {
                this.point = this.direction.moveForward(this.point);
            } else if (this.direction.equals(Direction.facing("W"))) {
                this.point = this.direction.moveForward(this.point);
            } else if (this.direction.equals(Direction.facing("S"))) {
                this.point = this.direction.moveForward(this.point);
            } else {
                this.point = this.direction.moveForward(this.point);
            }
        } else if (sequence.equals("b")) {
            if (this.direction.equals(Direction.facing("N"))) {
                this.point = this.point.incrementY(-1);
            } else if (this.direction.equals(Direction.facing("W"))) {
                this.point = this.point.incrementX(1);
            } else if (this.direction.equals(Direction.facing("S"))) {
                this.point = this.point.incrementY(1);
            } else {
                this.point = this.point.incrementX(-1);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return point != null ? point.equals(rover.point) : rover.point == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction=" + direction +
                ", point=" + point +
                '}';
    }
}
