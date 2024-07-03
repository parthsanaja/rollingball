
Illustration of Problem Statement:
![Illustration](https://github.com/parthsanaja/rollingball/blob/master/roll-boll-illustration.jpeg?raw=true)


How to use the code and output:
BallInMatrix is entry point for solution.
Refer below code snippet as example
```
        BallInMatrix matrix = new BallInMatrix();
        String[][] input1 = {
                {"", "", "\\"},
                {"\\", "", ""},
                {"\\", "", "/"}};
        Position exitPos1 = matrix.moveTheBall(input1);
        System.out.println("Exit1:" + exitPos1.row + "," + exitPos1.col);
```
