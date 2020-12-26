package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static char colCheck(char[][] arr) {
        char win = 'D';
        if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {

            win = 'X';
        }
        if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {

            win = 'X';
        }
        if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {

            win = 'X';
        }
        if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O' && win != 'X') {

            win = 'O';
        }
        if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O' && win != 'X') {

            win = 'O';
        }
        if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O' && win != 'X') {

            win = 'O';
        }
        if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O' && win == 'X') {

            win = 'D';
        }
        if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O' && win == 'X') {

            win = 'D';
        }
        if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O' && win == 'X') {

            win = 'D';
        }

        return win;
    }

    public static char rowCheck(char[][] arr) {
        char win = 'D';
        if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {

            win = 'X';
        }
        if (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {

            win = 'X';
        }
        if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {

            win = 'X';
        }
        if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O' && win != 'X') {

            win = 'O';
        }
        if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O' && win != 'X') {

            win = 'O';
        }
        if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O' && win != 'X') {

            win = 'O';
        }
        if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O' && win == 'X') {

            win = 'D';
        }
        if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O' && win == 'X') {

            win = 'D';
        }
        if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O' && win == 'X') {

            win = 'D';
        }

        return win;
    }

    public static char digCheck(char[][] arr) {
        char win = 'D';

        if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
            win = 'X';
        }
        if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
            win = 'X';
        }
        if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O' && win != 'X') {
            win = 'O';
        }
        if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O' && win != 'X') {
            win = 'O';
        }
        if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O' && win == 'X') {
            win = 'D';
        }
        if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O' && win == 'X') {
            win = 'D';
        }

        return win;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = new String[3];
        char[] arr = new char[9];
        char[][] tik = new char[3][3];

        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextLine();
        }
        int lim = 0;
        //Convert string into 2D array
        for (int i = 0; i < input.length; i++) {
            String temp = input[i];
            for (int j = lim; j < lim + temp.length(); j++) {
                int o = j - lim;
                arr[j] = temp.charAt(o);
            }
            lim += 3;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tik[j][i] = arr[(j * 3) + i];
            }
        }

        if (colCheck(tik) == 'D' && rowCheck(tik) == 'D' && digCheck(tik) == 'D') {
            System.out.println("Game Tied!");
        }
        if (colCheck(tik) == 'X' || rowCheck(tik) == 'X' || digCheck(tik) == 'X') {
            System.out.println("X won!");
        }
        if (colCheck(tik) == 'O' || rowCheck(tik) == 'O' || digCheck(tik) == 'O') {
            System.out.println("O won!");
        }

    }
    
}
