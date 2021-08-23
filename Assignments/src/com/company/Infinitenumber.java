package com.company;

import java.util.Scanner;

public class Infinitenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            int n = sc.nextInt();
            if(n != 0)
                sum+=n;
            else break;
        }
        System.out.println(sum);
    }
}
