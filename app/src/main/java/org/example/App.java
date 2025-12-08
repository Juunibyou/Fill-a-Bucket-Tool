package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker(scanner);

        System.out.println("|-----Welcome to Console Bucket Fill!-----|");

        boolean canvasRunning = true;
        Canvas canvas = new Canvas(10, 10);
    
        //while loop until user leaves
        while (canvasRunning) {

            //add some space for visibility
            for (int i = 0; i < 3; i++) {
            System.out.println();
            }

            canvas.printCanvas();
            System.out.println("[__Tool_Menu__]:");
            System.out.println("1) Pencil-Draw");
            System.out.println("2) Bucket Fill"); 
            System.out.println("3) Clear");
            System.out.println("4) Quit"); 
            System.out.println("Select (1-4): ");

            String choice = scanner.nextLine();

            if (choice.equals("1")){
                System.out.println("|DRAWING MODE|");
                System.out.println("Enter coordinates and color (x-coordinate y-coordinate character;) ");
                System.out.println("Type 'back' to return to the main menu.\n\n");

                while (true){
                    System.out.print("Draw (x y character): ");
                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("back")){
                        System.out.println("Exiting Drawing Mode...");
                        break;
                    }

                    String[] parts = input.split(" ");
                    if (parts.length != 3) {
                        System.out.println("Invalid input! Format: x-coordinate y-coordinate character");
                        continue;
                    }

                    try {
                        int x = Integer.parseInt(parts[0]);
                        int y = Integer.parseInt(parts[1]);
                        char color = parts[2].charAt(0);

                        canvas.setPixel(x, y, color);

                        canvas.printCanvas();
                        System.out.println();
                    } 
                    
                    catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid integers for coordinates.");
                    }
                }
            }

            else if (choice.equals("2")) {

            }
        }

    scanner.close();
    }
}
