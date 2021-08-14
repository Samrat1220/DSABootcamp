package com.company;

import java.util.Scanner;

public class Fibbonoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while(n >= 2){
            int temp = b;
            b = a+b;
            a=temp ;
            n--;
        }
        System.out.println(b);
    }
}
