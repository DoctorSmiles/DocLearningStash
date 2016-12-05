package com.docsmiles;

public class Main {

    public static void main(String[] args) {
	// Okay, so today we're going to learn about something called "method overloading".
    // So what IS method overloading, and how do we do it? Well, to break it down:
    // Method Overloading is the act of taking a method and using new parameters that it
    // doesn't usually come with.

        // Reference case, our first method.
       int newScore = calculateScore("Fuckboi", 500);
        System.out.println("New score is " + newScore);

        // And now we're going to attempt method overloading. As you can see, we have a method
        // with the same name, but we're not using all the parameters as the first one we defined.
        // They're *technically* two different methods with the same name, but with different parameters
        // and because of that, the language and the computer recognize them as their own unique
        // thing.

        // Test case 1, our second method. Here, we've eliminated the playerName parameter.
        calculateScore(5);

        // Test case 2.
        // calculateScore(100, 100);

        // Okay, so here we try to use numbers for two parameters here. However, the only
        // version of this method with two parameters is the one with the String, and
        // obviously because of that it's expecting a string for its first parameter.
        // It's not getting that, so Java throws a shitfit. We're not using method
        // overloading properly here.

        // Test case 3. What happens when you decide you don't want ANY parameters?
        calculateScore();

        // Challenge Time!
        calcFeetAndInchesToCentimeters(5, 7);

        // Challenge tests:
        calcFeetAndInchesToCentimeters(0, 13);
        calcFeetAndInchesToCentimeters(1, -1);
        // Now let's get hardcore. Method overloading inside the same method! Mwahaha!
        calcFeetAndInchesToCentimeters(calcFeetAndInchesToCentimeters(24), 8);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
                return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no score, not a damn thing.");
        return 0;
    }

    /* public static void calculateScore() {
        // Note: Just because you change the return type (e.g. here: From 'int' to 'void')
        // doesn't change the signature of the method. Basically, Java is still recognizing this
        // as a form of the 'calculateScore' method, and therefore if we already have a
        // another version of this method with say, the String playerName parameter, or
        // int score parameter, Java will throw a tantrum and say you can't do that,
        // it's already defined.
        System.out.println("Unnamed Player scored " + score + " points.");

    } */

    // Challenge Time!
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >=0 && inches <= 12)) {
            double feetToCent = feet / 0.032808;
            double inchesToCent = inches / 0.39370;
            double totalCent = feetToCent + inchesToCent;
            System.out.println(feet + " ft, " + inches + " in. equals to " + totalCent
                    + " cm.");

        } else {
            System.out.println("get fucked");

        }
            return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double inchesToFeet =  inches / 12;
            return inchesToFeet;
        } else {
            System.out.println("Get fucked harder");
        }
        return -1;
    }

}
