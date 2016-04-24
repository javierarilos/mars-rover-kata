package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    @Test
    public void receiveEmptySequence() {
        Rover rover = getRoverFacing('N');

        rover.receive("");

        assertEquals(getRoverFacing('N'), rover);
    }

    @Test
    public void rotateLeftCommandWhenFacingNorth() {
        Rover rover = getRoverFacing('N');

        rover.receive("l");

        assertEquals(getRoverFacing('W'), rover);
    }

    @Test
    public void rotateLeftWhenFacingWest() {
        Rover rover = getRoverFacing('W');

        rover.receive("l");

        assertEquals(getRoverFacing('S'), rover);
    }

    private Rover getRoverFacing(char direction) {
        return new Rover(0, 0, direction);
    }
}
