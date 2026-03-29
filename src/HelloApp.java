/**
 * HelloApp - UC7 - A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names are provided.
 *
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * or Default Message - The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user using the String.join()
 * method. If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [name feature/UC7-String-join
 * - If names are provided, it will display "Hello, [name1], [name2], ..." to the console
/** feature/UC4-display-multiple-names
 * HelloApp – UC4 – A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * Greet Multiple Users – The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user.
 * HelloApp.java – A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given. This use case demonstrates how to handle optional command-line arguments and
 * provide default values in Java
/** feature/UC1-DisplayHelloWorld
 * HelloApp.java - A simple Java application that Displays "Hello, World!" to
 * the console
 * UC 1: Display "Hello World" – The application should display the message
 * "Hello World" to the console when executed.
 * Usage: java HelloAppUC4 [Name1] [Name2] ... [NameN]
 main
 * - If names are provided, it will display "Hello, [Name1], [Name2], ..."
 main
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Prachi Sharma
 * @version 6.0
 * @since UC1
 */

public class HelloApp {

    public static void main(String[] args) {

        // Step 1: Declare a variable to store names
        // Default value is "World"
        String names = "World";

        // Step 2: Check if command-line arguments are provided
        // args.length gives number of arguments passed
        if (args.length > 0) {

            // Step 3: Join all arguments into a single string
            // String.join() combines all elements with a delimiter ", "
            names = String.join(", ", args);
        }

        // Step 4: Display the greeting message
        // If args exist → Hello, name1, name2!
        // If no args → Hello, World!
        System.out.println("Hello, " + names + "!");
    }
