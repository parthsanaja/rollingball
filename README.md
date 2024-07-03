How to use:
BallInMatrix is entry point for solution.
Refer below code snippet as example
{code}
        BallInMatrix matrix = new BallInMatrix();
        String[][] input1 = {
                {"", "", "\\"},
                {"\\", "", ""},
                {"\\", "", "/"}};
        Position exitPos1 = matrix.moveTheBall(input1);
        System.out.println("Exit1:" + exitPos1.row + "," + exitPos1.col);
{code}
