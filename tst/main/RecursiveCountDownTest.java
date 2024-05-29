package com.amazon.ata.recursion.prework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveCountDownTest {

    private RecursiveCountDown recursiveCountDown;

    @BeforeEach
    private void setup() {
        recursiveCountDown = new RecursiveCountDown();    
    }

    @Test
    public void countDown12_recursiveCountDown_returnsExpected() {
        // GIVEN
        int target = 12;
        String concatenatedString = "1211109876543210";

        // WHEN
        String result = recursiveCountDown.countDown(target);

        // THEN
        assertEquals(concatenatedString, result, String.format("Expected to receive '%s' with target = %d",
                concatenatedString, target));
    }

    @Test
    public void countDown0_recursiveCountDown_returnsExpected() {
        //GIVEN
        int target = 0;
        String concatenatedString = "0";

        //WHEN
        String result = recursiveCountDown.countDown(target);

        //THEN
        assertEquals(concatenatedString, result, String.format("Expected to receive '%s' with target = %d",
                concatenatedString, target));
    }
}
