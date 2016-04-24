package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = new Vector(new Point(x, y), Direction.facing(direction));
    }

    public void receive(String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            Command typedCommand = parse(sequence, i);
            execute(typedCommand);
        }
    }

    private Command parse(String sequence, int i) {
        String value = sequence.substring(i, i + 1);
        return Command.create(value);
    }

    private void execute(Command typedCommand) {
        this.vector = typedCommand.execute(this.vector);
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
