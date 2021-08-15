package com.company;

import java.text.MessageFormat;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();

        System.out.println(MessageFormat.format("***Hello {0} {1}***", s ,s1));
    }
}
