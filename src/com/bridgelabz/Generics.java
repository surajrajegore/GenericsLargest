package com.bridgelabz;

import java.util.Scanner;

public class Generics {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String args[]) {
        System.out.println("Maximum of int "+ maximum(10.0,11.0,12.0));//for float

    }
}
