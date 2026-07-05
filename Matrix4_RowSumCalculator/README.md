# Matrix 4 - Row Sum Calculator

Reads a 2D integer matrix of user-chosen size and prints the sum of each row.

## Entry Point

`DDArrayRowSumCalculator.java`

## How It Works

1. Ask the user for `rows` and `columns`. Dimensions must be positive integers.
2. Read each element via standard input, prompting with the cell coordinates.
3. For each row, accumulate `rowSum` and print it on its own line.

## Input Validation

- Non-integer tokens are rejected with a re-prompt.
- Non-positive dimensions are rejected with a re-prompt.

## Sample Run

```
Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the array:
Element at [0][0]: 1
Element at [0][1]: 2
Element at [0][2]: 3
Element at [1][0]: 4
Element at [1][1]: 5
Element at [1][2]: 6
Sum of each row:
6
15
```

## Compile and Run

```bash
javac DDArrayRowSumCalculator.java
java DDArrayRowSumCalculator
```