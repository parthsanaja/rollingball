package com.rolling.ball.operator;

import com.rolling.ball.Direction;

class ContinueOperator extends DirectionalOperator {

    public Direction getDirection(Direction current) {
        return current;
    }
}
