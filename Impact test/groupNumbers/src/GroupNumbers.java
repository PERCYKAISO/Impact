import java.util.ArrayList;
import java.util.List;

//THis method t takes a list of integers and returns a string representation of the ranges of numbers in the list

public class GroupNumbers {


    public static String groupNumbers(List<Integer> numbers) {


        // Grouping a list of integers into ranges and return a string representation of the ranges
        List<String> ranges = new ArrayList<>();
        int start = numbers.get(0);
        int end = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num == end + 1) {
                end = num;
            } else {
                ranges.add(getRangeString(start, end));
                start = end = num;
            }
        }
        ranges.add(getRangeString(start, end));
        return String.join(",", ranges);
    }

     // Getting a string representation of a range of numbers
    private static String getRangeString(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }
}
