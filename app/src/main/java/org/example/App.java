package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Canvas canvas = new Canvas(10, 10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("|-----Welcome to Console Bucket Fill!-----|");

    //while loop until user leaves
        while (true) {

            //add some space for visibility
            for (int i = 0; i < 3; i++) {
            System.out.println();
            }

            canvas.printCanvas();
            System.out.println("\nEnter fill coordinates and color (x y color) or type 'quit':");
            System.out.print("ENTER (x y color): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting. Goodbye!");
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid input! Format: x-coodinate y-coordinate color");
                continue;
            }

            try {
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                char color = parts[2].charAt(0);

            // Perform bucketfill on coordinate
                BucketFill.floodFill(canvas, x, y, color);

            } catch (NumberFormatException e) {
                System.out.println("Invalid coordinates! x and y must be integers.");
            }
        }

    scanner.close();
    }
}
