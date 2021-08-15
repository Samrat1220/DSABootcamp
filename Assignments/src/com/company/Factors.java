package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++)
            if (n % i == 0) {
                if(n/i != i)
                System.out.println(i +" "+n/i);
                else
                    System.out.println(i);
            }
    }
}
