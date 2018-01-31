package kata.marsrover;


public enum Direction {
    NORTH {
        Direction turnLeft() {
            return WEST;
        }

        Direction turnRight() {
            return EAST;
        }
    }, WEST {
        Direction turnLeft() {
            return SOUTH;
        }

        Direction turnRight() {
            return NORTH;
        }
    }, SOUTH {
        Direction turnLeft() {
            return EAST;
        }

        Direction turnRight() {
            return WEST;
        }
    }, EAST {
        Direction turnLeft() {
            return NORTH;
        }

        Direction turnRight() {
            return SOUTH;
        }
    };

    abstract Direction turnLeft();
    abstract Direction turnRight();

}
