# Matrix 1 - Input and Print

Reads a 2D integer matrix whose size is given by the user, then prints the matrix
back row by row.

## Entry Point

`DDArrayInputAndPrint.java`

## How It Works

1. Ask the user for `rows` and `columns`. Dimensions must be positive integers.
2. Read each element via standard input, prompting with the cell coordinates
   (`Element at [i][j]: `).
3. After reading, print the matrix using single-space-separated values per row.

## Input Validation

- Non-integer tokens (e.g. `abc`) are rejected with a re-prompt instead of crashing.
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
Elements of the array:
1 2 3
4 5 6
```

## Compile and Run

```bash
javac DDArrayInputAndPrint.java
java DDArrayInputAndPrint
```