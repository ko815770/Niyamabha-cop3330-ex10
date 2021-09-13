package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int q1, q2, q3;
        double price1, price2, price3, subtotal, total, tax;
        System.out.println("Enter the price of item 1: ");
        Scanner input = new Scanner(System.in);
        price1 = input.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        q1 = input.nextInt();
        System.out.println("Enter the price of item 2: ");
        price2 = input.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        q2 = input.nextInt();
        System.out.println("Enter the price of item 3: ");
        price3 = input.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        q3 = input.nextInt();
        subtotal = (price1 * q1) + (price2 * q2) + (price3 * q3);
        tax = subtotal * 0.055;
        total = tax + subtotal;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }
}