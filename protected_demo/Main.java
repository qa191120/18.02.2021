package com.example;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // public private default (package-private) protected
        // base
        // derived class

        Son son = new Son(1234, "Danny", 1234);
        son.m_vault_keycode = 45678; // protected could be accessed within the
                    // same package
    }

}
