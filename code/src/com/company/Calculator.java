package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true) {
            System.out.println("********Enter any operator for calculation from this ['+','-','*','%','/']***********");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter 2 numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '%'){
                    ans = a%b;
                }
                if(op == '/'){
                    if(b !=0){
                        ans = a/b;
                    }
                }
            }else if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Please Enter Valid Operator");
            }
            System.out.println(ans);
        }
    }
}
