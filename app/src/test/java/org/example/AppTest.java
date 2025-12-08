package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSetPixel() {
        Canvas canvas = new Canvas(10, 10);
        canvas.setPixel(2, 3, 'X');

        assertEquals('X', canvas.getPixel(2, 3));
    }

    @Test
    void testSetPixelInvalid() {
        Canvas canvas = new Canvas(10, 10);

        canvas.setPixel(99, 99, 'X');

        assertEquals('.', canvas.getPixel(0, 0)); 
    }

    @Test
    void testSimpleFill() {
        Canvas canvas = new Canvas(5, 5);

        canvas.setPixel(1, 1, 'A');
        canvas.setPixel(1, 2, 'A');
        canvas.setPixel(2, 2, 'A');

        BucketFill.floodFill(canvas, 1, 1, 'Z');

        assertEquals('Z', canvas.getPixel(1, 1));
        assertEquals('Z', canvas.getPixel(1, 2));
        assertEquals('Z', canvas.getPixel(2, 2));
    }

    @Test
    void testFillStopsAtDifferentColor() {
        Canvas canvas = new Canvas(5, 5);

        canvas.setPixel(0, 0, 'A');
        canvas.setPixel(1, 0, 'A');
        canvas.setPixel(2, 0, 'B');

        BucketFill.floodFill(canvas, 0, 0, 'X');

        assertEquals('X', canvas.getPixel(0, 0));
        assertEquals('X', canvas.getPixel(1, 0));
        assertEquals('B', canvas.getPixel(2, 0));
    }
}
