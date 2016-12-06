package com.docsmiles;

public class Main {

    public static void main(String[] args) {
        // Time for the next section of control flow: For loops!

        // Reference statement
        System.out.println("$10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // Simple enough, right? Well, what if you had five different interest rates
        // to calculate? What about 15? 20? Imagine copy-pasting that line above about 20 times
        // and changing things for each and every one. That's way more code, and way more work
        // than you really HAVE to do, or would really want to do. Thankfully, once again we're
        // saved by the magic of computers and automation. This time, through the effort
        // of the For statement, or more commonly referred to as the For Loop.

        // A For loop will routinely repeat the same block of code however many times it
        // needs to, until a certain condition is met or satisfied.

        // for(init; termination; increment;) { }

        // So let's break this down -- This line isn't the loop we'll be using in the program,
        // We're just putting it here to help us understand the basic format of a loop,
        // and how it works.
        // The "init" parameter is used once as the code that gets the loop started.
        // "Termination" is, as you'd expect, the condition that tells the computer whether
        // or not we want to end the loop. This must evaluate to False if the loop is to be ended.
        // Finally, "increment" is invoked after each iteration of the loop. Every time the
        // code inside the loop is done, and the loop repeats, we increment, just so we know
        // how many times the loop has run. Now, let's do this for reals!

        // Test Loop:
        // for{int i = 0; i < 5; i++) {
        //        System.out.println("Loop " + i + " hello!");
        // }


        // Challenge Time!
        for(int i = 2; i <= 8; i++) {
            // Okay so here, our init is labelled as i = 2, and we want the loop
            // to keep going until i is no longer less than 8. And after each iteration, we
            // increment by a value of 1 by using the statement "i++". Note: If we wanted
            // to decrement, we'd use "i--".

            double money = 10000;
            System.out.println("$" + calculateInterest(money) + " with an interest rate of "
                     + i + "% = " + String.format("%.2f", calculateInterest(money, i)));
            // Here we're going a bit off the standard lesson, but
            // I added a separate variable and used it with our interest method,
            // in conjunction with some method overloading in order to make things a little
            // more succinct in our code.

            // You may have also noticed that "String.format" thing at the end. What that's doing
            // is taking the result of the calculateInterest method and turning into a string,
            // while the "%.2f" parameter is formatting it to leave keep only 2 decimal places
            // at the end of the result. Otherwise, we can sometimes get results with very
            // large decimal numbers because of the precise nature of the double data type.
        }
        System.out.println("**********************");
        // Challenge 2 -- Decrement from 8 to 2.
        for(int i = 8; i >= 2; i--) {
            double money = 10000;
            System.out.println("LOOP 2: $" + calculateInterest(money) + " with an interest rate of "
                    + i + "% = " + String.format("%.2f", calculateInterest(money, i)));
    }
        System.out.println("**********************");
        // Challenge 3 -- Using any range of numbers, determine how many primes
        // are within that range, and count how many primes you've found.
        // If the number of primes found reaches 3, end the loop.

        int totalPrimesFound = 0;
        for (int i = 3; i <=15; i++) {

            if (isPrime(i) == true) {
            System.out.println(i + " is a prime number!");
            totalPrimesFound++;
            }
            if (totalPrimesFound == 3) {
            break;
            }

        }

        System.out.println("Total number of primes found: " + totalPrimesFound);
         // END MAIN
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static double calculateInterest(double amount) {
        return amount;
    }
// Challenge 3 Method
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                // Here, we're using % as an operator. This is what's known as the
                // modulo operator. Basically meaning that we divide these two numbers like
                // normal, but we use whatever their remainder is as the output instead.
                // For example: 3 % 2 would equal to .5, because 2 divides into 3 once, with
                // 1/2 left over. 6 % 2 would equal to 0, because 6 divides by 3 evenly to get
                // a value of 2, with no remainder.

                // Also of note, the termination clause of the loop states i <= n/2. This
                // is just a quick check right from the get-go to see if the integer given
                // will divide evenly into anything. If so, it's clearly not a prime number.
                // Well, except for maybe 1 or 2 themselves, but then those are special cases.

                return false;
            }
        }

        return true;
    }

}
