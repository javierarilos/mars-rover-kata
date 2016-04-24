package com.dodevjutsu.kata.marsrover;

public class MoveForward extends Command {
    @Override
    public Vector execute(Vector vector) {
        return vector.moveForward();
    }
}
