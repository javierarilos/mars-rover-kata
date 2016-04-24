package com.dodevjutsu.kata.marsrover;

public class MoveBackwards extends Command {
    @Override
    public Vector execute(Vector vector) {
        return vector.moveBackwards();
    }
}
