package com.company;

import java.util.Scanner;

public class AlphabetCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().trim().charAt(0);

        if(c >= 'a' && c <= 'z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}
