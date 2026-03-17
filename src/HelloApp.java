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
 * - If names are provided, it will display "Hello, [Name1], [Name2], ..."
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Prachi Sharma
 * @version 4.0
 * @since UC1
 */

/**
 * Key Concepts for HelloAppUC4:
 * 1. Default Values: Providing a fallback value when no input is given
 * 2. Command-Line Arguments: Accessing user input via args[] parameter
 * 3. Conditional Statements: Using if to check conditions
 * 4. Boolean Logic: Using logical conditions to control flow
 * 5. Array Length: Checking the number of command-line arguments
 * 6. StringBuilder: Efficiently building a string from multiple parts
 * 7. Looping Constructs: Using for loops to iterate through command-line arguments
 * 8. String Concatenation: Joining multiple strings with a delimiter (comma and space)
 */

/* Code Snippet for HelloAppUC4:
StringBuilder nameBuilder = new StringBuilder();
for (int i = 0; i < args.length; i++) {
    nameBuilder.append(args[i]);
    if (i < args.length - 1) {
        nameBuilder.append(", ");
    }
}
String name = nameBuilder.toString();  // Use the provided names
*/

public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
