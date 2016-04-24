package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = new Vector(new Point(x, y), Direction.facing(direction));
    }

    public void receive(String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            String command = parseCommand(sequence, i);
            executeCommand(command);

            Command typedCommand = parse(sequence, i);
            execute(typedCommand);
        }
    }

    private Command parse(String sequence, int i) {
        String value = sequence.substring(i, i + 1);
        return Command.create(value);
    }

    private String parseCommand(String sequence, int i) {
        String value = sequence.substring(i, i + 1);
        return value;
    }

    private void executeCommand(String command) {
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

    private void execute(Command typedCommand) {
        typedCommand.execute(this.vector);
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
