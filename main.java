package com.company;



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int n = input.nextInt();
        if (isPrime(n, 2))
            System.out.println("Yes it's a Prime");
        else
            System.out.println("Not a Prime");
    }




    static boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)

            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }




}
