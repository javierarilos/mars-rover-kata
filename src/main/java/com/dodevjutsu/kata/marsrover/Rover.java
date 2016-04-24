package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = new Vector(new Point(x, y), Direction.facing(direction));
    }

    public void receive(String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            String command = parseCommand(sequence, i);
            execute(command);
        }
    }

    private String parseCommand(String sequence, int i) {
        String value = sequence.substring(i, i + 1);
        Command command = Command.create(value);
        return value;
    }

    private void execute(String command) {
        if (command.equals("l")) {
            this.vector = vector.rotateLeft();
        } else if (command.equals("r")) {
            this.vector = vector.rotateRight();
        } else if (command.equals("f")) {
            this.vector = vector.moveForward();
        } else if (command.equals("b")) {
            this.vector = vector.moveBackwards();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }

    @Override
    public int hashCode() {
        return vector != null ? vector.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "vector=" + vector +
                '}';
    }
}
