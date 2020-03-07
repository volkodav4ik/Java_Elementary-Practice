package com.volkodav4ik;

import java.util.Scanner;

public class DogHasMan {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, enter the string");
        String s = SCANNER.nextLine();
        System.out.println(s);
        System.out.println("Reverse string: " + reverse(s));

    }

    private static String reverse(String s) {
        String[] arrS = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arrS.length - 1; i >= 0; i--) {
            sb.append(arrS[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
