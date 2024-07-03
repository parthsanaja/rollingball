package com.rolling.ball.operator;

import com.rolling.ball.Direction;
import com.rolling.ball.Position;

abstract class DirectionalOperator implements Operator {

    abstract Direction getDirection(Direction current);

    public Position move(Position current) {
        Direction newDirection = getDirection(current.getDirection());
        int row = current.getRow();
        int col = current.getCol();
        switch (newDirection) {
            case left -> col--;
            case right -> col++;
            case up -> row--;
            case down -> row++;
        }
        return new Position(row, col, newDirection);
    }
}
