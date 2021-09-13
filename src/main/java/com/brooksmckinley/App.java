/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = scan.nextLine();
        System.out.print("Who said it? ");
        String author = scan.nextLine();
        System.out.println(generateOutput(author, quote));
    }

    public static String generateOutput(String author, String quote) {
        return author + " says, \"" + quote + "\"";
    }
}