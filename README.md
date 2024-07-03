
Illustration of Problem Statement:
![Illustration](https://github.com/parthsanaja/rollingball/blob/master/roll-boll-illustration.jpeg?raw=true)


How to use the code and output:
BallInMatrix is entry point for solution.
Refer below code snippet as example
```
        BallInMatrix matrix = new BallInMatrix();
        String[][] input = {
                {"", "", "\\"},
                {"\\", "", ""},
                {"\\", "", "/"}};
        Position exitPos = matrix.moveTheBall(input);
        System.out.println("Exit:" + exitPos.row + "," + exitPos.col);
```
