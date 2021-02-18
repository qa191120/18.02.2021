package com.example;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // public private default (package-private) protected
        // base
        // derived class

        TriangleWith90 tr_90 = new TriangleWith90(3, 4, 5);
        double hekef = tr_90.getHekef();
        double aread = tr_90.getArea();
    }

}
