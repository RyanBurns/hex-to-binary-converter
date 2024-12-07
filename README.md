# hex-to-binary-converter
A Java program that converts reversed hexadecimal values to 32-bit binary representations.

Project Title: Hex to Binary Converter
Description: This is a simple Java program that reads hexadecimal values from an input file, reverses the byte order of the hexadecimal values, converts them to decimal, then to binary, and outputs the result to an output file.

The program is designed for use cases where hexadecimal values (typically representing memory addresses, machine codes, or other low-level data) need to be processed and converted into a binary format with a specific byte order.

How It Works:
The program reads a file called input.txt which contains hexadecimal values (with or without colons).
For each line:
The colons are removed.
The order of the byte pairs is reversed.
The hexadecimal value is converted to a decimal value.
The decimal value is then converted to a 32-bit binary string.
The resulting binary values are written to an output file called output.txt.
The output binary string is prefixed with 00000000000000000000000000000000 to ensure it is always 32 bits long.

Prerequisites:
Java 8 or higher must be installed on your machine.
Basic understanding of hexadecimal, decimal, and binary conversions.
Installation:
Clone the repository to your local machine:

git clone https://github.com/<your-username>/hex-to-binary-converter.git
cd hex-to-binary-converter
Make sure you have Java installed. You can check this by running:

java -version
Compile and run the program:

javac Main.java
java Main
Usage:
Create an input.txt file in the same directory as the Java program, and add the hexadecimal values you want to convert. Each line should contain one hexadecimal value (with or without colons).

Example input.txt:

01:23:45:67
89:AB:CD:EF
Run the program. The output will be written to output.txt in the same directory.

Example output.txt:

00000000000000000000000000000000000000000000000001000111010001010010001100000001000001
00000000000000000000000000000000000000000000000011101111110011011010101110001000100001
Code Explanation:
Main.java:
File Input/Output:

The program uses Files.readAllLines() to read all lines from the input.txt file into a list of strings.
It uses Files.write() to write the output binary values to output.txt.
Processing Hexadecimal Values:

Each hexadecimal value is stripped of colons.
The order of the byte pairs is reversed.
The reversed hex string is then converted to decimal using Integer.parseInt() with base 16.
The decimal value is converted to a 32-bit binary string with leading zeros to ensure a consistent length of 32 bits.
Formatting Output:

The binary output is prefixed with 00000000000000000000000000000000 to represent the full 32-bit value.
Example:
Input (input.txt):
01:23:45:67
89:AB:CD:EF
Output (output.txt):
00000000000000000000000000000000000000000000000001000111010001010010001100000001000001
00000000000000000000000000000000000000000000000011101111110011011010101110001000100001
Contributing:
If you'd like to contribute to this project, feel free to fork the repository and submit a pull request with your changes. Please make sure to follow the code style and include tests for any new features or fixes.

License:
This project is licensed under the MIT License – see the LICENSE file for details.
