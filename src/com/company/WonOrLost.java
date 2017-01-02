package com.company;


public class WonOrLost {

    public String WoL(char hello[][]) {

        if (hello[0][0] != '-' && hello[0][0] == hello[0][1] && hello[0][0] == hello[0][2]) {
            return ("Player " + hello[0][0] + " wins!");
        }
        if (hello [1][0] != '-' && hello[1][0] == hello[1][1] && hello[1][0] == hello[1][2]) {
            return ("Player " + hello[1][0] + " wins!");
        }
        if (hello[2][0] != '-' && hello[2][0] == hello[2][1] && hello[2][0] == hello[2][2]) {
            return ("Player " + hello[2][0] + " wins!");
        }
        if (hello[0][0] != '-' && hello[0][0] == hello[1][0] && hello[0][0] == hello[2][0]) {
            return ("Player " + hello[0][0] + " wins!");
        }
        if (hello[0][1] != '-' && hello[0][1] == hello[1][1] && hello[0][1] == hello[2][1]) {
            return ("Player " + hello[0][1] + " wins!");
        }
        if (hello[0][2] != '-' && hello[0][2] == hello[1][2] && hello[0][2] == hello[2][2]) {
            return ("Player " + hello[0][2] + " wins!");
        }
        if (hello[0][0] != '-' && hello[0][0] == hello[1][1] && hello[0][0] == hello[2][2]) {
            return ("Player " + hello[0][0] + " wins!");
        }
        if (hello[0][2] != '-' && hello[0][2] == hello[1][1] && hello[0][2] == hello[2][0]) {
            return ("Player " + hello[0][2] + " wins!");
        }else if (hello [0][0] != '-' && hello[0][1] != '-' && hello[0][2] != '-' && hello[1][0] !='-' && hello[1][1] !='-' && hello[1][2] !='-' && hello[2][0] != '-' && hello [2][1] != '-' && hello[2][2] !='-'){
            return "\nIt's a tie";
        } else {
            return " ";
        }
    }
}

