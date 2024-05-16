# RPN Calculator

## Overview
This project is a Java-based Reverse Polish Notation (RPN) calculator. The calculator supports simple arithmetic operations (addition, subtraction, multiplication, division) and trigonometric functions. The program converts expressions from infix notation to RPN and evaluates them. The project also includes a detailed report explaining the implementation and use of the calculator.

## Features
- **Arithmetic Operations**: Supports addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
- **Trigonometric Functions**: Supports basic trigonometric functions like sine (`sin`), cosine (`cos`), and tangent (`tan`).
- **Infix to RPN Conversion**: Converts expressions from infix notation to Reverse Polish Notation.
- **Evaluation**: Evaluates the RPN expressions.

## Files
- `DETAILED_REPORT.md`: Detailed report explaining the implementation and functionality of the RPN calculator.
- `LICENSE`: License file for the project.
- `README.md`: This file, containing an overview and instructions for the project.
- `RPNCalculator.java`: The main Java file implementing the RPN calculator.

## How to Run
1. **Prerequisites**: Ensure you have Java installed on your machine.
2. **Compile**: Open a terminal and navigate to the project directory. Run the following command to compile the Java file:
   ```sh
   javac RPNCalculator.java
   ```
3. **Execute**: Run the following command to execute the program:
   ```sh
   java Main
   ```

## Examples of Infix Notation to Reverse Polish Notation
### Infix
- `A + B`
- `((1 + 2) / 3) ^ 4`
- `(1 + 2) * (3 / 4) ^ (5 + 6)`

### RPN
- `A B +`
- `1 2 + 3 / 4 ^`
- `1 2 + 3 4 / 5 6 + ^ *`

## Detailed Report
For a detailed explanation of the implementation, please refer to the `DETAILED_REPORT.md` file.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Author
**Dominick Ferro**
