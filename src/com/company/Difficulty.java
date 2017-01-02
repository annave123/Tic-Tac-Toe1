package com.company;


import java.util.Random;

public class Difficulty {

    public char[][] Points(char hello[][]) {
        while (6 < 7) {

            Random pointPicker = new Random();
            int point1 = 0 + pointPicker.nextInt(3);
            int point2 = 0 + pointPicker.nextInt(3);
            if (hello[point1][point2] != '-') {

            } else {
                hello[point1][point2] = 'O';
                return hello;
            }

            }
        }
    }
