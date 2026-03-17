/**
 * HelloApp – UC6 – Display "Hello" with Multiple Command-Line Arguments using
 * substring to Remove Trailing Delimiter
 *
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring to
 * remove trailing delimiter. The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user using
 * substring to remove the trailing delimiter.
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
=======
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
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Prachi Sharma
 * @version 6.0
 * @since UC1
 */

/**
 * Key Concepts for HelloApp UC6:
 * 1. Enhanced For Loop: A simplified syntax for iterating over arrays or collections
 *    without needing an index variable.
 * 2. StringBuilder: A mutable sequence of characters used for efficient string
 *    concatenation.
 * 3. String Manipulation: Using methods like substring() to modify strings after
 *    construction.
 * 4. Trailing Character Removal: Techniques to remove unwanted characters (like a
 *    comma and space) from the end of a string after building it.
 * 5. String Length: Understanding how to use the length() method to determine
 *    the size of a string and manipulate it accordingly.
 */

/* Sample Code for HelloApp UC6:
StringBuilder nameBuilder = new StringBuilder();
for (String name : args) {
    nameBuilder.append(name).append(", ");
}

if (nameBuilder.length() > 0) {
    name = nameBuilder.substring(0, nameBuilder.length() - 2); // Remove last ", "
}
*/

public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + name + "!");
    }
