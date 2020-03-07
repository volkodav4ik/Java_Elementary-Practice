package com.volkodav4ik;

public class Iterator {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 5},
                {2, 3},
                {1, 3, 4, 7}
        };
        IteratorClass iterator = new IteratorClass(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
