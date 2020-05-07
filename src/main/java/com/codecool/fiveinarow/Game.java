package com.codecool.fiveinarow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Game  {

    private int[][] board;



    public Game(int nRows, int nCols ) {
//        nRows = 2, n Cols =3;
        this.board= new int[nRows][nCols];
        for(int row= 0; row< nRows; row++){
            for(int col =0; col<nCols; nCols++){
                board[row][col] = 0;
            }
        }
        }






    public int[][] getBoard() {

        return board;
    }

    public void setBoard(int[][] board) {

        this.board = board;

    }

    public int[] getMove(int player) {
//        user input

        return null;
    }

    public int[] getAiMove(int player) {
//        user input 2
        Scanner userRow = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\n"+"Enter row: ");

        int row = userRow.nextInt();  // Read user input

        Scanner userColumn = new Scanner(System.in);
        System.out.println("\n" + "Enter column: ");
        int col = userColumn.nextInt();
        int playerMove[] = {player,row,col};
        return playerMove;
    }

    public boolean mark(int player, int row, int col) {
        row = row-1;
        col=col -1;
        if(board[row][col] == 0){
        board[row][col] = player;
        return true;}
        else{
            return false;
        }
    }

    public boolean hasWon(int player, int howMany) {
//        win condition
        return false;
    }

    public boolean isFull() {
//
        for (int row =0; row < getLengthRow(board); row++){
            for(int col=0; col < getLengthCol(board); col++){
                if (board[row][col]== 0){
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
//        print board
        int counterRowsNumbers = 1;
        int rows = getLengthRow(board);
        int columns = getLengthCol(board);
        System.out.println("" + "\n");

        System.out.print("_  ");
        for(int i =0; i <columns; i++){
            System.out.print(  i+1 +" | ");

        }
        for (int x = 0; x<rows; x++, counterRowsNumbers++ ){
            System.out.print( "\n"+ counterRowsNumbers + "| ");
            for(int y = 0; y<columns; y++){
                System.out.print(  board[x][y]+ " | ");

            }
        }
    }

    public void printResult(int player) {
    }

    public void enableAi(int player) {
    }

    @Override
    public String toString() {
        return "Game{" +
                "board=" + Arrays.deepToString(this.board) + getLengthRow(this.board) + getLengthCol(this.board) +
                '}';
    }
    public int getLengthRow(int [][] board){

        return board.length;
    }

    public int getLengthCol(int [][] board){
        return board[0].length;
    }
    public void play(int howMany) {
    }
}
