package com.docsmiles;

public class Main {

    public static void main(String[] args) {
	/* Challenge Time: It's been a couple days, so let's test our knowledge of classes
     and how they work. Create a new class for a bank account, create fields for
     the account number, balance, customer name, email, and phone number.

     Create getters and setters for each field, then create two additional methods:
        1. To allow the customer to deposit funds (Increment the balance field).
        2. To allow the customer to withdraw funds (Decrement balance field,
        BUT do not proceed if there are insufficient funds.).

     You will want to create various code within the Main class (you know, the one you're
     currently reading this in) to confirm that your code is working.

     Finally, add some System.out.println's into the two methods above, as well. Aaand go!
     */

        CustomerAccount person = new CustomerAccount();
        person.setCustName("Fuckwagon Jones");
        person.setAcctEmail("fjones123@geemail.com");
        person.setAcctPhone("555-555-2145");
        person.setAcctNum(412356267);
        person.setAcctBalance(400.32);

        System.out.println("Customer: " + person.getCustName());
        System.out.println("E-mail: " + person.getAcctEmail());
        System.out.println("Phone Number: " + person.getAcctPhone());
        System.out.println("Account Number: " + person.getAcctNum());
        System.out.println("Current Total Balance: " + person.getAcctBalance());

        System.out.println("*******************");

        person.depositFunds(500); // Deposit $500.
        person.depositFunds(-40); // Deposit-- er wait no, nevermind.
        person.withdrawFunds(250); // Withdraw $250.
        person.withdrawFunds(1000); // Withdraw too much money.

        System.out.println("*******************");
        /* Okay, so challenge complete. Awesome. Now, let's get back to our actual lesson, eh?
        Constructors: What are they, what are they used for, why do we bother with them?

CustomerAccount person = new CustomerAccount(); <-- This is an example of a constructor.
That "new CustomerAccount()" thing in particular is what I meant. That's a special piece of code
that Java uses to actually physically build the class for us, and link it to that variable.

Like methods, constructors can also be overloaded.

For example:
*/

        CustomerAccount lodsemone = new CustomerAccount(12321, 3000000, "Bill Gates",
                "b.gates@microsoft.com", "555-555-1337");
        System.out.println(lodsemone.getAcctNum());
        System.out.println(lodsemone.getCustName());
        System.out.println(lodsemone.getAcctEmail());
        System.out.println(lodsemone.getAcctPhone());


        System.out.println("*******************");
        // If you call our empty constructor that has the default values:
        CustomerAccount lol_idk = new CustomerAccount();
        System.out.println(lol_idk.getCustName());
        System.out.println(lol_idk.getAcctBalance());



        // End main method.
    }

/* public static void getCredentials() {
    System.out.println("Customer: " + person.getCustName());
    System.out.println("E-mail: " + person.getAcctEmail());
    System.out.println("Phone Number: " + person.getAcctPhone());
    System.out.println("Account Number: " + person.getAcctNum());
    System.out.println("Current Total Balance: " + person.getAcctBalance());
}*/

    // End Main program.
}
