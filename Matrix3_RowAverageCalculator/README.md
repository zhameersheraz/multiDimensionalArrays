# Matrix 3 - Row Average Calculator

Reads a 2D double matrix of user-chosen size and prints the average of each row,
formatted to two decimal places.

## Entry Point

`DDArrayRowAverageCalculator.java`

## How It Works

1. Ask the user for `rows` and `columns`. Dimensions must be positive integers.
2. Read each element as a `double`, prompting with the cell coordinates.
3. For each row, compute `rowSum / columns` and print it with `printf("Row %d: %.2f%n", ...)`.

## Input Validation

- Non-numeric tokens are rejected with a re-prompt.
- Non-positive dimensions are rejected with a re-prompt.

## Sample Run

```
Enter the number of rows: 2
Enter the number of columns: 3
Element at [0][0]: 1.0
Element at [0][1]: 2.0
Element at [0][2]: 3.0
Element at [1][0]: 4.0
Element at [1][1]: 5.0
Element at [1][2]: 6.0
Averages of each row:
Row 1: 2.00
Row 2: 5.00
```

## Compile and Run

```bash
javac DDArrayRowAverageCalculator.java
java DDArrayRowAverageCalculator
```