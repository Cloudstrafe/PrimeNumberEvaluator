package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException {
        Scanner myScanner = new Scanner(System.in);
        String input;
        while (true) {
            if (args.length > 0) {
                input = args[0];
            } else {
                System.out.println("Input an integer or type stop to exit");
                input = myScanner.nextLine();
            }
            if ("stop".equals(input)) {
                break;
            }
            try {
                int n = Integer.parseInt(input);
                if (isPrime(n)) {
                    System.out.println(n + " is prime");
                } else {
                    System.out.println(n + " is not prime");
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("invalid number");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}