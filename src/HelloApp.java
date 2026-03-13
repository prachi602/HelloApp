/** feature/UC1-DisplayHelloWorld
 * HelloApp.java - A simple Java application that Displays "Hello, World!" to
 * the console.
 *
 * This is the first step in the HelloApp journey, where we start with a basic
 * "Hello, World!" program. The application consists of a single class with a
 * main method that serves as the entry point for the program. The main method
 * uses the System.out.println() function to print the message "Hello, World!"
 * to the console. This application demonstrates fundamental Java concepts such
 * as class declaration, the main method, and standard output.
 *
 * @author Prachi Sharma
 * @version 1.0
 */

/**
 * Key Java Concepts Used:
 * 1. Class Declaration - Defines a blueprint for objects
 * 2. Main Method - Entry point for program execution
 * 3. Static Keyword - Method belongs to the class, not instances
 * 4. String Argument Array - Command-line arguments parameter
 * 5. System.out.println() - Standard output stream for printing
 */public class HelloApp
{
    public static void main(String args[])
    {
        System.out.println("HELLO WORLD");
    }
 }   
 /** HelloApp.java – A simple Java application that extends the functionality of
 * HelloAppUC1 by accepting a user's name as a command-line argument and displaying
 * a personalized greeting.
 *
 * UC 1: Display "Hello World" – The application should display the message
 * "Hello World" to the console when executed.
 *
 * UC 2: Display User Name – The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 *
 * @author Prachi Sharma
 * @version 1.0
 * @since UC1
 */

/**
 * Key Concepts of UC 2:
 * 1. Command-line Arguments: Accessing user input via args[] parameter
 * 2. String Concatenation: Combining strings using the + operator
 * 3. System.out.println(): Output to console
 * 4. Array Indexing: Accessing the first argument with args[0]
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];   // first argument
            System.out.println("HELLO " + name);
        } else {
            System.out.println("HELLO WORLD");
    }
}
