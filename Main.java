import java.io.IOException; // Importing the IOException class for handling input/output exceptions
import java.nio.file.Files; // Importing the Files class for file-related operations
import java.nio.file.Paths; // Importing the Paths class for representing file paths
import java.nio.file.StandardOpenOption; // Importing the StandardOpenOption class for specifying file open options
import java.util.List; // Importing the List interface for working with lists

public class Main {
    public static void main(String[] args) throws IOException {
        // Read all lines from the input file into a list of strings
        List<String> hexValues = Files.readAllLines(Paths.get("input.txt"));

        // Create a StringBuilder object to store the output
        StringBuilder output = new StringBuilder();

        // Iterate over the list of hexadecimal values
        for (String hex : hexValues) {
            // Remove colons from the hexadecimal value
            String hexWithoutColons = hex.replace(":", "");

            // Create a StringBuilder object to store the reversed hexadecimal value
            StringBuilder reversedHex = new StringBuilder();

            // Iterate over the characters in the hexadecimal value in pairs, starting from the second last character
            for (int i = hexWithoutColons.length() - 2; i >= 0; i -= 2) {
                // Extract a pair of characters from the original string and append them to the reversed hexadecimal value
                reversedHex.append(hexWithoutColons.substring(i, i + 2));
            }

            // Convert the reversed hexadecimal value to decimal
            int decimal = Integer.parseInt(reversedHex.toString(), 16);

            // Convert the decimal value to binary and pad with leading zeros
            String binary = String.format("%32s", Integer.toBinaryString(decimal)).replace(' ', '0');

            // Append the binary value to the output StringBuilder
            output.append("00000000000000000000000000000000").append(binary).append("\n");
        }

        // Write the output StringBuilder to the output file
        Files.write(Paths.get("output.txt"), output.toString().getBytes(), StandardOpenOption.CREATE);
    }
}
