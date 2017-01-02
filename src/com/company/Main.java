package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner picking = new Scanner(System.in);

        char board [] [] = new char[3][3];

        board[0][0]='-';
        board[0][1]='-';
        board[0][2]='-';
        board[1][0]='-';
        board[1][1]='-';
        board[1][2]='-';
        board[2][0]='-';
        board[2][1]='-';
        board[2][2]='-';
 
        System.out.println("Easy mode or Hard mode?");
        String howHard = picking.next().toLowerCase();
        if(howHard.equals("easy") || howHard.equals("hard")){

        }else{
            System.out.println("Not an option");
            return;
        }

        do {
            System.out.println("Pick which row 1-3 (X-axis) position");
            int yint = picking.nextInt();
            System.out.println("Pick which column 1-3 (Y-axis) position");
            int xint = picking.nextInt();
            board[xint-1][yint-1] = 'X';


            if(howHard.equals("easy")){
                Difficulty easySetting = new Difficulty();
                board = easySetting.Points(board);
            }if(howHard.equals("hard")){
                DifficultyHard hardSetting = new DifficultyHard();
                board = hardSetting.hardPoints(board);

            }

            for (int rows = 0; rows < board.length; rows++) {
                for (int columns = 0; columns < board[rows].length; columns++) {
                    System.out.print(board[rows][columns] + " ");
                }
                System.out.println();
            }

            WonOrLost winningorlosing = new WonOrLost();
            String abs = winningorlosing.WoL(board);
            System.out.println(abs);
            if(!abs.equals(" ")){
                return;
            }




        }while(6<7);








    }
}
