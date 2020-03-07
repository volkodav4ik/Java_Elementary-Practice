package com.volkodav4ik;

import java.util.Arrays;

public class IteratorClass {

    private int[][] arr;
    private int size;
    private int count = 0;
    private int[] sortArray;

    public IteratorClass(int[][] arr) {
        this.arr = arr;
        this.sortArray = sortArray(arr);
    }

    public boolean hasNext() {
        while (count < getSize()) {
            return true;
        }
        return false;
    }

    private int getSize() {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size += arr[i].length;
        }
        return size;
    }

    private int[] sortArray(int[][] arr) {
        int[] sortArray = new int[getSize()];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sortArray[index] = arr[i][j];
                index++;
            }
        }
        Arrays.sort(sortArray);
        return sortArray;
    }

    public int next() {
        int value = sortArray[count];
        count++;
        return value;
    }
}
