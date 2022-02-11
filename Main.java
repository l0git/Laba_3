package com.company;


public class Main {

    public static void main(String[] args) {
        int a = 1;
        while (a != 11){
            for (int d = 1; d <= 10; d++){
                System.out.println(a + " * " + d + " = " + (a * d));
            }
            System.out.println(" ");
            a++;
        }
    }
}