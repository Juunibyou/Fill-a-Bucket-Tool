package org.example;

import java.util.Queue;

public class BucketFill {

    public static void floodFill(Canvas canvas, int x, int y, char newColor) {
        char oldColor = canvas.getPixel(x, y);
        if(oldColor == newColor) return;
        
        Queue<int[]> queue = new java.util.LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int point_x = point[0];
            int point_y = point[1];

            if (point_x < 0 || point_x >= canvas.getCols()|| point_y < 0 || point_y >= canvas.getRows()) {
                continue;
            }
            if (canvas.getPixel(point_x, point_y) != oldColor) {
                continue;
            }

            // Fill the cell with the new color
            canvas.setPixel(point_x, point_y, newColor);

            // Add neighboring cells to the queue
            queue.add(new int[]{point_x + 1, point_y});
            queue.add(new int[]{point_x - 1, point_y});
            queue.add(new int[]{point_x, point_y + 1});
            queue.add(new int[]{point_x, point_y - 1});
        }

    }

}

