# Detailed Report

## Description
The program that I created is written in Java, which is why all classes of the io package are imported. I chose to write this simulator using Java as I am familiar with the language, and it is effective in handling computations in reverse polish notation. Functionality includes simple arithmetic operations (e.g., +, -, *, /), and simple trigonometric functions (e.g., sin, cos, tan). Grouping of expressions using parentheses is also a function. This program uses standard tools for creating and handling syntax analysis and parsing such as lex(1) and yacc(1). The Java util package was imported in order to access the collection of framework, collection classes related to date and time, utility classes, event model, etc. Yacc (Yet another compiler-compiler) is a computer program for the Unix operating system. It is a look ahead left-right parser generator. This generates a LALR parser based on a formal grammar. Lex is a computer program that generates lexical analyzers. Lex and Yacc are commonly used together.

## Examples of Infix notation to Reverse Polish Notation:
### Infix
- A + B
- ((1 + 2) / 3) ^ 4
- (1 + 2) * (3 / 4) ^ (5 + 6)

### RPN
- A B +
- 1 2 + 3 / 4 ^
- 1 2 + 3 4 / 5 6 + ^ *

Reverse Polish notation, which is also known as Polish postfix notation, is a mathematical notation in which operators follow operands, in contrast to Polish notation where operators precede their operands. RPN has been found to make faster calculations.

## Work Cited
1. Reverse Polish calculators do not need expressions to be parenthesized, which means fewer operations need to be entered to perform typical calculations.
    - Kasprzyk, D. M.; Drury, Colin G.; Bialas, W. F. (1979), "Human behaviour and performance in calculator use with Algebraic and Reverse Polish Notation", Ergonomics, 22 (9): 1011-1019, doi:10.1080/00140137908924675
    - [Reverse Polish Notation (Wikipedia)](https://en.wikipedia.org/wiki/Reverse_Polish_notation)
    - [Lex (Wikipedia)](https://en.wikipedia.org/wiki/Lex_(software))
    - [Yacc (Wikipedia)](https://en.wikipedia.org/wiki/Yacc)
    - [Bc (programming language) (Wikipedia)](https://en.wikipedia.org/wiki/Bc_(programming_language))

## Author
**Dominick Ferro**

## Date
12/13/2021
