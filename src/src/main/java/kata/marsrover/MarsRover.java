package kata.marsrover;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class MarsRover {
    int x;
    int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void process(String s) {
        if (s.length() > 0)
            if (s.charAt(0) == 'l') {
                this.direction = direction.turnLeft();
            } else if (s.charAt(0) == 'r') {
                this.direction = direction.turnRight();
            } else if (s.charAt(0) == 'f') {
                if (direction.equals(Direction.NORTH))
                    this.y++;
                else if (direction.equals(Direction.WEST))
                    this.x--;
            }
    }

}

