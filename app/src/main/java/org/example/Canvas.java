package org.example;

public class Canvas {
    private char[][] grid;
    private int rows;
    private int cols;

// Constructor
    public Canvas(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = '.';
            }
        }
    }

// Getters and Setters
    public char getPixel(int x, int y) {
        if (x >= 0 && x < cols && y >= 0 && y < rows) {  // <- correct bounds check
            return grid[y][x];
        }
    return '\0';
}

    public void setPixel(int x, int y, char color) {
        if (x >= 0 && x < cols && y >= 0 && y < rows) {
            grid[y][x] = color;
        }
    }

// Getters for rows and cols
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }   

//Print Canvas
//Added changes to show coordinates
    public void printCanvas() {
        System.out.print("    ");

        for (int j = 0; j < cols; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();


        for (int i = 0; i < rows; i++) {
            System.out.printf("%2d  ", i);

            for (int j = 0; j < cols; j++) {
                System.out.printf(" %c ", grid[i][j]);
            }
            System.out.println();
        }
    }
}