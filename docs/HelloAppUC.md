1.UC1: Display "Hello World"

Description:The app displays "Hello World" on the console when executed. This is the most basic use case to demonstrate a simple Java application that outputs text to the console.

2.UC2: Display "Hello" with Command-Line Argument

Description:The app accepts a user's name as a command-line argument and displays a personalized greeting. This enhances the basic functionality of UC1 by allowing user input to customize the output.
3.UC3: Display "Hello" with Command-Line Argument or Default Message
Description :The app accepts a user's name as a command-line argument and displays a personalized greeting. If no name is provided, it defaults to "World". This use case combines the basic functionality from UC1 with the personalization from UC2, adding robustness through default handling.
4.UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
Description :The app accepts multiple names as command-line arguments and displays a personalized greeting for all names. If no names are provided, it defaults to "World". This use case extends the functionality of UC3 by allowing for multiple inputs and demonstrating how to handle arrays of arguments.
5.UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
Description :The app accepts zero or more command-line arguments and prints a greeting. It uses an enhanced for loop (for-each loop) to process multiple names. If no arguments are provided, it displays the default greeting: "Hello, World!".
6.UC6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter
Description :The app accepts zero or more command-line arguments and prints a greeting. It uses an enhanced for loop to process multiple names and the substring method to remove the trailing delimiter. If no arguments are provided, it displays the default greeting: "Hello, World!".
7.UC7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method or Default Message
Description:The app accepts zero or more command-line arguments and prints a greeting. It uses the String.join() method to efficiently concatenate multiple names with a specified delimiter. If no arguments are provided, it displays the default greeting: "Hello, World!".