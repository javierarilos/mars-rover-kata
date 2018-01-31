package kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanaryTest {
    @Test
    public void positive() {
        assertEquals(true, true);
    }

    @Test
    public void emptyMovement() {
        MarsRover rover = getRoverFacing(Direction.NORTH);

        rover.process("");

        assertEquals(getRoverFacing(Direction.NORTH), rover);
    }

    @Test
    public void rotateLeftWhenFacingNorth() {
        MarsRover rover = getRoverFacing(Direction.NORTH);

        rover.process("l");

        assertEquals(getRoverFacing(Direction.WEST), rover);
    }

    @Test
    public void rotateLeftWhenFacingWest() {
        MarsRover rover = getRoverFacing(Direction.WEST);

        rover.process("l");

        assertEquals(getRoverFacing(Direction.SOUTH), rover);
    }

    @Test
    public void rotateLeftWhenFacingSouth() {
        MarsRover rover = getRoverFacing(Direction.SOUTH);

        rover.process("l");

        assertEquals(getRoverFacing(Direction.EAST), rover);
    }

    @Test
    public void rotateLeftWhenFacingEast() {
        MarsRover rover = getRoverFacing(Direction.EAST);

        rover.process("l");

        assertEquals(getRoverFacing(Direction.NORTH), rover);
    }

    @Test
    public void rotateRightWhenFacingNorth() {
        MarsRover rover = getRoverFacing(Direction.NORTH);

        rover.process("r");

        assertEquals(getRoverFacing(Direction.EAST), rover);
    }

    @Test
    public void rotateRightWhenFacingEast() {
        MarsRover rover = getRoverFacing(Direction.EAST);

        rover.process("r");

        assertEquals(getRoverFacing(Direction.SOUTH), rover);
    }

    @Test
    public void rotateRightWhenFacingSouth() {
        MarsRover rover = getRoverFacing(Direction.SOUTH);

        rover.process("r");

        assertEquals(getRoverFacing(Direction.WEST), rover);
    }

    @Test
    public void rotateRightWhenFacingWest() {
        MarsRover rover = getRoverFacing(Direction.WEST);

        rover.process("r");

        assertEquals(getRoverFacing(Direction.NORTH), rover);
    }

    @Test
    public void moveForwardWhenFacingNorth() {
        MarsRover rover = getRoverFacing(0, 0, Direction.NORTH);

        rover.process("f");

        assertEquals(
                getRoverFacing(0, 1, Direction.NORTH),
                rover
        );
    }

    @Test
    public void moveForwardWhenFacingWest() {
        MarsRover rover = getRoverFacing(0, 0, Direction.WEST);

        rover.process("f");

        assertEquals(
                getRoverFacing(-1, 0, Direction.WEST),
                rover
        );
    }

    public MarsRover getRoverFacing(Direction direction) {
        return getRoverFacing(0, 0, direction);
    }

    public MarsRover getRoverFacing(int x, int y, Direction direction) {
        return new MarsRover(x, y, direction);
    }


}
