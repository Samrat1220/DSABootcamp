package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        while(n>0){
            int temp = n;
            res = res * temp;
            n--;
        }
        System.out.println(res);
    }
}
