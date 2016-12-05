package com.docsmiles;

public class Main {

    public static void main(String[] args) {

     /*   Okay, so what is a "method"? Basically, a method is just a block of code
     that you can recall and reuse as many times as you want, instead of constantly
     having to rewrite/copy-paste the same fucking thing over and over and over again.

            For example: This whole program is actually a method. It's a method with
            a name of "main". Because well, it's the MAIN method of the whole program.
            So whenever this program runs, it runs through all this code all over again.
            So let's say we had a method called "dickbutt" and we called it in our code
            somewhere else in our 'Main' method/program. When our main method gets to that
            section of code, it jumps over to wherever 'dickbutt' is, and runs that
            portion of code first, before jumping back and continuing down the rest
            of its own main code.
     */


        // Remember: 'dickbutt' is our own method we're using. Because we're mature like that.
        dickbutt(true, 5000, 5, 500);

        // Another thing we can do is assign the variables beforehand like we did in the previous
        // lesson, but keep them around this time. Then, we'll call the method...
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        dickbutt(gameOver, score, levelCompleted, bonus);
        // And instead of using values directly in place of the parameters for the method,
        // we use the parameters names instead. The method will instead take the values of
        // whatever variables are named such from whatever method you're calling it from.

        // What if gameOver were false? Welp, the other parameters *still* need values.
        dickbutt(false, 666, 1, 0);

        // END OF MAIN PROGRAM
        System.out.println("... okay, \n");
        System.out.println("NOW FUCK ME IN THE ASSHOLE");
    }

    /* Now, for future reference: You can't create a NEW method inside another method.
    They have to be separated from each other, otherwise things just fall apart and refuse
    to work. So let's go ahead and build us a brand new method!
    */

    /* Note: the 'void' keyword when defining methods (see 'main' method), is used to
    tell the computer to not send any data back to anything else upon finishing the code.
    Once the method's finished, it'll go ahead and throw away all the information.
    If you're defining the method this way, then you probably didn't want/need that info
    anyway. Since we actually want to keep the info around this time though,
    we're going to not use 'void'.
    */

    public static int dickbutt(boolean gameOver, int score, int levelCompleted, int bonus) {
// Here, we're using the 'int' keyword. Meaning this method HAS to return an integer value
// whenever it's called. Whether gameOver is true or not, it needs to return a value.

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

        // Now we could've used an else statement, but you don't really have to.
        // gameOver is a boolean, so it's either true or false. One or the other.
        // We already told the computer what we want to do if it were true, so anything else
        // would fall under false, right? Alternatively, think of it like this: If
        // the variable here is true, then run this code. If it's not, skip this. Well,
        // it's an int method though, so it still needs to return a value, right?
        // Hence, return -1.
    }
}
