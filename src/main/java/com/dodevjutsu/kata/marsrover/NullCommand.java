package com.dodevjutsu.kata.marsrover;

public class NullCommand extends Command {
    @Override
    public Vector execute(Vector vector) {
        return vector;
    }
}
