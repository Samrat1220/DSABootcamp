package com.company;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n>0){
           int rem=0;
           rem = n%10;
           res = rem+(res*10);
           n=n/10;
        }
        System.out.println(res);
    }
}
