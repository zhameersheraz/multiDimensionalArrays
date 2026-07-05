# Matrix 5 - Differences Counter

Reads two same-sized 2D integer matrices and counts the number of cells whose
values differ.

## Entry Point

`MatrixDifferencesCounter.java`

## How It Works

1. Ask the user for `rows` and `columns` (shared between the two matrices).
2. Read the first matrix element by element.
3. Read the second matrix element by element, with prompts tagged `(second)` so
   the user always knows which matrix they are typing into.
4. Walk both matrices in lockstep; increment `differences` whenever
   `matrixA[i][j] != matrixB[i][j]`.
5. Print the final count.

## Input Validation

- Non-integer tokens are rejected with a re-prompt.
- Non-positive dimensions are rejected with a re-prompt.

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

## Compile and Run

```bash
javac MatrixDifferencesCounter.java
java MatrixDifferencesCounter
```

## Note on Class Name

This file used to live at the repo root as `matrixDifferencesEncounter.java`
(lowercase first letter). It has been renamed to `MatrixDifferencesCounter.java`
to follow standard PascalCase class naming, matching the rest of this repo.