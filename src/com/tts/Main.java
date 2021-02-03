package com.tts;

import java.util.Arrays;

public class Main {

    public static int SIDE = 4;
    private static int[][] gameField = new int[SIDE][SIDE];

    private static void rotateClockwise(){
        int[][] ghostField = new int [SIDE][SIDE];
        for(int i = 0; i < SIDE; i++){
            int cur = (SIDE - 1) - i;
            for(int j = 0; j <SIDE;j ++){
                ghostField[j][cur] = gameField[i][j];
//                for (int[] row: ghostField) {
//                    System.out.println(Arrays.toString(row));
//               }
            }
        }
        gameField = ghostField;
    }
    public static void main(String[] args) {
	// write your code here

        for(int i = 0; i < SIDE; i++){
            for (int j = 0; j < SIDE; j++) {
                 gameField[i][j]= (int) Math.pow(2, i);
            }
        }

        for (int[] row: gameField) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("-------------");
        rotateClockwise();
        for (int[] row: gameField) {
            System.out.println(Arrays.toString(row));
        }
    }
}
