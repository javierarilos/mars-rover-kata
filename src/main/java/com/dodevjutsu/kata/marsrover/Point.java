package com.dodevjutsu.kata.marsrover;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point incrementY(int i) {
        return new Point(x, y + i);
    }
}
