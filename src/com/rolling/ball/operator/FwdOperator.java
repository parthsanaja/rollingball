package com.rolling.ball.operator;

import com.rolling.ball.Direction;

class FwdOperator extends DirectionalOperator {
    public Direction getDirection(Direction current) {
        return switch (current) {
            case up -> Direction.right;
            case down -> Direction.left;
            case left -> Direction.down;
            case right -> Direction.up;
        };
    }
}
