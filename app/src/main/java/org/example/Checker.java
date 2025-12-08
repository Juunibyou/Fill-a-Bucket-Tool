package org.example;

import java.util.Scanner;

public class Checker {
    private Scanner scanner;

    public Checker(Scanner scanner) {
        this.scanner = scanner;
    }

    public int checkPositive(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                int value = Integer.parseInt(input);
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public int[] checkCoordinates(String prompt) {

        while (true) {
            System.out.print(prompt);
            String[] parts = scanner.nextLine().split(" ");
            if (parts.length != 2 && parts.length != 3) {
                System.out.println("Invalid input! Format: x-coordinate y-coordinate color");
                continue;
            }

            try {
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
            
                if (parts.length == 3) {
                    char color = parts[2].charAt(0);
                    return new int[]{x, y, color};
                } else {
                    return new int[]{x, y};
                }
            } 
            
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }
    }
}
