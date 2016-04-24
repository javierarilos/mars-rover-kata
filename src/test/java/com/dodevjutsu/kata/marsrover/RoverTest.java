package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    @Test
    public void receiveEmptySequence() {
        Rover rover = getRoverFacing("N");

        rover.receive("");

        assertEquals(getRoverFacing("N"), rover);
    }

    @Test
    public void rotateLeftWhenFacingNorth() {
        Rover rover = getRoverFacing("N");

        rover.receive("l");

        assertEquals(getRoverFacing("W"), rover);
    }

    @Test
    public void rotateLeftWhenFacingWest() {
        Rover rover = getRoverFacing("W");

        rover.receive("l");

        assertEquals(getRoverFacing("S"), rover);
    }

    @Test
    public void rotateLeftWhenFacingSouth() {
        Rover rover = getRoverFacing("S");

        rover.receive("l");

        assertEquals(getRoverFacing("E"), rover);
    }

    @Test
    public void rotateLeftWhenFacingEast() {
        Rover rover = getRoverFacing("E");

        rover.receive("l");

        assertEquals(getRoverFacing("N"), rover);
    }

    @Test
    public void rotateRightWhenFacingNorth() {
        Rover rover = getRoverFacing("N");

        rover.receive("r");

        assertEquals(getRoverFacing("E"), rover);
    }

    @Test
    public void rotateRightWhenFacingEast() {
        Rover rover = getRoverFacing("E");

        rover.receive("r");

        assertEquals(getRoverFacing("S"), rover);
    }

    @Test
    public void rotateRightWhenFacingSouth() {
        Rover rover = getRoverFacing("S");

        rover.receive("r");

        assertEquals(getRoverFacing("W"), rover);
    }

    @Test
    public void rotateRightWhenFacingWest() {
        Rover rover = getRoverFacing("W");

        rover.receive("r");

        assertEquals(getRoverFacing("N"), rover);
    }

    @Test
    public void moveForward() {
        Rover rover = landRoverFacing("N", 0, 0);

        rover.receive("f");

        assertEquals(landRoverFacing("N", 0, 1), rover);
    }

    private Rover getRoverFacing(String direction) {
        return landRoverFacing(direction, 0, 0);
    }

    private Rover landRoverFacing(String direction, int x, int y) {
        return new Rover(x, y, direction);
    }
}
