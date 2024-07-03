package com.rolling.ball;

import com.rolling.ball.Direction;

public class Position {
    int row;
    int col;
    Direction direction;

    public Position(int row, int col, Direction direction) {
        this.row = row;

        this.col = col;

        this.direction = direction;

    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                ", direction=" + direction +
                '}';
    }
}
