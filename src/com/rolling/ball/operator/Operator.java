package com.rolling.ball.operator;


import com.rolling.ball.Position;

public interface Operator {

    String Fwd = "/";
    String Bkwd = "\\";

    Position move(Position current);

    static Operator getOperator(String val) {
        return switch (val) {
            case Fwd -> new FwdOperator();
            case Bkwd -> new BkwdOperator();
            default -> new ContinueOperator();
        };
    }

    static boolean isOutOfMatrix(String[][] m, Position current) {
        return current.getRow() < 0 || current.getRow() >= m.length
                || current.getCol() < 0 || current.getCol() >= m[0].length;
    }

}
