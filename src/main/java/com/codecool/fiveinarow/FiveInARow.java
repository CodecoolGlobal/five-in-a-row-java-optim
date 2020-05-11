package com.codecool.fiveinarow;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.codecool.fiveinarow.Game;
public class FiveInARow {

    public static void main(String[] args) throws IOException {

        if(firstMenu() == 1){

        int [] boardsOptions = getFirstInput();
        Game game1 = new Game(boardsOptions[0], boardsOptions[1]);
        char stopCondition = 'T';
        while (stopCondition == 'T'){
        int player = 8;
        while(player == 8){
            System.out.println("Player 8 choose: ");
            game1.printBoard();
            int[] playerMove = game1.getAiMove(8);
            if(game1.mark(playerMove[0], playerMove[1], playerMove[2])){
                if(!game1.isFull()){
                    player = 9;
                    }
                else {
                    System.out.println("IS DRAW!!!");
                    game1.printBoard();
                    stopCondition = 'F';
                    break;
                }
            }
            else{
                System.out.println("Player 8, this position is occupied, please choose a empty one! ");
            }
        }
        while(player == 9){
            System.out.println("Player 9 choose: ");
            game1.printBoard();
            int[] playerMove = game1.getAiMove(9);
            if(game1.mark(playerMove[0], playerMove[1], playerMove[2])){
                if(!game1.isFull()){
                    player = 8;
                }
                else {
                    System.out.println("IS DRAW!!!");
                    game1.printBoard();
                    stopCondition = 'F';
                    break;
                }
            }
            else {
                System.out.println("Player 9, this position is occupied, please choose a empty one! ");

                }

             }
        }
    }
    else if(firstMenu() == 2) {
        System.exit(2);
    }}
    public static int firstMenu(){
        System.out.println("FIVE IN A ROW \n");
        System.out.println("1. Play");
        System.out.println("2. Quit");
        Scanner userOption = new Scanner(System.in);
        System.out.println("Choose: ");
        return userOption.nextInt();

    }
    public static int[] getFirstInput(){
        Scanner userRows = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many rows: ");

        int rows = userRows.nextInt();  // Read user input

        Scanner userColumns = new Scanner(System.in);
        System.out.println("How many columns: ");
        int cols = userColumns.nextInt();

        int[] boardOptions = {rows, cols};
        return boardOptions;
    }

    public static boolean winVerify( int [][] border, int[] playerMove){
        int rowChoose = playerMove[1];
        int colChoose = playerMove[2];
        int player = playerMove[0];
        if( border[rowChoose][colChoose] == border[rowChoose-1][colChoose-1]){
            return true;
        }


        return false;
    }
}
