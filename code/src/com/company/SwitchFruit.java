package com.company;

import java.util.Scanner;

public class SwitchFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch(fruit){
            case "Mango":
                System.out.println("King of the Fruits");
                break;
            case "Apple":
                System.out.println("Red Fruit");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}
