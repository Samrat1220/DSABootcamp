package com.company;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        label:
        while(true){
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    break label;
                default:
                    if (max < n) {
                        max = n;
                    }
                    break;
            }
        }
        System.out.println(max);
    }
}
