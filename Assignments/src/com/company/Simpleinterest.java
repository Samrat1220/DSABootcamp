package com.company;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter time in months");
        int p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();
        double SI = (p*t*r/100);
        System.out.println(SI);
    }
}
