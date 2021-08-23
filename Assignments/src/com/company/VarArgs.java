package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3);
    }

    private static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    private static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }

}
