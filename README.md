### Recursive Count Down

Expected time required: 10 min

Now that we've gone through the steps to determine our base case and recursion cases, let's go ahead and write the 
recursive method that counts down from a target number and returns a String combining the digits together into a single 
String.

- Example Input: 3

- Example Final Return: "3210"

In the previous two questions, we established that our base case was
when our target number gets to zero. Anything else and we will
continue to make a recursive call to our method as we count down.

In this activity, you will need to:
1. Modify the `countDown` method of the `RecursiveCountDown` class
   in order to turn it into a true recursive method that creates the
   desired result.
1. Do some testing via the `main` method in `RecursionPractice` that starts
   the recursive method. You may want to modify that main method to
   test other values in your recursive method.
1. After verifying that `RecursionPractice` gives the expected results,
   make sure that the `RecursiveCountDownTest` file is passing,
   then commit and push your changes.

HINT:

* [What do I give to the method during recursion?](./hints/hint-01.md)

* [What should my Base Case do?](./hints/hint-02.md)

* [How do I combine the return from each recursive call?](./hints/hint-03.md)
