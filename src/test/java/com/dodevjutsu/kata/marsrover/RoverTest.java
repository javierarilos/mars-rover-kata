package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    @Test
    public void receiveEmptySequence() {
        Rover rover = new Rover(0, 0, 'N');

        rover.receive("");

        assertEquals(new Rover(0, 0, 'N'), rover);
    }

    @Test
    public void rotateLeftCommandWhenFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');

        rover.receive("l");

        assertEquals(new Rover(0, 0, 'W'), rover);
    }

    @Test
    public void rotateLeftWhenFacingWest() {
        Rover rover = new Rover(0, 0, 'W');

        rover.receive("l");

        assertEquals(new Rover(0, 0, 'S'), rover);
    }
}
