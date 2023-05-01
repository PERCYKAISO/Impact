import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        try (// Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in)) {


            // allows user enter a list of numbers separated by commas
            System.out.print("Enter a list of numbers separated by commas: ");
            String input = scanner.nextLine();
            
            // Splits the input string into an array of strings
            String[] numberStrings = input.split(",");
            
            // Create a list to store the numbers
            List<Integer> numbers = new ArrayList<>();
            
            // Parsing the number of strings and adds them to the list
            for (String numberString : numberStrings) {
                int number = Integer.parseInt(numberString.trim());
                numbers.add(number);
            }
            
            // Call the groupNumbers method of the GroupNumbers class to group the numbers in the list into ranges
            String result = GroupNumbers.groupNumbers(numbers);

            // Print the result of the grouping operation
            System.out.println(result);


        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}
