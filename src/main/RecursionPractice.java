package com.amazon.ata.recursion.prework;

public class RecursionPractice {

    /**
     * Test main to output the results of our CountDown recursion method.
     * @param args not used
     */
    public static void main(String[] args) {
        int target = 3;
        RecursiveCountDown recursiveCountDown = new RecursiveCountDown();
        System.out.println(recursiveCountDown.countDown(target));
        //Example: The output for a target of 3 should be "3210"
    }
}
