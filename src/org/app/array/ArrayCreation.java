package org.app.array;

public class ArrayCreation {
    public int[] RandArr(){
        int[] randArr = new int [100];
        for(int i=0; i<randArr.length; i++){
            randArr[i] = (int) Math.round((Math.random() * 100));
            System.out.print(randArr[i] +" ");
        }
        System.out.println();
        getMaxValue(randArr);
        getMinValue(randArr);
       return randArr;
    }

    public static int getMaxValue(int[] randArr) {
        int maxValue = randArr[0];
        for (int i = 1; i < randArr.length; i++) {
            if (randArr[i] > maxValue) {
                maxValue = randArr[i];
            }
        }
        System.out.println("Max ->" + maxValue);
        return maxValue;
    }


    public static int getMinValue(int[] randArr) {
        int minValue = randArr[0];
        for (int i = 1; i < randArr.length; i++) {
            if (randArr[i] < minValue) {
                minValue = randArr[i];
            }
        }
        System.out.println("Min ->" + minValue);
        return minValue;
    }


}
