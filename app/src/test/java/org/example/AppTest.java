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


}
