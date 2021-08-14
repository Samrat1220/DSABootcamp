package com.company;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1234454241;
        int c = 0;
        while(n>0){
            int rem = n%10;
            if(rem == x){
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
