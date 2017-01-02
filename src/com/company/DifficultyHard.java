package com.company;


public class DifficultyHard {
    public char[][] hardPoints(char hello[][]) {
        if (hello[1][1] != 'X' && hello[1][1] == '-') {
            hello[1][1] = 'O';
            return hello;
        }
        if (hello[0][0] == 'X' && hello[0][1] == 'X' && hello[0][2] == '-') {
            hello[0][2] = 'O';
            return hello;
        }
        if (hello[0][0] == 'X' && hello[0][1] == '-' && hello[0][2] == 'X') {
            hello[0][1] = 'O';
            return hello;
        }
        if (hello[0][0] == '-' && hello[0][1] == 'X' && hello[0][2] == 'X') {
            hello[0][0] = 'O';
            return hello;
        }
        if (hello[1][0] == 'X' && hello[1][1] == 'X' && hello[1][2] == '-') {
            hello[1][2] = 'O';
            return hello;
        }
        if (hello[1][0] == 'X' && hello[1][1] == '-' && hello[1][2] == 'X') {
            hello[1][1] = 'O';
            return hello;
        }
        if (hello[1][0] == '-' && hello[1][1] == 'X' && hello[1][2] == 'X') {
            hello[1][0] = 'O';
            return hello;
        }
        if (hello[2][0] == 'X' && hello[2][1] == 'X' && hello[2][2] == '-') {
            hello[2][2] = 'O';
            return hello;
        }
        if (hello[2][0] == 'X' && hello[2][1] == '-' && hello[2][2] == 'X') {
            hello[2][1] = 'O';
            return hello;
        }
        if (hello[2][0] == '-' && hello[2][1] == 'X' && hello[2][2] == '-') {
            hello[2][0] = 'O';
            return hello;
        }
        if (hello[0][0] == 'X' && hello[1][1] == 'X' && hello[2][2] == '-') {
            hello[2][2] = 'O';
            return hello;
        }
        if (hello[0][0] == 'X' && hello[1][1] == '-' && hello[2][2] == 'X') {
            hello[1][1] = 'O';
            return hello;
        }
        if (hello[0][0] == '-' && hello[1][1] == 'X' && hello[2][2] == 'X') {
            hello[0][0] = 'O';
            return hello;
        }
        if (hello[0][2] == 'X' && hello[1][1] == 'X' && hello[2][0] == '-') {
            hello[2][0] = 'O';
            return hello;
        }
        if (hello[0][2] == 'X' && hello[1][1] == '-' && hello[2][0] == 'X') {
            hello[1][1] = 'O';
            return hello;
        }
        if (hello[0][2] == '-' && hello[1][1] == 'X' && hello[2][0] == 'X') {
            hello[0][2] = 'O';
            return hello;
        }
        if (hello[0][0] == '-' && hello[1][0] == 'X' && hello[2][0] == 'X') {
            hello[0][0] = 'O';
            return hello;
        }
        if (hello[0][0] == 'X' && hello[1][0] == '-' && hello[2][0] == 'X') {
            hello[1][0] = 'O';
            return hello;
        }
        if (hello[0][0] == 'X' && hello[1][0] == 'X' && hello[2][0] == '-') {
            hello[2][0] = 'O';
            return hello;
        }
        if (hello[0][1] == '-' && hello[1][1] == 'X' && hello[2][1] == 'X') {
            hello[0][1] = 'O';
            return hello;
        }
        if (hello[0][1] == 'X' && hello[1][1] == '-' && hello[2][1] == 'X') {
            hello[1][1] = 'O';
            return hello;
        }
        if (hello[0][1] == 'X' && hello[1][1] == 'X' && hello[2][1] == '-') {
            hello[2][1] = 'O';
            return hello;
        }
        if (hello[0][2] == '-' && hello[1][2] == 'X' && hello[2][2] == 'X') {
            hello[0][2] = 'O';
            return hello;
        }
        if (hello[0][2] == 'X' && hello[1][2] == '-' && hello[2][2] == 'X') {
            hello[1][2] = 'O';
            return hello;
        }
        if (hello[0][2] == 'X' && hello[1][2] == 'X' && hello[2][2] == '-') {
            hello[2][2] = 'O';
            return hello;

        } else {
            while (5 < 6) {
                if (hello[0][0] == '-') {
                    hello[0][0] = 'O';
                    return hello;
                }
                if (hello[0][2] == '-') {
                    hello[0][2] = 'O';
                    return hello;
                }
                if (hello[2][0] == '-') {
                    hello[2][0] = 'O';
                    return hello;
                }
                if (hello[2][2] == '-') {
                    hello[2][2] = 'O';
                    return hello;
                }
                }
            }
        }
    }

