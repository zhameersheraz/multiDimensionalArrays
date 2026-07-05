# Matrix 5 - Differences Counter

Source: `Matrix5_DifferencesCounter/MatrixDifferencesCounter.java`

## Goal

Compare two same-sized 2D integer matrices and count how many cells differ.

## Design

A single `Scanner` is reused to fill two matrices. The shared
`readMatrix(rows, cols, label)` helper tags each prompt with `(first)` or
`(second)` so the user always knows which matrix they are typing into.

The compare pass is a single nested loop:

```
differences = 0
for i in 0..rows-1:
    for j in 0..cols-1:
        if matrixA[i][j] != matrixB[i][j]:
            differences++
print differences
```

## Renamed Class

The original file at the repo root was named `matrixDifferencesEncounter.java`
(lowercase first letter). It has been renamed to `MatrixDifferencesCounter.java`
to follow standard PascalCase class naming, matching the rest of this repo.

## Sample Run

```
Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the first array:
Element at [0][0] (first): 1
Element at [0][1] (first): 2
Element at [1][0] (first): 3
Element at [1][1] (first): 4
Enter the elements of the second array:
Element at [0][0] (second): 1
Element at [0][1] (second): 9
Element at [1][0] (second): 3
Element at [1][1] (second): 4
Number of differences between the two matrices: 1
```