package org.app.twoDimensionalArray;

public class TwoDimensionalArray {
    int height = 10;
    int width = 20;
    int[][] array = null;

    public int[][] TwoDimensionalArray() {

        array = new int[height][width];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round((Math.random() * 100));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }
}
