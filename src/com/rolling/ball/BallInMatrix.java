package com.rolling.ball;

import com.rolling.ball.operator.Operator;

public class BallInMatrix {

    private Position moveTheBall(String[][] m) {
        Position current = new Position(0, 0, Direction.right);
        while (true) {

            Operator operator = Operator.getOperator(m[current.row][current.col]);
            Position newPos = operator.move(current);
            if (Operator.isOutOfMatrix(m, newPos)) {
                break;
            } else {
                current = newPos;
            }
        }

        return current;
    }


    public static void main(String[] args) {

        BallInMatrix matrix = new BallInMatrix();
        String[][] input1 = {
                {"", "", "\\"},
                {"\\", "", ""},
                {"\\", "", "/"}};
        Position exitPos1 = matrix.moveTheBall(input1);
        System.out.println("Exit1:" + exitPos1.row + "," + exitPos1.col);
        String[][] input2 = {
                {"", "", "", "\\",""},
                {"", "", "", "",  ""},
                {"\\", "", "","\\",""}};
        Position exitPos2 = matrix.moveTheBall(input2);
        System.out.println("Exit2:" + exitPos2.row + "," + exitPos2.col);
        String[][] input3 = {
                {"", "", "", "\\",""},
                {"/", "", "", "",  ""},
                {"\\", "", "","/",""}};
        Position exitPos3 = matrix.moveTheBall(input3);
        System.out.println("Exit3:" + exitPos3.row + "," + exitPos3.col);
    }


}

