# Matrix 4 - Row Sum Calculator

Source: `Matrix4_RowSumCalculator/DDArrayRowSumCalculator.java`

## Goal

Read a 2D integer matrix and print the sum of each row.

## Design

Mirrors Matrix 1's input shape, but the per-row aggregation is `sum` instead
of `print`. A running `rowSum` is reset at the start of every row.

```
for i in 0..rows-1:
    rowSum = 0
    for j in 0..cols-1:
        rowSum += matrix[i][j]
    print rowSum
```

The original code had a `Scanner` named `calculator`; that has been renamed
to `SCANNER` for consistency with the rest of the lab.

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