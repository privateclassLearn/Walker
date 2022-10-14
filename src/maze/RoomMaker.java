package maze;

import java.util.Arrays;

public class RoomMaker {
    public static void roomMaker() {
        System.out.println("The maze will be created here.");

        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i + j; } } // now let's print a two dimensional array in Java
        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + "\t"); }
            System.out.println("\n"); } // printing 2D array using Arrays.deepToString() method System.out.println("another way to print 2D arrays");
        System.out.println(Arrays.deepToString(board));

// index of beim array finden


        }
    }
