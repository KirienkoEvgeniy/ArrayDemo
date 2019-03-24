package org.app.dimensionalArrayCondition;

public class DimensionalArrayCondition {


       private int height = 10;
       private int width = 20;
       private int[][] array = null;

        public int[][] TwoDimensionalArrayCondition() {

            array = new int[height][width];

            for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(j==0 || j==1 || i==0 || i==height-1) {
                            System.out.print((int) Math.round((Math.random() * 100)) + " ");

                        } else {
                            System.out.print(" ");
                        }
                    }
                System.out.println();
            }
            return array;
        }
    }
