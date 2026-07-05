# Matrix 3 - Row Average Calculator

Source: `Matrix3_RowAverageCalculator/DDArrayRowAverageCalculator.java`

## Goal

Read a 2D double matrix and compute a per-row average.

## Design

Same input-validation pattern as Matrix 1, but the cell type is `double`, so
the helper is `readDouble` (backed by `Scanner.hasNextDouble`).

The average for row `i` is computed inline:

```
rowSum = sum(matrix[i][j] for j in 0..cols-1)
avg    = rowSum / cols
print "Row %d: %.2f%n", (i + 1), avg
```

Averaging in two decimals is done with `printf("%.2f")`, so the output is
stable regardless of the actual cell values.

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