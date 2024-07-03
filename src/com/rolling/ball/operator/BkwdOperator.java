package com.rolling.ball.operator;

import com.rolling.ball.Direction;

class BkwdOperator extends DirectionalOperator {

    public Direction getDirection(Direction current) {
        return switch (current) {
            case up -> Direction.left;
            case down -> Direction.right;
            case left -> Direction.up;
            case right -> Direction.down;
        };
    }
}
